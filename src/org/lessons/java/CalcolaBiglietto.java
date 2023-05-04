package org.lessons.java;

import java.util.Scanner;

public class CalcolaBiglietto {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quanti chilometri devi percorrere?");
		int km = sc.nextInt();
		
		System.out.println("Quanti anni hai?");
		int year = sc.nextInt();
		
		System.out.println("km: " + km);
		System.out.println("year: " + year);
		
		int totPrice = km * 21;
		System.out.println("partial price: " + totPrice);
		
		if (year < 18) {
			
			totPrice = totPrice / 100 * 80;
		} else if (year > 65) {
			
			totPrice = totPrice / 100 * 60;
		}
		
		float finalPrice = totPrice / 100f;
		System.out.println(
				"final price: " 
				+ String.format("%.2f", finalPrice)
				+ "E"
			);
		
		sc.close();
	}
}
