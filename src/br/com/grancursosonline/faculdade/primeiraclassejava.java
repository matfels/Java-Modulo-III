package br.com.grancursosonline.faculdade;

import java.util.Scanner;

public class primeiraclassejava{
	public static void main(String[] args) {
		int a, b, resposta;
		String nome = " ";
		double percentual;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o primerio número: ");
		a = in.nextInt();
		System.out.println("Digite o segundo número: ");
		b = in.nextInt();
		System.out.println("Digite o percentual: ");
		percentual = in.nextDouble();
		System.out.println("Digite o Nome: ");
		nome = in.next();
		
		resposta = a + b;
		System.out.println("Soma:" + resposta);
		System.out.println("Digitado por: " + nome);
		System.out.println("Percentual: " + percentual);
			
	}
}