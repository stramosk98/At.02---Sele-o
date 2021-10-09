package atv2;

import java.util.Scanner;

public class atx15 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
		
		
		
		System.out.println("Digite o código de origem de 1 a 8: ");
	    String  semana = entrada.nextLine();
	    
	    System.out.println("Digite o preço do produto: ");
		float price = entrada.nextFloat();
	    
		
      if(semana.equals("1")) {
    	  System.out.println("preço: \n" + price + "Código de origem: Sul");
      }else {
    	  if(semana.equals("2")) {
        	  System.out.println("preço: \n" + price + "Código de origem: Norte");
          }else {
        	  if(semana.equals("3")) {
            	  System.out.println("preço: \n" + price + "Código de origem: Leste");
              }else {
            	  if(semana.equals("4")) {
                	  System.out.println("preço: \n" + price + "Código de origem: Oeste");
                  }else {
                	  if(semana.equals("5")) {
                    	  System.out.println("preço: \n" + price + "Código de origem: Nordeste");
                      }else {
                    	  if(semana.equals("6")) {
                        	  System.out.println("preço: \n" + price + "Código de origem: Nordeste");
                          }else {
                        	  if(semana.equals("7")) {
                            	  System.out.println("preço: \n" + price + "Código de origem: Centro-Oeste");
                              }else {
                            	  if(semana.equals("8")) {
                                	  System.out.println("preço: \n" + price + "Código de origem: Centro-Oeste");
                            	  }else {
                                	  System.out.println("Inválido");
                              }  
                          }  
                      }  
                  }
              }
          } 
      }
     }
      entrada.close();

}
}