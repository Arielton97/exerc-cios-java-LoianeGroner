package Exercícios;

import java.util.Scanner;

public class ValorHorasTrabalhasNoMes {

	public static void main(String[] args) {
		/*
		 * Faça um Programa que pergunte quanto você ganha por hora e 
		 * o número de horas trabalhadas no mês. 
		 * Calcule e mostre o total do seu salário no referido mês.
		 */
		// Variáveis 
		double salarioHora, horaDia, salarioHoraDia, result;
		int mes;
		
		// Variável Objeto Scanner
		Scanner myObj = new Scanner(System.in);
		
		// Começar
		System.out.print("Quanto vc recebe por hora trabalhada: ");
		salarioHora = myObj.nextDouble();
		
		System.out.print("Quantas horas você trabalha por dia: ");
		horaDia = myObj.nextDouble();
		
		System.out.print("Quantos dias você trabalhou esse mês: ");
		mes = myObj.nextInt();
		
		// Formula (hora * dia) * mes
		salarioHoraDia = salarioHora * horaDia;
		result = salarioHoraDia * mes;
		
		System.out.print("Seu dia custa R$ " + salarioHoraDia + 
				". E seu salario no mês é de R$ " + result + ".");

	}

}
