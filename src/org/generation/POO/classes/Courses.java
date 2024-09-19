package org.generation.POO.classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Courses {
	String courseName;
	String professorName;
	int year;
	int grade;
	
    List<Student> enrolledStudents = new ArrayList<>(  );
    
	public Courses(String courseName, String professorName, int year) {
		this.courseName= courseName;
		this.professorName= professorName;
		this.year=year;
	}//courses
	

	
//	   public void enroll(Student student){
//		      enrolledStudents.add(student);
//		   }
//	ENROLL ALL STUDENTS
	 public void enroll(Student[] students){
	      //TODO add all the students to the collection
		 for (Student student : students) {
			enrolledStudents.add(student);
		}//foreach para agregar estudiantes dentro del arreglo 
	   }//arreglo students

		   public void unEnroll(Student student){
			   enrolledStudents.remove(student);
		   }//unenroll

		   public int countStudents(){
			   return enrolledStudents.size();
			  }//contar estudiantes facilito
		   
		   public int bestGrade(){	        
				    if (enrolledStudents.isEmpty()) {
				        return 0; // No students enrolled
				    }
				    int maxGrade = enrolledStudents.get(0).getGrade();
				    for (Student student : enrolledStudents) {
				        if (student.getGrade() > maxGrade) {
				            maxGrade = student.getGrade();
				        }
				    }//foreach para ir guardando el grade mas grande 
				    return maxGrade;
				}//bestGrade aiura espero k sirva
		 
		    public List<Student> getEnrolledStudents(){
		        return enrolledStudents;
		    }//este creo no lo necesito lol
 	public String toString() {
		return "courseName=" + courseName + ", professorName=" + professorName + ", year=" + year + ", Students enrolled= " + enrolledStudents;
	}
	
}//class Courses
