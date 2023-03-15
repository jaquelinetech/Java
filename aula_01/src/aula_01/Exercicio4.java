package aula_01;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner leia = new Scanner (System.in);
        DecimalFormat df = new DecimalFormat("###,###,##0,00");
        
        float n1,n2,n3,n4;
        

        System.out.println("Digite a nota 1:");
        n1=leia.nextFloat();
        System.out.println("Digite a nota 2:");
        n2=leia.nextFloat();
        System.out.println("Digite a nota 3:");
        n3=leia.nextFloat();
        System.out.println("Digite a nota 4:");
        n4=leia.nextFloat();
        
        System.out.println("A Diferença é:" + ((n1 * n2) - (n3 * n4)));
        
			
	}

}
