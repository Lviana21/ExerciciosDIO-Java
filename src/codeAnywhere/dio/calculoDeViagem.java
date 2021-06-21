package codeAnywhere.dio;

import java.util.Locale;
import java.util.Scanner;

/*
#DIO - CALCULO DE VIAGEM
Rubens quer calcular e mostrar a quantidade de litros de combust�vel gastos em uma viagem de carro,
sendo que seu carro faz 12 KM/L. Como ele n�o sabe fazer um programa que o auxilie nessa miss�o, ele
te pede ajuda. Para efetuar o c�lculo, deve-se fornecer o tempo gasto em horas na viagem e a velocidade
m�dia durante a mesma em km/h. Assim, voc� conseguir� passar para Rubens qual a dist�ncia percorrida e,
em seguida, calcular quantos litros ser�o necess�rios para a viagem que ele quer fazer. Mostre o valor 
com 3 casas decimais ap�s o ponto.

ENTRADA
O arquivo de entrada cont�m dois inteiros. O primeiro � o tempo gasto na viagem em horas e o segundo � 
a velocidade m�dia durante a mesma em km/h.

SA�DA
Imprima a quantidade de litros necess�ria para realizar a viagem, com tr�s d�gitos ap�s o ponto decimal.
*/

public class calculoDeViagem {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		int tempoGastoHoras = input.nextInt();
		int velocidadeMediaKm = input.nextInt();

		System.out.printf("%.3f\n", (tempoGastoHoras * velocidadeMediaKm) / 12.0);

		input.close();

	}

}
