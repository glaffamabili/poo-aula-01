package app;

public class Aluno{
    public String nome; // public é encapsulamento // atributo String
    public int idade; // atributo int

    public String getDados() {
        return this.nome + " ( " + this.idade + " )";
    }
    public Aluno(String nome, int idade){ 
        this.nome = nome;
        this.idade = idade;
    }
    public Aluno() {}
}