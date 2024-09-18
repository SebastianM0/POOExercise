package org.generation.POO.classes;

import java.util.ArrayList;
import java.util.List;

public class Courses {
	String courseName;
	String professorName;
	int year;
    List<Student> enrolledStudents = new ArrayList<>(  );

	
	public Courses(String courseName, String professorName, int year) {
		this.courseName= courseName;
		this.professorName= professorName;
		this.year=year;
	}//courses
	
	Courses art = new Courses("Art", "Bob", 1);
	Courses bio = new Courses("Biology", "Martha", 2);
	Courses chem = new Courses("Chemistry", "John", 2);
	Courses phys = new Courses("Physics", "Jeimmy", 3);
	Courses math = new Courses("Mathematics", "Frank", 3);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
 	public String toString() {
		return "courseName=" + courseName + ", professorName=" + professorName + ", year=" + year + "Students enrolled= " + enrolledStudents;
	}
	
}//class Courses
