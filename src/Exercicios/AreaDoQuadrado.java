package Exercícios;

import java.util.Scanner;

public class AreaDoQuadrado {

	public static void main(String[] args) {
		/*
		 * Faça um Programa que calcule a área de um quadrado, 
		 * em seguida mostre o dobro desta área para o usuário.
		 */
		// Variável 'area' para calcular a área do quadrado
		double lado, area;
		
		
		// Variável objeto Scanner
		Scanner myObj = new Scanner(System.in);
		
		// Começo
		System.out.print("Digite o valor de um lado do quadrado: ");
		lado = myObj.nextDouble();
		
		// Fórmula: area = lado.lado
		area = (lado * lado);
		
		System.out.print("O lado do quadrado é " + lado + " e a area é " + area + ".");

	}

}
