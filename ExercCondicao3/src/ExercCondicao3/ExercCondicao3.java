package ExercCondicao3; // Fa�a um programa que receba a idade de uma pessoa e mostre na sa�da em qual categoria ela se encontra:

import java.util.Scanner;
public class ExercCondicao3 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Scanner ler = new Scanner (System.in);
		int idade;
		
		System.out.println("Ol� Amigo! Digite sua idade: ");
		idade = ler.nextInt();
		
		if (idade>=10 && idade <=14)
		{
			System.out.println("Voc� est� na equipe INFANTIL");
		}
		if (idade>=15 && idade <=17)
		{
			System.out.println("Voc� est� na equipe JUVENIL");
		}
		if (idade>=18 && idade <=25)
		{
			System.out.println("Voc� est� na equipe ADULTO");
		}
		if (idade<10 || idade >25)
		{
			System.out.println("Precisamos que se dirija a outra oficina, pois nesta, as turmas v�o de 10 a 25 anos!");
		}

	}
}
