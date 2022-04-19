package com.bilgeadam.boost.java.course02.lesson007;

import javax.swing.JOptionPane;

public class PrintExample {

	public static void main(String[] args) {
		
		String isim= "Hande" ;
		String soyisim= "Hudayioglu" ;
		
		System.out.println(isim+" "+soyisim);
		System.out.print(isim+" "+soyisim);
		JOptionPane.showMessageDialog(null, "Oops.Something went wrong.", "System error", 1);
		
	}

}
