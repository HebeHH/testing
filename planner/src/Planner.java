import java.util.*;
import java.io.FileWriter;
/**
 * Planner to keep track of work, deadline and things to do
 *
 *
 * @see Project
 * @see Task
 * @see User
 *
 * @author Hebe
 */
public class Planner extends XMLizable {
	private ArrayList<Project> projects = new ArrayList<Project>();

	public Planner() {}

	public void addProject(Project newproject) {
		this.projects.add(newproject);
	}
	public void dropProject(Project oldproject) {
		this.projects.remove(oldproject);
	}


	/**
	 * Get XML representing the planner
	 *
	 * @param tabs The indentation of this project in the xml
	 * @return xml a String holding the XML representing this task
	 */
	public String getXML(int tabs) {
		String xml = User.repeat(tabs * 4, " ") + "<planner>\n";
		for (Project project : projects) {
			xml += project.getXML(tabs + 1);
		}
		xml += User.repeat(tabs * 4, " ") + "<\\planner>\n";

		return xml;
	}

	/**
	 * This saves the Planner to a file as XML
	 *
	 * @param filename the file to write to
	 */
	public void writeXML(String filename) {
		try{    
           FileWriter fw=new FileWriter(filename);   
           fw.write(this.getXML(0));    
           fw.close();    
          } catch (Exception e) { System.out.println(e); }    
          System.out.println("Success...");   
	}
}
