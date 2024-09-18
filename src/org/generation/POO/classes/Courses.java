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
	

	
	   public void enroll(Student student){
		      enrolledStudents.add(student);
		   }

		   public void unEnroll(Student student){
			   enrolledStudents.remove(student);
		   }

		   public int countStudents(){
			   int total = enrolledStudents.size();
			   return total;
		   }
		   
		   public int bestGrade(){
		       //TODO implement
		       return 0;
		   }
	
	
		    public List<Student> getEnrolledStudents(){
		        return enrolledStudents;
		    }
 	public String toString() {
		return "courseName=" + courseName + ", professorName=" + professorName + ", year=" + year + ", Students enrolled= " + enrolledStudents;
	}
	
}//class Courses
