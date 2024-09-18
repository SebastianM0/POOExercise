package org.generation.POO;
import org.generation.POO.classes.*;
public class Main {
	public static void main(String[] args) {
		
		Student Sebas= new Student("Sebastian", "Moran", 2811, 50, 1);

		System.out.println(Sebas);
		System.out.println(Sebas.printFullName());
		System.out.println(Sebas.isApproved());
		System.out.println(Sebas.changeYearIfApproved());
	}//main
}//class main

