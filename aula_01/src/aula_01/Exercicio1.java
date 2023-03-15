package aula_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio1 {

	
		
		
		public static void main(String[] args) {
		
		float salário;
		float abono;  
		DecimalFormat df = new DecimalFormat("###,###,##0.00");		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite seu salário:");
		salário = leia.nextFloat();
		
		System.out.println("Digite seu abono:");
		abono = leia.nextFloat();
		
		
		
		System.out.println("Novo sálario:\n" + df.format (salário + abono));
			
	
			
		}
		

	}


