package atv2;

import java.util.Scanner;

public class atv8 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
		
		float n1, n2, med = 0;
		System.out.println("Digite dois números: ");
		n1 = entrada.nextFloat();
		n2 = entrada.nextFloat();
		med = (n1 + n2) / 2;
		
		if (med >= 7){
			System.out.println("Aprovado! Media: " + med);
		}
		else if (med < 7){
			System.out.println("Reprovado! Media: " + med); //;'(
		}
		
		entrada.close();
	}
}
