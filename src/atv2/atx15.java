package atv2;

import java.util.Scanner;

public class atx15 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
		
		
		
		System.out.println("Digite o c�digo de origem de 1 a 8: ");
	    String  semana = entrada.nextLine();
	    
	    System.out.println("Digite o pre�o do produto: ");
		float price = entrada.nextFloat();
	    
		
      if(semana.equals("1")) {
    	  System.out.println("pre�o: \n" + price + "C�digo de origem: Sul");
      }else {
    	  if(semana.equals("2")) {
        	  System.out.println("pre�o: \n" + price + "C�digo de origem: Norte");
          }else {
        	  if(semana.equals("3")) {
            	  System.out.println("pre�o: \n" + price + "C�digo de origem: Leste");
              }else {
            	  if(semana.equals("4")) {
                	  System.out.println("pre�o: \n" + price + "C�digo de origem: Oeste");
                  }else {
                	  if(semana.equals("5")) {
                    	  System.out.println("pre�o: \n" + price + "C�digo de origem: Nordeste");
                      }else {
                    	  if(semana.equals("6")) {
                        	  System.out.println("pre�o: \n" + price + "C�digo de origem: Nordeste");
                          }else {
                        	  if(semana.equals("7")) {
                            	  System.out.println("pre�o: \n" + price + "C�digo de origem: Centro-Oeste");
                              }else {
                            	  if(semana.equals("8")) {
                                	  System.out.println("pre�o: \n" + price + "C�digo de origem: Centro-Oeste");
                            	  }else {
                                	  System.out.println("Inv�lido");
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