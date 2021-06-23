package codeAnywhere.dio;

import java.util.Scanner;

/*
#DIO - ENTRADA E SAÍDA CPF
Leia um número inteiro que representa um código de DDD para discagem interurbana.
Em seguida, informe à qual cidade o DDD pertence, considerando a tabela abaixo:

Tabela:https://prnt.sc/16fizch

Se a entrada for qualquer outro DDD que não esteja presente na tabela acima, o programa
deverá informar:DDD nao cadastrado

ENTRADA
A entrada consiste de um único valor inteiro.

SAÍDA
Imprima o nome da cidade correspondente ao DDD existente na entrada. Imprima DDD nao cadastrado
caso não existir DDD correspondente ao número digitado.

*/


public class ddd {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int ddd = input.nextInt();

		switch (ddd) {
		case 61:
			System.out.println("Brasilia");
			break;
		case 71:
			System.out.println("Salvador");
			break;
		case 11:
			System.out.println("São Paulo");
			break;
		case 21:
			System.out.println("Rio de Janeiro");
			break;
		case 32:
			System.out.println("Juiz de Fora");
			break;
		case 19:
			System.out.println("Campinas");
			break;
		case 27:
			System.out.println("Vitoria");
			break;
		case 31:
			System.out.println("Belo Horizonte");
			break;
		default:
			System.out.println("DDD não cadastrado");
			break;
		}

		input.close();

	}

}
