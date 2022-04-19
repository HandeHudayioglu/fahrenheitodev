package com.bilgeadam.boost.java.course02.lesson007;

import java.util.Scanner;

public class ArithmeticExamples {

	public static void main(String[] args) {
		
		double x,y,z;
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println("Lütfen bir sayı giriniz:");
//		
//		x = scanner.nextInt();

//	    System.out.println(x+1);
//		Scanner scanner2 = new Scanner(System.in);
//		
//		System.out.println("Lütfen 2. sayıyı giriniz:");
//		
//		x=scanner.nextInt();
//		System.out.println(x);
	    
	    Scanner scanner = new Scanner (System.in);
	    System.out.println("Lütfen ilk sayıyı giriniz:");
	    x = scanner.nextInt();
	    System.out.println("Lütfen ikinci sayıyı giriniz:");
	    y=scanner.nextInt();
	    System.out.println("Lütfen üçüncü sayıyı giriniz");
	    z=scanner.nextInt();
	    
	    System.out.println("Sonuç:"+x*(y+z));
	    		
	    	

//        System.out.println("Bölüm: "+ x/y);
//	    System.out.println("Kalan: "+ x%y);

		
		
		
	}

}
