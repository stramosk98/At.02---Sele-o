package atv2;

import java.util.Scanner;

public class atv2 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite um n�mero: ");
		float n1 = entrada.nextFloat();
		
		if (n1 > 0){
			System.out.println("O n�mero " + n1 + " � positivo ");
		}else if (n1 == 0){
			System.out.println("O n�mero " + n1 + " � zero");
		}
		
		if (n1 < 0){
			System.out.println("O n�mero " + n1 + " � negativo");
		}
		entrada.close();
	}
}