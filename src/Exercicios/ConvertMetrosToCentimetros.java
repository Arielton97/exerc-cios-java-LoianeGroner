package Exercícios;

import java.util.Scanner;

public class ConvertMetrosToCentimetros {

	public static void main(String[] args) {
		// Faça um Programa que converta metros para centímetros
		
		// Objeto myObj Scanner
		Scanner myObj = new Scanner(System.in);
		
		System.out.print("Entre com a quantidade de metros: ");
		int metros = myObj.nextInt();
		
		// Declaração das variáveis | 1 metro são 100 centímetros
		int cm = metros * 100;
		
		System.out.printf("%d metros é igual a %d centimetros.", metros, cm);

	}

}
