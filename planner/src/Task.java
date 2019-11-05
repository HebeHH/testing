import java.util.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

enum Status {
  NEW,
  INPROGRESS,
  COMPLETE
}
/**
 * Atomic Work Unit
 *
 * Tasks are the smallest unit of work for a Planner
 * They are grouped into Projects
 * Tasks contain information and the requirements,
 * timing and stage of the work to do.
 *
 *
 * @see Project
 *
 * @author Hebe
 */
public class Task extends XMLizable{
	private int id;
	private String name;
	private String description;
	private Date due_date;
	private Date start_date;
	private Status stage;
	private ArrayList<User> workers = new ArrayList<User>();

	public Task(int taskid, String taskname, String taskdescription, Date taskdue_date) {
		id = taskid;
		name = taskname;
		description = taskdescription;
		due_date = taskdue_date;
		start_date = new Date();
		stage = Status.NEW;
	}


	/**
	 * Get XML representing the planner
	 *
	 * @param newworker somebody else who's time shall be sacrificed in the name of Task
	 */
	public void addWorker(User newworker) {
		this.workers.add(newworker);
	}



	public String getXML(int tabs) {
		String xml = User.repeat(tabs * 4, " ")+ "<task id = " + Integer.toString(this.id) + " name =  '" + this.name + "'>\n";
		for (User worker : workers) {
			xml += worker.getXML(tabs + 1);
		}
		xml += User.repeat(tabs * 4, " ") + "<\\task>\n";

		return xml;
	}

	class TaskCard extends Panel {

	}
}

