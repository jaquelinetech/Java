package Exercicio1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat ("###,###,##0.00");
         
		Scanner leia = new Scanner (System.in);
		
		float numero01, numero2;
		String nome;
		System.out.println("Digite seu salario; ");
		nome = leia.nextLine();
		System.out.println("Digite o abono:");
		float numero1 = (float) leia.nextDouble();
		
		System.out.print(0);
	}
	

}
