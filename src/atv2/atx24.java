package atv2;

import java.util.Scanner;

public class atx24 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
	float t1, t2, t3, med = 0;
			System.out.println("Dígite três notas : ");
			t1 = entrada.nextFloat();
			t2 = entrada.nextFloat();
			t3 = entrada.nextFloat();
			med = (t1 + t2 + t3) / 3;
			
			if(med >= 7 && med < 10){
				System.out.println("Aprovado");
			}else{
				if(med < 7) {
					System.out.println("Reprovado");
				}else{
					if(med == 10) {
						System.out.println("Aprovado com distinção");
				}
		    }
		}
	entrada.close();
	
 }
}  