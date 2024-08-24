package Exercícios;

import java.util.Scanner;

public class ImprimeASomaDeDoisNum {

	public static void main(String[] args) {
		/*
		 * Faça um programa que peça dois npumeros e imprima a soma
		 */
		
		// Declaração das variáveis que vão receber os dois números: num1 e num2
		int num1, num2;	
		
		// Classe Scanner que vai ler os numeros digitados
		Scanner myObj = new Scanner(System.in);
		
		// Pedir o primeiro e o segundo número, ler os números, e salvar nas variaveis
		System.out.print("Digite o primero número: ");
		num1 = myObj.nextInt();
		System.out.print("Digite o segundonúmero: ");
		num2 = myObj.nextInt();
		
		// Pegar o numeros das variáveis e somar
		int som = num1 + num2;
		// Imprimir os números digitados e a soma
		System.out.printf("%s%d e %d. %n%s%d.","Os números digitados foram ", 
				num1, num2, "A soma desses números é igual a ", som);

	}

}
