package aula_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Aula01 {

	public static void main(String[] args) {
		
		DecimalFormat df = new DecimalFormat ("###,###,##0.00");
         
		Scanner leia = new Scanner (System.in);
		
		double numero01, numero2;
		String nome;
		System.out.println("Digite seu nome; ");
		nome = leia.nextLine();
		System.out.println("Digite o primeiro numero:");
		double numero1 = leia.nextDouble();
		
		System.out.println("Digite o 1 numero");
		numero2 = leia.nextDouble();
		
		System.out.println("Soma:"+ df.format((numero1 + numero2)));
		System.out.println("Subtração:"+ df.format((numero1- numero2)));
		System.out.println("Multiplicação:" + (numero1* numero2));
		if (numero1 != 0 && numero2 != 0) {
		System.out.println("Divisão:"+ df.format((numero1/ numero2)));
		}
		System.out.println("Potencia:" + df.format(Math.pow(numero1, numero2)));
		System.out.println("Raiz quadrada:" + df.format(Math.sqrt(numero1)));
		
		System.out.println("Nome;" + nome);
	}
	

}
