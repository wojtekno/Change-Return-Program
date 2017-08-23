import java.text.DecimalFormat;

// I tried to make math operations on double - I couldn't make the numbers to match what I wanted
public class Math2 {
	double[][] money = { { 200, 100, 50, 20, 10, 5, 2, 1, 0.5, 0.2, 0.1, 0.05, 0.02, 0.01 },
			{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 } };
	int moneyLength = money[0].length;
	double cost;
	double moneyYouGive;
	double change;

	void returnChange() {
		change = Double.parseDouble(new DecimalFormat("##.##").format(moneyYouGive - cost));
		System.out.println(change);
		for (int i = 0; i < moneyLength; i++) {
			money[1][i] = (int) (change / money[0][i]);
			change -= Double.parseDouble(new DecimalFormat("##.##").format(money[0][i] * money[1][i]));
			System.out.println(change);
			if (money[1][i] != 0 && money[0][i] < 1) {
				System.out.println((int) money[1][i] + " of " + (int) (money[0][i] * 100) + "-cents");
			} else if (money[1][i] != 0) {
				System.out.println((int) money[1][i] + " of " + (int) money[0][i] + "-dollars");
			}
		}
		System.out.println(money[0][2] + " " + money[1][1]);
	}

}
// wystarczy wiedzie cnominaly dostepne i ile wydać, uzyc while