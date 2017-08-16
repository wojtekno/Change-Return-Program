
public class Math {
	double cost;
	double moneyGiven;
	//how about arrays?

	void changeReturn() {
		double change = moneyGiven - cost;
		int twoHundreds = (int) change / 200;
		int hundreds = (int) (change - (200 * twoHundreds)) / 100;
		int fifties = (int) (change - (200 * twoHundreds) - (100 * hundreds)) / 50;
		int twenties = (int) (change - (200 * twoHundreds) - (100 * hundreds) - (50 * fifties)) / 20;
		int tenners = (int) (change - (200 * twoHundreds) - (100 * hundreds) - (50 * fifties) - (20 * twenties)) / 10;
		int fivers = (int) (change - (200 * twoHundreds) - (100 * hundreds) - (50 * fifties) - (20 * twenties)
				- (10 * tenners)) / 5;
		int twos = (int) (change - (200 * twoHundreds) - (100 * hundreds) - (50 * fifties) - (20 * twenties)
				- (10 * tenners) - (5 * fivers)) / 2;
		int dollars = (int) (change - (200 * twoHundreds) - (100 * hundreds) - (50 * fifties) - (20 * twenties)
				- (10 * tenners) - (5 * fivers) - (2 * twos)) / 1;
		// jak to ugryzc?
		double changeOne = change - (200 * twoHundreds) - (100 * hundreds) - (50 * fifties) - (20 * twenties)
				- (10 * tenners) - (5 * fivers) - (2 * twos) - (1 * dollars);
		int fiftyCents = (int) (changeOne / 0.5);
		int twentyCents = (int) ((changeOne - (0.5 * fiftyCents)) / 0.2);
		int tenCents = (int) ((changeOne - (0.5 * fiftyCents) - (0.2 * twentyCents)) / 0.1);
		int fiveCents = (int) ((changeOne - (0.5 * fiftyCents) - (0.2 * twentyCents) - (0.1 * tenCents)) / 0.05);
		int twoCents = (int) ((changeOne - (0.5 * fiftyCents) - (0.2 * twentyCents) - (0.1 * tenCents)
				- (0.05 * fiveCents)) / 0.02);
		double changeTwo = (changeOne - (0.5 * fiftyCents) - (0.2 * twentyCents) - (0.1 * tenCents)
				- (0.05 * fiveCents) - (0.02 * twoCents));
		int oneCents = (int) ((changeOne - (0.5 * fiftyCents) - (0.2 * twentyCents) - (0.1 * tenCents)
				- (0.05 * fiveCents) - (0.02 * twoCents)) / 0.01);
		System.out.println(changeTwo);

		
		// jak to usprawnic zeby najpierw zrobilo to co powinno sie wydarzyc - dobra kwoata
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
