package cursoJava;

public class CurrencyConverter {
	
	public static final double dolar = 3.10;
	
	public static double Converter (double dolar, double real) {
		return (dolar * real) + ((dolar*real)*0.06);
	}

}
