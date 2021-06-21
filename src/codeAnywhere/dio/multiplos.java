package codeAnywhere.dio;

import java.util.Scanner;

/*
#DIO - MÚLTIPLOS
Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou
"Nao sao Multiplos", indicando se os valores lidos são múltiplos entre si.

- Efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando por π.

ENTRADA
A entrada contém valores inteiros.

SAÍDA
A saída deve conter uma das mensagens conforme descrito acima.
*/

public class multiplos {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int A = input.nextInt();
		int B = input.nextInt();

		if (A % B == 0 || B % A == 0) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("Nao sao Multiplos");
		}

		input.close();

	}

}
