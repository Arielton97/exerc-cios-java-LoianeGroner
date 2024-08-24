package Exercícios;

import java.util.Scanner;

public class PedeNumEImprime {

	public static void main(String[] args) {
		/*
		 * Faça um Programa que peça um número e então monstre a mensagem 
		 * "O numero informado foi: [numero]"
		 */
		// Criar um objeto com a classe Scanner
		Scanner myObj = new Scanner(System.in);
		
		// Inserir o numero num e salvar na variável de objeto myObj
		System.out.print("digite algum número inteiro: ");
		int num = myObj.nextInt();
		
		// Imprimir o número que foi digitado
		System.out.println("O númeor digitado foi: " + num);

	}

}
