// program counts how much change you should get 
// depending the cost of your purchase and money you give
// and shows the smallest amount of paper/coins to do it

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// Math math = new Math();
		// Math2 m;
		// m = new Math2();

		// System.out.println("How much do you have to pay?");
		// Math3.cost = scan.nextDouble();
		// System.out.println("How much you give?");
		// Math3.moneyYouGive = scan.nextDouble();
		// Math3.returnChange();

		// operating on double didn't work out
		// so I used int
		System.out.println("How much do you have to pay?");
		Usingints.cost = scan.nextDouble();
		System.out.println("How much you give?");
		Usingints.moneyYouGive = scan.nextDouble();
		Usingints.returnChange();
	}

}
