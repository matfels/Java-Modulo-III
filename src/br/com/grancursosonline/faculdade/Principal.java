package br.com.grancursosonline.faculdade;

//import java.util.Scanner;

public class Principal{
	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Matheus Melo", "41 9999-9999", 28);
		pessoa.estudar();
		pessoa.estudar(" Java");
		pessoa.getIdade();
		pessoa.setIdade(42);
	}
}



