package atv2;

import java.util.Scanner;

public class atx11 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
	     String turno;
	 
	       
	        System.out.println("Informe qual turno você estuda: M-Matutino, V-Vespertino ou N-Noturno ");
	        turno = entrada.nextLine();
	 
	        if (turno.equals ("M")) {
	              System.out.println("Bom Dia" ); 
	        }else{
	        if (turno.equals("V")) {
	            System.out.println("Boa Tarde");
	        }else{
	        	 if (turno.equals("N")) {
	 	            System.out.println("Boa Noite");
	        	 }
	        }
	        
	        
	   
	 
	        }
	        entrada.close();
	}
}