package cursoJava;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double p = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double r = sc.nextDouble();
		System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.Converter(p, r));
		
		sc.close();
		
	}

}
