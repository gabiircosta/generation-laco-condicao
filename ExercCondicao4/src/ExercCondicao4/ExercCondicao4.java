package ExercCondicao4; //Se é par ou ímpar(...)

import java.util.Scanner;

public class ExercCondicao4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner (System.in);
		double n1, raiz, potencia;
		
		System.out.println("Escreva um número inteiro: ");
		n1 = ler.nextFloat();
		potencia = Math.pow(n1, 2);
		raiz = Math.sqrt(n1);
		
		
		if (n1%2.0==0.0)
		{
			System.out.println("O número que você escolheu é par: "+n1);
			System.out.println("A raiz quadrada do número que você escolheu é: "+raiz);
		}
		if (n1%2.0!=0.0)
		{
			System.out.println("O número que você escolheu é ímpar: "+n1);
			System.out.println("O númro que você escolheu elevado ao quadrado é : "+potencia);
		}

	}

}
