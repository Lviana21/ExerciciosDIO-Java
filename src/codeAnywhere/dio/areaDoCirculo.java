package codeAnywhere.dio;

import java.util.Locale;
import java.util.Scanner;

/*
#DIO - ÁREA DO CÍRCULO
A fórmula para calcular a área de uma circunferência é: area = π . raio2. 
Considerando para este problema que π = 3.14159:

- Efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando por π.

ENTRADA
A entrada contém um valor de ponto flutuante (dupla precisão), no caso, a variável raio.

SAÍDA
Apresentar a mensagem "A=" seguido pelo valor da variável area, conforme exemplo abaixo,
com 4 casas após o ponto decimal. Utilize variáveis de dupla precisão (double). Como todos
os problemas, não esqueça de imprimir o fim de linha após o resultado, caso contrário,
você receberá "Presentation Error".
*/

public class areaDoCirculo {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner input = new Scanner(System.in);

		double raio = input.nextDouble();
		double pi = 3.14159;

		double area = pi * Math.pow(raio, 2);

		System.out.printf("A=%.4f\n", area);

		input.close();
	}

}
