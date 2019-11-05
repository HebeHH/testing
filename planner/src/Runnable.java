import java.util.*;

public class Runnable {
	private int id = 0;

	private int getID() {
		id += 1;
		return id;
	}
	
	public static void main(String [ ] args) {

		User u1 = new User(1, "Bob");
		User u2 = new User(2, "Alice");
		User u3 = new User(3, "Kelly");

		Project p1 = new Project(1, "Homework", "it's tricky", new Date());
		Project p2 = new Project(2, "Internship", "SQL", new Date());

		Task t1 = new Task(1, "Lab", "github", new Date());
		Task t2 = new Task(1, "Quiz", "first chapter", new Date());
		Task t3 = new Task(1, "Database", "create RDS", new Date());

		t1.addWorker(u1);
		t1.addWorker(u2);
		t2.addWorker(u3);
		t3.addWorker(u2);
		t3.addWorker(u3);

		p1.addTask(t1);
		p1.addTask(t2);
		p2.addTask(t3);

		Planner pl1 = new Planner();
		pl1.addProject(p1);
		pl1.addProject(p2);

		String xml = pl1.getXML(0);
		System.out.println(xml);

		pl1.writeXML("Planner1.xml");
	}
}