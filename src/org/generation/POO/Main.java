package org.generation.POO;
import org.generation.POO.classes.*;
public class Main {
	public static void main(String[] args) {
		
		Student Sebas= new Student("Sebastian", "Moran", 2811, 50, 1);
		Student Emma= new Student("Emmanuel", "Aldama",2594, 60, 1);
		Student Diego= new Student("Diego", "Ramirez", 0105,70,1);
		Student Perla= new Student("Perla","Manterola", 7700, 80, 1);
		Student[] studentsEnrolled = {Sebas,Emma,Diego,Perla};
		
		Courses math = new Courses("Mathematics", "Frank", 1);
		
		
		
		System.out.println("=====Info Student========");
		System.out.println(Sebas);
		
////Aqui agregamos a 2 estudiantes a la clase de math 
//		math.enroll(Sebas);
//		math.enroll(Perla);
		
		//Ahora se agrega el arreglo de estudiantes
		
		math.enroll(studentsEnrolled);
		System.out.println("======Count Students=======");
		System.out.println(math.countStudents());
		System.out.println("======Math Course=======");
		System.out.println(math);
		System.out.println("======Best Grade=======");
		System.out.println(math.bestGrade());
		
		
	}//main
}//class main

