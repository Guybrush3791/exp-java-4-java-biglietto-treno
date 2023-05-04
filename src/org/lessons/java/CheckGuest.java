package org.lessons.java;

import java.util.Scanner;

public class CheckGuest {

	public static void main(String[] args) {
	
		String[] guestList = {
			    "Dua Lipa",
			    "Paris Hilton",
			    "Manuel Agnelli",
			    "J-Ax",
			    "Francesco Totti",
			    "Ilary Blasi",
			    "Bebe Vio",
			    "Luis",
			    "Pardis Zarei",
			    "Martina Maccherone",
			    "Rachel Zeilic"
			};
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Dimmi il tuo nome:");
		String name = sc.nextLine();
		sc.close();
			
//		// VERSIONE TOP: FOR
		for (int x=0;x<guestList.length;x++) {
			
			String guest = guestList[x];
			
			if (name.equals(guest)) {
				
				System.out.println("Ok, puoi entrare");
				return;
			}
		}
		
		System.out.println("Ok, quella e' la porta. Prendila.");
		
//		// VERSION TOP: WHILE
//		int x = 0;
//		while (x<guestList.length) {
//			
//			String guest = guestList[x++];
//			
//			if (name.equals(guest)) {
//				
//				System.out.println("Ok, puoi entrare");
//				return;
//			}
//		}
//		
//		System.out.println("Ok, quella e' la porta. Prendila.");
		
//		// VERSIONE BOOLEANO
//		boolean finded = false;
//		for (int x=0;x<guestList.length;x++) {
//			
//			String guest = guestList[x];
//			
//			if (name.equals(guest)) {
//				
//				finded = true;
//			}
//		}
//		
//		if (finded) {
//			
//			System.out.println("Ok, puoi entrare");
//		} else {
//			
//			System.out.println("Ok, quella e' la porta. Prendila.");
//		}
	}
}
