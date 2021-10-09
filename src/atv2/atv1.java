package atv2;

import java.util.Scanner;

public class atv1 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
		
		float n1, n2 = 0;
		System.out.println("Digite dois números: ");
		n1 = entrada.nextFloat();
		n2 = entrada.nextFloat();
		
		if (n1 > n2){
			System.out.println("o maior número é: " + n1);
		}
		else if (n2>n1){
			System.out.println("o maior número é: " + n2);
		}
		if (n1 == n2){
			System.out.println("os números são iguais");	
		}
		entrada.close();
	}
}
