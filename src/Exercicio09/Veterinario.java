package Exercicio09;

import Exercicio07.*;

public class Veterinario {
    public static void examinar(Animal animal){
        animal.emitirSom();
    }

    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro(5, "Bingo");
        Preguica preguica = new Preguica(8,"Preguiça");
        Cavalo   cavalo   = new Cavalo  (7, "Tornado");

        examinar(cachorro);
        examinar(cavalo);
        examinar(preguica);
    }
}