package com.bilgeadam.boost.java.course02.lesson007;

import java.util.Scanner;

public class fahrenheitodev {

	public static void main(String[] args) {
		
		
		double x ;
		Scanner scanner = new Scanner (System.in);
		System.out.print("Fahrenheit: ");
		x = scanner.nextInt();
		System.out.println("Celcius: "+ (x-32)/1.8);
		

	}

}
