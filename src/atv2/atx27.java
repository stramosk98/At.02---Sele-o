package atv2;

import java.util.Scanner;

public class atx27 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
	float n1, n2, num = 0;
			System.out.println("D�gite dois n�meros: ");
			n1 = entrada.nextFloat();
			n2 = entrada.nextFloat();
		
			System.out.println("Qual opera��o deseja? -, +, / ou * ");
			String ope = entrada.next();
			if(ope.equals("-")){
				System.out.println(num = (n1 - n2));
				if (num % 2 == 1) {
					System.out.println("�mpar");
				
			}else{
					System.out.println("Par");
					
					if (num < 0 ) {
					System.out.println("Negativo");
					
				}else{
					
					System.out.println("Positivo");	
			
				}		    }
			}
	entrada.close();
	
 }
}