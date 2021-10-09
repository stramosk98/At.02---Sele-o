package atv2;

import java.util.Scanner;

public class atx18 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
	float t1, t2, t3 = 0;
			System.out.println("Dígite três lados de um triângulo: ");
			t1 = entrada.nextFloat();
			t2 = entrada.nextFloat();
			t3 = entrada.nextFloat();
			
			if(t1 == t2 && t2 == t3){
				System.out.println("Triângulo Equilátero");
			}else{
				if(t1 == t2 || t2 == t3 || t1 == t3) {
					System.out.println("Triângulo Isósceles");
				}else{
					if(t1 != t2 || t2 != t3 || t1 != t3) {
						System.out.println("Escaleno");
				}
			}
			}
	entrada.close();
	
}
} 