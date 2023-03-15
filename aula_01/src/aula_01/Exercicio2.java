package aula_01;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		Scanner leia = new Scanner(System.in);
		
		float n1, n2, n3, n4, media;
		
		System.out.println("Digite nota 1:");
		n1= leia.nextFloat();
		System.out.println("Digite nota 2:");
		n2= leia.nextFloat();
		System.out.println("Digite nota 3:");
		n3= leia.nextFloat();
		System.out.println("Digite nota 4:");
		n4= leia.nextFloat();
		
		media = (n1 + n2 + n3 + n4)/4;
		
		System.out.println("A media é: " + media);
		
		leia.close();
		
		
		
	}

}
