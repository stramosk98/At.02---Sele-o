package atv2;

import java.util.Scanner;

public class atx18 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
	float t1, t2, t3 = 0;
			System.out.println("D�gite tr�s lados de um tri�ngulo: ");
			t1 = entrada.nextFloat();
			t2 = entrada.nextFloat();
			t3 = entrada.nextFloat();
			
			if(t1 == t2 && t2 == t3){
				System.out.println("Tri�ngulo Equil�tero");
			}else{
				if(t1 == t2 || t2 == t3 || t1 == t3) {
					System.out.println("Tri�ngulo Is�sceles");
				}else{
					if(t1 != t2 || t2 != t3 || t1 != t3) {
						System.out.println("Escaleno");
				}
			}
			}
	entrada.close();
	
}
} 