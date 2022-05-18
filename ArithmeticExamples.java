package com.bilgeadam.boost.java.course02.lesson007;

import java.util.Scanner;

public class ArithmeticExamples {

	public static void main(String[] args) {
		
		double x,y,z;
		
	    Scanner scanner = new Scanner (System.in);
	    System.out.println("Please enter the first number:");
	    x = scanner.nextInt();
	    System.out.println("Please enter the second numbaer:");
	    y=scanner.nextInt();
	    System.out.println("Please enter the third numbaer:");
	    z=scanner.nextInt();
	    
	    System.out.println("Sonuç:"+x*(y+z));
	    		
	    	

//         System.out.println("Bölüm: "+ x/y);
//	    System.out.println("Kalan: "+ x%y);

		
		
		
	}

}
