package Exercicio10;

import Exercicio07.*;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

public class Zoologico {
    private static class Jaula{
        public Animal animal;

        public Jaula(Animal animal) {
            this.animal = animal;
        }

    }
    public static ArrayList<Jaula> jaulas = new ArrayList<Jaula>();

    public static void adicionarAnimal(Animal animal){
        jaulas.add(new Jaula(animal));
    }

    public static void percorrerJaulas(){
        for (Jaula jaula : jaulas) {
            jaula.animal.emitirSom();
            try {
                jaula.animal.getClass().getMethod("correr").invoke(jaula.animal);
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException ignored) {}
        }
    }

    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro(5, "Bingo");
        Preguica preguica = new Preguica(8,"Preguica1");
        Cavalo cavalo   = new Cavalo  (7, "Pé de pano ");

        Cachorro cachorro1 = new Cachorro(5, "Bethoven");
        Preguica preguica1 = new Preguica(8,"Preguiçoso");
        Cavalo   cavalo1   = new Cavalo  (7, "Tornado");

        Cachorro cachorro2 = new Cachorro(5, "Lassie");
        Preguica preguica2 = new Preguica(8,"Vadio");
        Cavalo   cavalo2   = new Cavalo  (7, "Spirit");

        Zoologico.adicionarAnimal(cachorro);
        Zoologico.adicionarAnimal(preguica);
        Zoologico.adicionarAnimal(cavalo);

        Zoologico.adicionarAnimal(cachorro1);
        Zoologico.adicionarAnimal(preguica1);
        Zoologico.adicionarAnimal(cavalo1);

        Zoologico.adicionarAnimal(cachorro2);
        Zoologico.adicionarAnimal(preguica2);
        Zoologico.adicionarAnimal(cavalo2);

        Zoologico.percorrerJaulas();
    }
}
