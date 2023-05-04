package org.lessons.java;

public class CibiPreferiti {

	public static void main(String[] args) {
		
		String[] bestFood = {
				"cibo1",
				"cibo2",
				"cibo3",
				"cibo4",
				"cibo5",
				"cibo6"
		};
		
		int bestFoodLng = bestFood.length;
		String topFood = bestFood[0];
		String worstFood = bestFood[bestFoodLng - 1];
		
		System.out.println("Numero cibi preferiti: " + bestFoodLng);
		System.out.println("-----------------------------");
		System.out.println("Cibo preferito: " + topFood);
		System.out.println("Cibo (quasi) preferito: " + worstFood);
		
		// BONUS: VERSIONE 1
//		System.out.println("-----------------------------");
//		String medianFood = bestFood[bestFoodLng / 2];
//		System.out.println("Cibo mediano: " + medianFood);
		
		// BONUS: VERSIONE 2
		System.out.println("-----------------------------");
		
		int medianIndex = bestFoodLng / 2;
		String medianFoodLow = bestFood[medianIndex];
		System.out.println("Cibo mediano low: " + medianFoodLow);
		
		if (bestFoodLng % 2 == 0) {
			
			String medianFoodHeigh = bestFood[medianIndex - 1];
			System.out.println("Cibo mediano heigh: " + medianFoodHeigh);			
		}
	}
}
