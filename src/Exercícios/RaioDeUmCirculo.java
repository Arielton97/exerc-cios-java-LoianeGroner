package Exercícios;

import java.util.Scanner;

public class RaioDeUmCirculo {

	public static void main(String[] args) {
		// Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
		
		// variável objeto Scanner
		Scanner myObj = new Scanner(System.in);
		
		// variável pi = 3.14
		double pi = 3.14;
		
		// Pede a entrada do valor da área
		System.out.print("Entre com o valor da raio: ");
		double raio = myObj.nextDouble();
		
		// Formula do calculo: A = πr² 
		double area = pi * (raio * raio);
		
		// imprime o valor na tela (está quebrada para facilitar a leitura)
		System.out.print("O valor do raio é " + raio + 
				", o valor da área é "+ area + 
				", o valor de pi é " + pi + ".");

	}

}
