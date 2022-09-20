import java.util.Locale;

public class Main {
	
	

	

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		double celsius, fahrez;
		
		
		fahrez = 30;
		celsius = (fahrez-32) * 5/9;
		
		System.out.println("A temperatura em Celsius vai ser " + String.format("%.2f", celsius));
		System.out.println("A temperatura em fahrenheit vai ser " + String.format("%.2f", fahrez));

	}

}
