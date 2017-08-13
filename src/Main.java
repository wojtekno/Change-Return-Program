import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Math math = new Math();
		
		
		System.out.println("How much do you have to pay?");
		math.cost = scan.nextDouble();
		System.out.println("How much you give?");
		math.moneyGiven = scan.nextDouble();
		math.changeReturn();
	}

}
