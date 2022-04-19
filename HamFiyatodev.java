package com.bilgeadam.boost.java.course02.lesson007;

import java.util.Scanner;

public class HamFiyatodev {

	public static void main(String[] args) {
		
		double x,y,z ; 
		

	
		
		Scanner satisFiyatı = new Scanner (System.in);
	    System.out.print("Lütfen satış fiyatını giriniz:");
	    x = satisFiyatı.nextInt();
	    y=(x*100)/(100+18); // KDV siz fiyat
	    z=(y*100)/(100+15); //Ham fiyat
	    System.out.println("KDV'siz Fiyat: "+y);
	    System.out.println("Ham Fiyat: " +z);

	}

}
