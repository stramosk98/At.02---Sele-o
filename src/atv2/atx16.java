package atv2;

import java.util.Scanner;

public class atx16 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
		
		float n1, n2, med = 0;
		System.out.println("Digite dois números: ");
		n1 = entrada.nextFloat();
		n2 = entrada.nextFloat();
		med = (n1 + n2) / 2;
		
		  if(med <= 3) {
        	  System.out.println("Reprovado!"); // ;'(
          }else {
        	  if(med > 3 && med <= 6.9) {
            	  System.out.println("Em exame");
              }else {
            	  if(med >= 7 && med <= 10) {
                	  System.out.println("Aprovado!");
            	  }
              }
          }
	
                	  
		entrada.close();
	}
}
