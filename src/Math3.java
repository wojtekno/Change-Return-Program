// here I tried again with easier algoryth - still didn't work operating on double
public class Math3 {
	static double[] money = { 200, 100, 50, 20, 10, 5, 2, 1, 0.5, 0.2, 0.1, 0.05, 0.02, 0.01 };
	static int[] amount;
	static int moneyLength = money.length;
	static double cost;
	static double moneyYouGive;
	static double change;

	static void returnChange() {
		amount = new int[moneyLength];
		change = (100 * moneyYouGive - 100 * cost) / 100;
		System.out.println(cost); // i print it to find out how the change acts
		System.out.println(moneyYouGive); // i print it to find out how the
											// change acts
		System.out.println("You should get " + change); // i print it to find
														// out how the change
														// acts
		for (int i = 0; i < moneyLength; i++) {
			while (change >= money[i]) {
				System.out.println("now change is: " + change); // i print it to
																// find out how
																// the change
																// acts
				change -= ((int) 100 * money[i]) / 100;
				System.out.println("and now it's:" + change); // i print it to
																// find out how
																// the change
																// acts
				amount[i] += 1;

			}
			// amount[i] -= 1;
			// change += ((int)100 *money[i]) / 100;
			if (amount[i] > 0) {
				System.out.println("You get " + amount[i] + " of " + money[i]);
			}

		}
	}

}
