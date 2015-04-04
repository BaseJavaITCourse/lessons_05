package lecture_9_Incapsulation.task_03;

public class Employee {
	private String name = "Anna";
	private int age = 25;
	private double salary = 2000.00;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		// logic
		this.name = name;
		System.out.println();
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
