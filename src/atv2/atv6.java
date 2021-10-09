package atv2;

import java.util.Scanner;

public class atv6 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
		
	
	     int n1;
	 
	       
	        System.out.println("Informe um número inteiro:");
	        n1 = entrada.nextInt();
	      if(n1 % 2 == 1) {
	    	  System.out.println("O Número " + (n1 + 1) + " é par");  
	      }else
	      if(n1 % 2 == 0) {
	 	   	  System.out.println("O Número " + (n1 + 1) + " é ímpar"); 
	      }

		entrada.close();
	}
}
