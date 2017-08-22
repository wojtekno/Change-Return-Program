
public class Usingints {
	static double[] money = { 20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1 };
	static int[] amount;
	static int moneyLength = money.length;
	static double cost;
	static double moneyYouGive;
	static double change;

	static void returnChange() {
		amount = new int[moneyLength];
		change = (100 * moneyYouGive - 100 * cost);
		System.out.println(cost); // i print it to find out how the change acts
		System.out.println(moneyYouGive); // i print it to find out how the
											// change acts
		System.out.println("You should get " + change / 100); // i print it to
																// find
		// out how the change
		// acts
		for (int i = 0; i < moneyLength; i++) {
			while (change >= money[i]) {
//				System.out.println("now change is: " + change / 100); // i print
																		// it to
				// find out how
				// the change
				// acts
				change -= money[i];
//				System.out.println("and now it's:" + change / 100); // i print
																	// it to
				// find out how
				// the change
				// acts
				amount[i] += 1;

			}
			// amount[i] -= 1;
			// change += ((int)100 *money[i]) / 100;
			if (amount[i] > 0) {
				System.out.println("You get " + amount[i] + " of " + money[i] / 100);
			}
//			if (money[i] == 100 ) {
//				System.out.print(" = " + (( moneyYouGive) - change));
//			}
//			System.out.println();

		}
	}
}
