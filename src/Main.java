package src;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
    GrassPokemon bulbasaur = new GrassPokemon("Bulbasaur", 2, 10, 250, "Bulba"){
    };
    WaterPokemon squirtle = new WaterPokemon("Squirtle", 4, 20, 400, "Squirtle squirtl") {
    };
    FirePokemon charmander = new FirePokemon("Charmander", 2, 10, 200, "Charmander cha") {
    };
    ElectricPokemon pikachu = new ElectricPokemon("Pikachu", 1, 5, 50, "Pika pika") {};

        System.out.println(bulbasaur.pokeDex());
        System.out.println(charmander.attack());
        System.out.println(squirtle.pokeDexFightInfo());
        System.out.println(charmander.useAttack(3));
        System.out.println(pikachu.defend());
        System.out.println(pikachu.choosePokemon());
        System.out.println(squirtle.sound());

        Trainer ash = new Trainer("Ash");

        Adventure newAdventure = new Adventure(ash);

        newAdventure.start();



    }




}
