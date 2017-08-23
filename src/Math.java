
// first attempt, long way through typing! anyway didn't work due to double usage

import java.text.DecimalFormat;

public class Math {
	double moneyGiven;
	double cost;

	void changeReturn() {
		double change = moneyGiven - cost;
		double changeM = Double.parseDouble(new DecimalFormat("##.##").format(change));
		int twoHundreds = (int) changeM / 200;
		double a = Double.parseDouble(new DecimalFormat("##.##").format((changeM - (200 * twoHundreds))));
		System.out.println(a);
		int hundreds = (int) (changeM - (200 * twoHundreds)) / 100;

		int fifties = (int) (changeM - (200 * twoHundreds) - (100 * hundreds)) / 50;
		int twenties = (int) (changeM - (200 * twoHundreds) - (100 * hundreds) - (50 * fifties)) / 20;
		int tenners = (int) (changeM - (200 * twoHundreds) - (100 * hundreds) - (50 * fifties) - (20 * twenties)) / 10;
		int fivers = (int) (changeM - (200 * twoHundreds) - (100 * hundreds) - (50 * fifties) - (20 * twenties)
				- (10 * tenners)) / 5;
		int twos = (int) (changeM - (200 * twoHundreds) - (100 * hundreds) - (50 * fifties) - (20 * twenties)
				- (10 * tenners) - (5 * fivers)) / 2;
		int dollars = (int) (changeM - (200 * twoHundreds) - (100 * hundreds) - (50 * fifties) - (20 * twenties)
				- (10 * tenners) - (5 * fivers) - (2 * twos)) / 1;
		double b = Double.parseDouble(new DecimalFormat("##.##").format((changeM - (200 * twoHundreds)
				- (100 * hundreds) - (50 * fifties) - (20 * twenties) - (10 * tenners) - (5 * fivers) - (2 * twos))));
		System.out.println(b);
		// jak to ugryzc?
		double changeOne = changeM - (200 * twoHundreds) - (100 * hundreds) - (50 * fifties) - (20 * twenties)
				- (10 * tenners) - (5 * fivers) - (2 * twos) - (1 * dollars);
		double changeOneM = Double.parseDouble(new DecimalFormat("##.##").format(changeOne));
		int fiftyCents = (int) (changeOneM / 0.5);
		b = changeOneM;
		System.out.println(b);
		int twentyCents = (int) ((changeOneM - (0.5 * fiftyCents)) / 0.2);
		int tenCents = (int) ((changeOneM - (0.5 * fiftyCents) - (0.2 * twentyCents)) / 0.1);
		int fiveCents = (int) ((changeOneM - (0.5 * fiftyCents) - (0.2 * twentyCents) - (0.1 * tenCents)) / 0.05);
		int twoCents = (int) ((changeOneM - (0.5 * fiftyCents) - (0.2 * twentyCents) - (0.1 * tenCents)
				- (0.05 * fiveCents)) / 0.02);
		double changeTwo = (changeOneM - (0.5 * fiftyCents) - (0.2 * twentyCents) - (0.1 * tenCents)
				- (0.05 * fiveCents) - (0.02 * twoCents));
		double changeTwoM = Double.parseDouble(new DecimalFormat("##.##").format(changeTwo));
		int oneCents = (int) ((changeOneM - (0.5 * fiftyCents) - (0.2 * twentyCents) - (0.1 * tenCents)
				- (0.05 * fiveCents) - (0.02 * twoCents)) / 0.01);
		System.out.println(changeOne + " " + changeOneM);
		System.out.println(changeTwo + " " + changeTwoM);

		// jak to usprawnic zeby najpierw zrobilo to co powinno sie wydarzyc -
		// dobra kwoata
		if (change == 0) {
			System.out.println("You payed the exact sum. No change to receive");
		} else if (change < 0) {
			System.out.println("You didn't pay enough\nYou need to pay " + (-change) + " more");
		} else {
			System.out.println("You get");
			if (twenties != 0) {
				System.out.println(twenties + " 20-dollars");
			}
			if (tenners != 0) {
				System.out.println(tenners + " 10-dollars");
			}
			if (fivers != 0) {
				System.out.println(fivers + " fivers");

			}
			if (twos != 0) {
				System.out.println(twos + " 2-dollars");
			}
			if (dollars != 0) {
				System.out.println(dollars + " 1-sollars");
			}
			if (fiftyCents != 0) {
				System.out.println(fiftyCents + " 50-cents");
			}
			if (twentyCents != 0) {
				System.out.println(twentyCents + " 20-cents");
			}
			if (tenCents != 0) {
				System.out.println(tenCents + " 10-cents");
			}
			if (fiveCents != 0) {
				System.out.println(fiveCents + " 5-cents");
			}
			if (twoCents != 0) {
				System.out.println(twoCents + " 2-cents");
			}
			if (oneCents != 0) {
				System.out.println(oneCents + " 1-cents");
			}
		}
	}

}
