package ExercCondicao4; //Se � par ou �mpar(...)

import java.util.Scanner;

public class ExercCondicao4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner (System.in);
		double n1, raiz, potencia;
		
		System.out.println("Escreva um n�mero inteiro: ");
		n1 = ler.nextFloat();
		potencia = Math.pow(n1, 2);
		raiz = Math.sqrt(n1);
		
		
		if (n1%2.0==0.0)
		{
			System.out.println("O n�mero que voc� escolheu � par: "+n1);
			System.out.println("A raiz quadrada do n�mero que voc� escolheu �: "+raiz);
		}
		if (n1%2.0!=0.0)
		{
			System.out.println("O n�mero que voc� escolheu � �mpar: "+n1);
			System.out.println("O n�mro que voc� escolheu elevado ao quadrado � : "+potencia);
		}

	}

}
