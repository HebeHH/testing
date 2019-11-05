import java.util.*;

/**
 * Project of a Planner.
 *
 * Projects is to Planners as Tasks are to Projects. An intermediary
 * collection of things to do, grouped by higher purpose.
 *
 *
 * @see Planner
 * @see Task
 *
 * @author Hebe
 */
public class Project extends XMLizable {
	private int id;
	private String name;
	private String description;
	private Date due_date;
	private Date start_date;
	private ArrayList<Task> tasks = new ArrayList<Task>();

	public Project(int projectid, String projectname, String projectdescription, Date projectdue_date) {
		id = projectid;
		name = projectname;
		description = projectdescription;
		due_date = projectdue_date;
		start_date = new Date();
	}

	/**
	 * Add new tasks to the project to flesh out what you must do
	 *
	 * @param newtask The name of a Task
	 */
	public void addTask(Task newtask) {
		this.tasks.add(newtask);
	}

	/**
	 * Remove tasks from Planner with a sigh of relief
	 *
	 * @param oldtask The name of a Task
	 */
	public void dropTask(Task oldtask) {
		this.tasks.add(oldtask);
	}


	/**
	 * Get XML representing the planner
	 *
	 * @param tabs The indentation of this project in the xml
	 * @return xml a String holding the XML representing this task
	 */
	public String getXML(int tabs) {
		String xml = User.repeat(tabs * 4, " ") + "<project id = " + Integer.toString(this.id) + " name =  '" + this.name + "'>\n";
		for (Task task : tasks) {
			xml += task.getXML(tabs + 1);
		}
		xml += User.repeat(tabs * 4, " ") + "<\\project>\n";

		return xml;
	}
}