package atv2;

import java.util.Scanner;

public class atv5 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
		
	
	     String vogal;
	 
	       
	        System.out.println("Informe uma vogal:");
	        vogal = entrada.nextLine();
	 
	        if (vogal.equals ("a")) {
	              System.out.println("� uma vogal" ); 
	        }else
	        if (vogal.equals("e")) {
	            System.out.println("� uma vogal");
	        }else
		        if (vogal.equals("i")) {
		            System.out.println("� uma vogal");   
		        }else{
			        if (vogal.equals("o")) {
			            System.out.println("� uma vogal");
			        }else
				        if (vogal.equals("u")) {
				            System.out.println("� uma vogal");
	        }else{
	        	
	        	System.out.println("Inv�lido");
	        }
	        
	        
	   
	 
	        }

		entrada.close();
	}
}
