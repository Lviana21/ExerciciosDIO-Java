package codeAnywhere.dio;

import java.util.Locale;
import java.util.Scanner;

/*
#DIO - ENTRADA E SA�DA CPF
Elabore um programa que possuas as caracter�sticas abaixo:

1-Leia os dados de um CPF no formato XXX.YYY.ZZZ-DD;
2-Imprima os quatro grupos num�ricos, sendo um valor por linha.

ENTRADA
A entrada consiste v�rios arquivos de teste e cada um possuindo uma linha
com formato XXX.YYY.ZZZ-DD, onde XXX, YYY, ZZZ, DD s�o n�meros inteiros.

SA�DA
Para cada arquivo da entrada, tem que ter um arquivo de sa�da com quatro linhas,
e em cada linha um n�mero inteiro de acordo com procedimento 2 descrito no Desafio.
Confira o exemplo abaixo:

Tabela: https://prnt.sc/16bftel

*/

public class entradaESaidaCPF {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner input = new Scanner(System.in);
		String[] cpf = new String[4];

		cpf = input.nextLine().split("\\.|-");

		for (int i = 0; i < cpf.length; i++) {

			System.out.printf("%s\n", cpf[i]);
		}

		input.close();

	}

}
