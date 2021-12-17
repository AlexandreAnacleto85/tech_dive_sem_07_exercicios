package Exercicio07;

public class Cavalo extends Animal{

    public Cavalo(int idade, String nome) {
        super(idade, nome);
    }

    @Override
    public void emitirSom(){
        System.out.println(getNome() + ": hiihihihihih");
    }

    public void correr(){
        System.out.println(getNome() + ": Correndo....");
    }
}
