package atv2;

import java.util.Scanner;

public class atx23 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
	int t1, t2, t3, med = 0;
			System.out.println("Dígite três idades de alunos: ");
			t1 = entrada.nextInt();
			t2 = entrada.nextInt();
			t3 = entrada.nextInt();
			med = (t1 + t2 + t3) / 3;
			
			if(med <= 25){
				System.out.println("Turma Jovem");
			}else{
				if(med > 25 && med <= 40) {
					System.out.println("Turma Adulta");
				}else{
					if(med > 40) {
						System.out.println("Turma Idosa");
				}
		    }
		}
	entrada.close();
	
 }
} 