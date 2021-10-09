package atv2;

import java.util.Scanner;

public class atx13 {
	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);

		double sal = 0;
		int h, vl = 0;
	 
	       
	        System.out.println("Valor da sua hora: ");
	        vl = entrada.nextInt();
	 
	        System.out.println("Quantas horas você trabalha: ");
	        h = entrada.nextInt();
	        
	        sal = (vl * h);
	        if (sal <= 900) {
	              System.out.println("Seu salario bruto: " + sal + " \n IR: " + sal * 0.05 + "\n INSS: " + (sal * 0.10) + "\n FGTS: " + (sal * 0.11) + "\n Total descontos: "+ (sal * 0.26) + "\n Salario liquido: " + (sal - (sal * 0.26)) ); 
	        }else{
	        if (sal > 900 && sal <= 1500) {
	              System.out.println("Seu salario bruto: " + sal + " \n IR: " + sal * 0.05 + "\n INSS: " + (sal * 0.10) + "\n FGTS: " + (sal * 0.11) + "\n Total descontos: "+ (sal * 0.26) + "\n Salario liquido: " + (sal - (sal * 0.26)) ); 
	        }else{
	        	 if (sal > 1500 && sal <= 2500) {
		              System.out.println("Seu salario bruto: " + sal + " \n IR: " + sal * 0.05 + "\n INSS: " + (sal * 0.10) + "\n FGTS: " + (sal * 0.11) + "\n Total descontos: "+ (sal * 0.26) + "\n Salario liquido: " + (sal - (sal * 0.26)) ); 
	        	 }else {
	        		 if (sal > 2500) {
	   	              System.out.println("Seu salario bruto: " + sal + " \n IR: " + sal * 0.05 + "\n INSS: " + (sal * 0.10) + "\n FGTS: " + (sal * 0.11) + "\n Total descontos: "+ (sal * 0.26) + "\n Salario liquido: " + (sal - (sal * 0.26)) ); 
	        	 }
	        }
	        
	        
	   
	 
	        }
	        entrada.close();
	}
}
}