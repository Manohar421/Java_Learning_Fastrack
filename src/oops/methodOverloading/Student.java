package oops.methodOverloading;

public class Student {
	private int rollNum;
	private String name;

	public Student(int rollNum, String name) {
		super();
		this.rollNum = rollNum;
		this.name = name;
	}

	public int getRollNum() {
		return rollNum;
	}

	public void setRollNum(int rollNum) {
		this.rollNum = rollNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void printStudent() {
		System.out.println(this.getRollNum());
		System.out.println(this.getName());
		System.out.println("-----------------------");
	}

}
