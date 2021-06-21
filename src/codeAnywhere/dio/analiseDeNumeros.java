package codeAnywhere.dio;

import java.util.Scanner;

/*
#DIO - AN�LISE DE N�MEROS
Voc� deve fazer a leitura de 5 valores inteiros. Em seguida mostre quantos valores informados
s�o pares, quantos valores informados s�o �mpares, quantos valores informados s�o positivos e
quantos valores informados s�o negativos.

ENTRADA
Voc� receber� 5 valores inteiros.

SA�DA
Exiba a mensagem conforme o exemplo de sa�da abaixo, sendo uma mensagem por linha e n�o esquecendo
o final de linha ap�s cada uma.
*/

public class analiseDeNumeros {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int positivo, negativo, par, impar, numero;
		positivo = 0;
		negativo = 0;
		par = 0;
		impar = 0;
		numero = 0;

		for (int i = 0; i < 5; i++) {

			numero = input.nextInt();

			if (numero % 2 == 0) {
				par++;
			} else {
				impar++;
			}

			if (numero > 0) {
				positivo++;
			} else {
				if (numero < 0) {
					negativo++;
				}
			}

		}

		System.out.println(par + " valor(es) par(es)");
		System.out.println(impar + " valor(es) impar(es)");
		System.out.println(positivo + " valor(es) positivo(s)");
		System.out.println(negativo + " valor(es) negativo(s)");

		input.close();
	}

}
