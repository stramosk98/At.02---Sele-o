package atv2;

import java.util.Scanner;

public class atv2 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
		
		System.out.println("Digite um número: ");
		float n1 = entrada.nextFloat();
		
		if (n1 > 0){
			System.out.println("O número " + n1 + " é positivo ");
		}else if (n1 == 0){
			System.out.println("O número " + n1 + " é zero");
		}
		
		if (n1 < 0){
			System.out.println("O número " + n1 + " é negativo");
		}
		entrada.close();
	}
}