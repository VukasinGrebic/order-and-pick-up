package order_and_pick_up;

import java.util.Scanner;

public class PastaBar {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		String[] phoneNumbers = { "0631111111", "063222222", "063333333", "064444444", "065555555", "066666666" };

		String[] ingredients = { "MACARONI", "SPAGHETTI", "BOLOGNESE", "TURKEY", "BEEF JERKY", "BACON", "CHICKEN",
				"QUATRO FORMAGGI", "SMOKED CHEESE", "PARMESAN", "SOUR CREAM", "PESTO", "NAPOLITANA", "VEGETABLE MIX",
				"MUSHROOMS", "BOX" };

		int[] prices = { 50, 60, 120, 120, 140, 100, 100, 100, 80, 50, 80, 80, 80, 50, 50, 20 };

		System.out.println("Please order your pasta");

		String ingredientName = " ";

		int price = 0;

		while (!ingredientName.equals("ORDER")) {

			System.out.print("Choose your ingredients: ");

			String ingredientName1 = s.nextLine();

			ingredientName = ingredientName1;
			ingredientName = ingredientName.toUpperCase();
			
			if (ingredientName.equals("ORDER")) {
				System.out.print("Your order is ");
			} else {
				int id = findIngredient(ingredients, ingredientName);
				price = price + prices[id];
			}

		}

		System.out.print(price + " RSD");

	}

	public static int findIngredient(String[] ingredients, String ingredientName) {
		int ingredientNumber = 0;

		for (int i = 0; i < ingredients.length; i++) {

			if (ingredientName.equals(ingredients[i])) {
				ingredientNumber = i;
			}
		}

		return ingredientNumber;
	}
}
