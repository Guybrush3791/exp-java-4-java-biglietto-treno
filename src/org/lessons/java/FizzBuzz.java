package org.lessons.java;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quanti valori vuoi stampare?");
		int valueCount = sc.nextInt();
		
		sc.close();
		
		for (int x=1;x<=valueCount;x++) {
			
			if (x % 3 == 0 && x % 5 == 0) {
				
				System.out.println("FizzBuzz");
			} else if (x % 3 == 0) {
				
				System.out.println("Fizz");
			} else if (x % 5 == 0) {
				
				System.out.println("Buzz");
			} else {
				
				System.out.println(x);
			}
			
		}
	}
}
