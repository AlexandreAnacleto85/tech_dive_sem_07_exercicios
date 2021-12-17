package Exercicio07;

public class Cachorro extends Animal{

    public Cachorro(int idade, String nome) {
        super(idade, nome);
    }

    @Override
    public void emitirSom(){
        System.out.println(getNome() + ": auuuuu");
    }

    public void correr(){
        System.out.println(getNome() + ": Correndo...");
    }
}
