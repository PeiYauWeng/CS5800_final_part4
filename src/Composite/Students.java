package Composite;

import java.util.ArrayList;
//import java.util.List;

public class Students {
	private String name;
	private String major;
	private String grade;
	private ArrayList<Students> teammate;
	
	public Students(String name, String major, String grade) {
		this.name = name;
		this.major = major;
		this.grade = grade;
		teammate = new ArrayList<Students>();
	}
	
	public void addTeammate(Students students) {
		teammate.add(students);
	}
	
	public void kickOutTeammate(Students students) {
		teammate.remove(students);
	}
	
	public ArrayList<Students> getTeammate(){
		return teammate;
	}
	
	public String toString() {
		return "Name: "+this.name+", Major: "+this.major+", Grade: "+this.grade;
	}
}
