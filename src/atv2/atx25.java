package atv2;

import java.util.Scanner;

public class atx25 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
	int num = 0;
			System.out.println("Dígite um número inteiro: ");
			num = entrada.nextInt();
		
			
			if(num % 2 == 1){
				System.out.println("ímpar");
			}else{
				
					System.out.println("Par");
				
		    }
		
	entrada.close();
	
 }
}