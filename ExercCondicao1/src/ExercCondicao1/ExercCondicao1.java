package ExercCondicao1; //Faça um programa que receba três inteiros e diga qual deles é o maior.

import java.util.Scanner;

class ExercCondicao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner (System.in);
		int n1,n2,n3;
		
		System.out.println("Escreva um valor para N1: ");
		n1 = ler.nextInt();
		System.out.println("Escreva um valor para N2: ");
		n2 = ler.nextInt();
		System.out.println("Escreva um valor para N3: ");
		n3 = ler.nextInt();
		
		if (n1>n2 && n1>n3)
		{
			System.out.println("O maior número escrito é (N1): "+n1);
		}
		if (n2>n1 && n2>n3)
		{
			System.out.println("O maior número escrito é (N2): "+n2);
		}
		if (n3>n1 && n3>n2)
		{
			System.out.println("O maior número escrito é (N3): "+n3);
		}
	}

}
