package atv2;

import java.util.Scanner;

public class atv1 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
		
		float n1, n2 = 0;
		System.out.println("Digite dois n�meros: ");
		n1 = entrada.nextFloat();
		n2 = entrada.nextFloat();
		
		if (n1 > n2){
			System.out.println("o maior n�mero �: " + n1);
		}
		else if (n2>n1){
			System.out.println("o maior n�mero �: " + n2);
		}
		if (n1 == n2){
			System.out.println("os n�meros s�o iguais");	
		}
		entrada.close();
	}
}
