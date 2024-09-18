package org.generation.POO;
import org.generation.POO.classes.*;
public class Main {
	public static void main(String[] args) {
		
		Student Sebas= new Student("Sebastian", "Moran", 2811, 50, 1);
		Student Emma= new Student("Emmanuel", "Aldama",2594, 60, 1);
		Student Diego= new Student("Diego", "Ramirez", 0105,70,2);
		Student Perla= new Student("Perla","Manterola", 7700, 80, 3);
		System.out.println(Sebas);
		
		Courses art = new Courses("Art", "Bob", 1);
		Courses bio = new Courses("Biology", "Martha", 2);
		Courses chem = new Courses("Chemistry", "John", 2);
		Courses phys = new Courses("Physics", "Jeimmy", 3);
		Courses math = new Courses("Mathematics", "Frank", 3);
		


		
		math.enroll(Sebas);
		System.out.println(math.countStudents());
		System.out.println(math);
		
		
	}//main
}//class main

