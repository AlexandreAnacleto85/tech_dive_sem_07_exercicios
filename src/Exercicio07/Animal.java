package Exercicio07;

public abstract class Animal {
    private String nome;
    private int idade;


    public Animal(int idade, String nome) {
        this.idade = idade;
        this.nome = nome;
    }

    public void emitirSom(){}

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
