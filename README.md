# Java Módulo III - Fundamentos de POO

Este repositório contém exercícios práticos desenvolvidos durante o Módulo III de um curso de Java. O foco principal é a introdução à **Programação Orientada a Objetos (POO)** e a interação básica com o utilizador através da consola.

## 📋 Sobre o Projeto

O projeto está estruturado no pacote `br.com.grancursosonline.faculdade` e demonstra conceitos essenciais da linguagem Java, tais como:

* **Criação de Classes e Objetos:** Definição de atributos e comportamentos.
* **Encapsulamento:** Uso de modificadores de acesso (`private`, `public`) e métodos *Getters* e *Setters*.
* **Construtores:** Inicialização de objetos com parâmetros.
* **Sobrecarga de Métodos (Overloading):** Múltiplas versões do método `estudar()`.
* **Entrada e Saída de Dados:** Utilização da classe `Scanner` para ler inputs do teclado.

## 📂 Estrutura dos Ficheiros

O código fonte encontra-se na pasta `src` e contém as seguintes classes principais:

### 1. `Pessoa.java`
A classe modelo que representa uma pessoa no sistema.
* **Atributos:** `nome` (public), `telefone` (private), `idade` (private).
* **Funcionalidades:**
    * Construtor para inicializar os dados obrigatórios.
    * Método `estudar()`: Exibe uma mensagem simples.
    * Método `estudar(String disciplina)`: Exemplo de sobrecarga, aceitando o nome da matéria.
    * Getters e Setters para acesso controlado aos atributos privados.

### 2. `Principal.java`
A classe executável (que contém o `main`) responsável por instanciar a classe `Pessoa`.
* Cria um objeto `Pessoa` com dados iniciais.
* Testa os métodos de estudo e a alteração de atributos via *Setters*.

### 3. `primeiraclassejava.java`
Um exercício separado focado em lógica estruturada e interação com o utilizador.
* Lê dois números inteiros, um número decimal (`double`) e um nome.
* Realiza uma soma simples e exibe os resultados formatados na consola.

## 🚀 Como Executar

### Pré-requisitos
* [Java JDK](https://www.oracle.com/java/technologies/downloads/) instalado.
* Uma IDE como Eclipse (o projeto contém ficheiros de configuração `.settings` do Eclipse) ou VS Code.

### Compilação e Execução via Terminal

Navegue até a pasta `src` e compile os ficheiros:

```bash
javac br/com/grancursosonline/faculdade/*.java
