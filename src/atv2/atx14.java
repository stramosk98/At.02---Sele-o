package atv2;

import java.util.Scanner;

public class atx14 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);

		System.out.println("Digite um número 1 a 7: ");
	    String  semana = entrada.nextLine();
      if(semana.equals("1")) {
    	  System.out.println("Domingo");
      }else {
    	  if(semana.equals("2")) {
        	  System.out.println("Segunda");
          }else {
        	  if(semana.equals("3")) {
            	  System.out.println("Terça-Feira");
              }else {
            	  if(semana.equals("4")) {
                	  System.out.println("Quarta-Feira");
                  }else {
                	  if(semana.equals("5")) {
                    	  System.out.println("Quinta-Feira");
                      }else {
                    	  if(semana.equals("6")) {
                        	  System.out.println("Sexta-Feira");
                          }else {
                        	  if(semana.equals("7")) {
                            	  System.out.println("Sabado");
                              }else {
                            	  System.out.println("Inválido");
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