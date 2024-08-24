package Exercícios;

import java.util.Scanner;

public class NotaBimestre {

	public static void main(String[] args) {
		// Faça um Programa que peça as 4 notas bimestrais e mostre a média.
		
		// Variaveis para armazenar as quatro notas bimestrais
		int nota1, nota2, nota3, nota4;
		int media;
		
		// Variável Scanner
		Scanner myObj = new Scanner(System.in);
		
		// Pede as notas do bimestre e armazena na variavel
		System.out.println("---------------------------------------------");
		System.out.println("Calcule a sua média bimestral");		
		System.out.print("Digite a sua nota do primeiro bimestre: ");
		nota1 = myObj.nextInt();
		
		System.out.print("Digite a sua nota do segundo bimestre: ");
		nota2 = myObj.nextInt();
		
		System.out.print("Digite a sua nota do terceiro bimestre: ");
		nota3 = myObj.nextInt();
		
		System.out.print("Digite a sua nota do quarto bimestre: ");
		nota4 = myObj.nextInt();
		
		// Faz a média: media = nota1 + nota2 + nota3 + nota4 / 4
		media = nota1 + nota2 + nota3 + nota4 / 4;
		
		// Escreve as notas e a média bimestral
		System.out.printf("%s %d. %n%s %d. %n%s %d. %n%s %d. %n%s %d.", 
				"As suas notas foram... \nPrimeiro Bimestre:",nota1, 
				"Segundo semestre:", nota2, 
				"Terceiro semestre:", nota3, 
				"Quarto semestre:", nota4, 
				"E a sua média bimestral foi:", media);

	}

}
