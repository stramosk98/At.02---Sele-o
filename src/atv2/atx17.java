package atv2;

import java.util.Scanner;

public class atx17 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
		
		float n1, n2, med = 0;
		System.out.println("Digite dois números: ");
		n1 = entrada.nextFloat();
		n2 = entrada.nextFloat();
		med = (n1 + n2) / 2;
		
		  if(med > 9 && med <= 10) {
        	  System.out.println(" nota um: " + n1 + "\n nota dois: " + n2 + "\n media: " + med + "\n Aprovado! \n Conceito: A");
          }else {
        	  if(med > 7.5 && med <= 9) {
        		  System.out.println(" nota um: " + n1 + "\n nota dois: " + n2 + "\n media: " + med + "\n Aprovado! \n Conceito: B");
              }else {
            	  if(med > 6 && med <= 7.5) {
            		  System.out.println(" nota um: " + n1 + "\n nota dois: " + n2 + "\n media: " + med + "\n Aprovado! \n Conceito: C");
            	  }else {
                	  if(med > 4 && med <= 6) {
                		  System.out.println(" nota um: " + n1 + "\n nota dois: " + n2 + "\n media: " + med + "\n Reprovado! \n Conceito: D");
                      }else {
                    	  if(med >= 0 && med <= 4) {
                    		  System.out.println(" nota um: " + n1 + "\n nota dois: " + n2 + "\n media: " + med + "\n Reprovado! \n Conceito: E");
            	  }
              }
          }
	
              }
          }
		entrada.close();
	}
}
