import java.util.Locale;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	double salario, juros, rendimento;
	
	juros = 0.70;
	
	System.out.printl("Digite seu Salario");
	salario = sc.nextDouble();
	rendimento = salario * juros;
	
	System.out.println("O rendimento sera de " + String.format("%.2f", rendimento));
	
	
		
		
		
	}
	
	
	
}
