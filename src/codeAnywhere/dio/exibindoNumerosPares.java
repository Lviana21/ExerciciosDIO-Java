package codeAnywhere.dio;

import java.util.Scanner;

/*
#DIO - EXIBINDO NÚMEROS PARES
Crie um programa que leia um número e mostre os números pares até esse número, inclusive ele mesmo.

ENTRADA
Você receberá 1 valor inteiro N, onde N > 0.

SAÍDA
Exiba todos os números pares até o valor de entrada, sendo um em cada linha. 
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
