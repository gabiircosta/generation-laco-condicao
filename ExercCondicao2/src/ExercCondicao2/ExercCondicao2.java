package ExercCondicao2; //Fa�a um programa que entre com tr�s n�meros e coloque em ordem crescente.

import java.util.Scanner;

public class ExercCondicao2 {

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
		
		if (n1<n2 && n1<n3 && n2<n3)
		{
			System.out.println("A ordem crescente dos dados �: "+n1+", "+n2+", "+n3);
		}
		if (n1<n2 && n1<n3 && n3<n2)
		{
			System.out.println("A ordem crescente dos dados �: "+n1+", "+n3+", "+n2);
		}
		if (n2<n1 && n2<n3 && n1<n3)
		{
			System.out.println("A ordem crescente dos dados �: "+n2+", "+n1+", "+n3);
		}
		if (n3<n1 && n3<n2 && n1<n2)
		{
			System.out.println("A ordem crescente dos dados �: "+n3+", "+n1+", "+n2);
		}
		if (n2<n1 && n2<n3 && n3<n1)
		{
			System.out.println("A ordem crescente dos dados �: "+n2+", "+n3+", "+n1);
		}
		if (n3<n2 && n3<n1 && n2<n1)
		{
			System.out.println("A ordem crescente dos dados �: "+n3+", "+n2+", "+n1);
		}
		if (n1==n2 && n1<n3)
		{
			System.out.println("A ordem crescente dos dados �: "+n1+", "+n2+", "+n3);
		}
		if (n1==n2 && n1>n3)
		{
			System.out.println("A ordem crescente dos dados �: "+n3+", "+n1+", "+n2);
		}
		if (n2==n3 && n2<n1)
		{
			System.out.println("A ordem crescente dos dados �: "+n2+", "+n3+", "+n1);
		}
		if (n2==n3 && n2>n1)
		{
			System.out.println("A ordem crescente dos dados �: "+n1+", "+n2+", "+n3);
		}
		if (n1==n2 && n1==n3)
		{
			System.out.println("N�o h� como apresentar ordem crescente. \nTodos os n�meros digitados s�o iguais!");
		}
	}

}
