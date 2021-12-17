package Exercicio07;

public class Preguica extends Animal{

    public Preguica(int idade, String nome) {
        super(idade, nome);
    }

    @Override
    public void emitirSom(){
                   System.out.println(getNome() + ": .......zzz");
    }

    public void subirArvore(){
        System.out.println(getNome() + ": Subindo uma arvore ...");
    }
}