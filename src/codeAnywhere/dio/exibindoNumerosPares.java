package codeAnywhere.dio;

import java.util.Scanner;

/*
#DIO - EXIBINDO N�MEROS PARES
Crie um programa que leia um n�mero e mostre os n�meros pares at� esse n�mero, inclusive ele mesmo.

ENTRADA
Voc� receber� 1 valor inteiro N, onde N > 0.

SA�DA
Exiba todos os n�meros pares at� o valor de entrada, sendo um em cada linha. 
*/

public class exibindoNumerosPares {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int numero = input.nextInt();

		for (int i = 2; i <= numero; i++) {

			if (i % 2 == 0) {
				System.out.println(i);
			}

		}
		
		input.close();
	}

}
