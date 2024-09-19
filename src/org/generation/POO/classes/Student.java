package org.generation.POO.classes;

public class Student {
    String firstName;
    String lastName;
    int registration;
    int grade;
    int year;
    

//CONSTRUCTORES    
	public Student (String firstName, String lastName, int registration, int grade, int year) {
		this.firstName= firstName.toUpperCase();
		this.lastName= lastName.toUpperCase();
		this.registration= registration;
		this.grade=grade;
		this.year= (year>=1)?year:1;
	}//constructor 1
	
	public Student(String firstName, String lastName, int registration) {
		this(firstName, lastName, registration, 50, 1);
	}//constructor 2

	public Student(String firstName, String lastName) {
	this(firstName, lastName, 0000);
	}//constrcutor 3
    
    
	
  //METODOS PARA STUDENT
    public String printFullName(){
        return firstName + " " +  lastName;
     }//printFullName

    
     public boolean isApproved(){
    	  if(grade>=60) {
    		  return true;
    	  }else {
      	 	return false;
    	  }//ifelse
    	 }//is Approved

     
     public String changeYearIfApproved(){
    	 if (isApproved() == true) {
    		 year=year+1;
    		 System.out.println("Congratulations, you passed to:");
    	 }else {
    		 System.out.println("You didnt pass :C, you stay in: ");
    	 }//ifelse
		return year + " year";
     }//changeYearIfApproved

     public int getGrade() {
         return grade;
     }//getGrade
     
 	public String toString() {
		return "firstName=" + firstName + ", lastName=" + lastName + ", registration=" + registration + ", grade=" + grade + ", year=" + year + "||";
	}//toString
}//class Student