package myProject;

import java.util.Scanner;

public class Handles {
	public static void main(String[]args) {
	
	
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the value");
	while(true) {
	 String a=sc.next();
	 
	 
	 if(a.equals("abc"))
	 {
		 //throw new Sample1("catch");
		// System.out.println("Valid"); }
	// else{throw new Sample1("catch");}
		 try {System.out.println("Valid");}
		 catch(Exception e)
		 { //System.out.println(a1);
		 throw new Sample1("catch"); 
	}}
		 else
		 {
			 throw new Sample1("catch");
		 }
	 }}}

