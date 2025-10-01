package br.com.grancursosonline.faculdade;

public class Pessoa {
	// Declarando atributos da classe
	public String nome;
	private String telefone;
	private int idade;
	
	// METODO CONTRUTOR. Declarando os valores que esses atributos vão receber
	public Pessoa(String nome, String telefone, int idade) {
		this.nome = nome;
		this.telefone = telefone;
		this.idade = idade;
	}
	
	// Declarando os metodos
	public void estudar(){
		System.out.println("Estudando");
	}
	public void estudar(String disciplina) {
		System.out.println("Estudando " + disciplina);
	}
	
	public String getNome() {
		System.out.println(nome);
		return nome;

	}

	public void setNome(String nome) {
		this.nome = nome;
		System.out.println(nome);
	}
	
	public String getTelefone() {
		System.out.println(telefone);		
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		System.out.println(telefone);
		this.telefone = telefone;
	}
	public int getIdade() {
		System.out.println(idade);
		return idade;
	}
	
	public void setIdade(int idade) {
		System.out.println(idade);
		this.idade = idade;
	}
}