package atv2;

import java.util.Scanner;

public class atx25 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
	int num = 0;
			System.out.println("D�gite um n�mero inteiro: ");
			num = entrada.nextInt();
		
			
			if(num % 2 == 1){
				System.out.println("�mpar");
			}else{
				
					System.out.println("Par");
				
		    }
		
	entrada.close();
	
 }
}