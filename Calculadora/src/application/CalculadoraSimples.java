package application;

import java.util.Scanner;

public class CalculadoraSimples {

	public static void main(String[] args) {
		
		double n1, n2;
		double soma, subtracao, multiplicacao, divisao;
		int op;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o primeiro número: ");
		n1 = sc.nextDouble();
		
		System.out.println("Informe o segundo número: ");
		n2 = sc.nextDouble();
		
		System.out.println("###SELECIONE UMA OPERAÇÃO###");
		System.out.println("[1] - SOMAR");
		System.out.println("[2] - SUBTRAIR");
		System.out.println("[3] - MULTIPLICAR");
		System.out.println("[4] - DIVIDIR");
		System.out.println(">>>Digite sua opção: ");
		
		op = sc.nextInt();
		
		switch(op) {
		case 1:
			soma = n1 + n2;
			System.out.println("O resultado da soma é: " + soma);
			break;
			
		case 2:
			subtracao = n1 - n2;
			System.out.println("O resultado da subtração é: " + subtracao);
			break;
		
		case 3:
			multiplicacao = n1 * n2;
			System.out.println("O resultado da multiplicação é: " + multiplicacao);
			break;
		
		case 4:
			if(n1 < n2) {
				System.out.println("Divisão impossível");
			}
			else {
				divisao = n1 / n2;
				System.out.println("O resultado da divisão é: " + divisao);
				break;
				
			
			}
		}
		
		sc.close();
	}
}

	

