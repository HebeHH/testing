import java.util.*;
/**
 * People involved in the work
 *
 *
 * @see Task
 *
 * @author Hebe
 */
public class User extends XMLizable {
	private int id;
	private String name;

	public User(int var1, String var2) {
		this.id = var1;
		this.name = var2;
	}
	/**
	 * Get a string indentation given the number of indents
	 *
	 * @param var0 The number of tabs
	 * @param var1 The number of spaces in a tab
	 *
	 * @return var2 the indentation in spaces
	 */
	public static String repeat(int var0, String var1) {
		String var2 = "";

		for(int var3 = 0; var3 < var0; ++var3) {
			var2 = var2 + var1;
		}

		return var2;
	}
	/**
	 * Get XML representing the planner
	 *
	 * @param tabs The indentation of this project in the xml
	 * @return xml a String holding the XML representing this task
	 */
	public String getXML(int tabs) {
		String var10000 = repeat(tabs * 4, " ");
		String xml = var10000 + "<user id = " + Integer.toString(this.id) + " name =  '" + this.name + "'><\\user>\n";
		return xml;
	}
}