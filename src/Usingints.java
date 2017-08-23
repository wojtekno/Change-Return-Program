// so I used int instead of double and than just divide it by 100 - and it worked :)
public class Usingints {
	static double[] money = { 20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1 };
	static int[] amount;
	static int moneyLength = money.length;
	static double cost;
	static double moneyYouGive;
	static double change;
	static double youHaveNow;

	static void returnChange() {
		amount = new int[moneyLength];
		change = (100 * moneyYouGive - 100 * cost);
		System.out.println(cost);
		System.out.println(moneyYouGive);
		System.out.println("You should get " + change / 100);
		for (int i = 0; i < moneyLength; i++) {
			while (change >= money[i]) {
				change -= money[i];
				amount[i] += 1;

			}

			if (amount[i] > 0) {
				System.out.print("You get " + amount[i] + " of " + money[i] / 100);

			}
			// here I show how many int you have so far - "100" in array = 1 in
			// reality
			if (money[i] == 100) {
				for (int j = 0; j <= i; j++) {
					youHaveNow += money[j] * amount[j];
				}
				System.out.print("now you have = " + youHaveNow / 100);
			}
			if (amount[i] > 0 || money[i] == 100) {
				System.out.println();
			}

		}
		// summing up once again for user
		youHaveNow = 0;
		for (int i = 0; i < moneyLength; i++) {
			youHaveNow += money[i] * amount[i];
		}
		System.out.println("So in total you got " + youHaveNow / 100);
	}
}
