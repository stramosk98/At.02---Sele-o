package atv2;

import java.util.Scanner;

public class atv3 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
	     String sexo;
	 
	       
	        System.out.println("Informe seu sexo F ou M:");
	        sexo = entrada.nextLine();
	 
	        if (sexo.equals ("M")) {
	              System.out.println("O sexo é: Masculino " ); 
	        }else{
	        if (sexo.equals("F")) {
	            System.out.println("O sexo é: Femenino");
	        }else{
	        	System.out.println("Inválido");
	        }
	        
	        
	   
	 
	        }
	        entrada.close();
	}
}