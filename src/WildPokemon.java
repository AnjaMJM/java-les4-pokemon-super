package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;



public class WildPokemon {
    private final List<Pokemon> wildPokemons;
    private final Random random;

    public WildPokemon() {
        wildPokemons = new ArrayList<>();
        random = new Random();

        wildPokemons.add(new FirePokemon("Vulpix", 2, 38, 150, "Vulpi"));
        wildPokemons.add(new FirePokemon("Ponyta", 3, 50, 300, "Ponyta"));
        wildPokemons.add(new WaterPokemon("Psyduck", 3, 50, 300, "Psy Psyduck"));
        wildPokemons.add(new WaterPokemon("Poliwag", 2, 30, 180, "Poliwaaag"));
        wildPokemons.add(new GrassPokemon("Oddish", 3, 45, 240, "Odd odd"));
        wildPokemons.add(new GrassPokemon("Bellsprout", 3, 50, 320, "Bell bell"));
        wildPokemons.add(new ElectricPokemon("Voltorb", 2, 40, 250, "Volt"));
        wildPokemons.add(new ElectricPokemon("Electabuzz", 2, 40, 220, "Buzzzz"));
    }

    public Pokemon getRandomPokemon() {
        int index = random.nextInt(wildPokemons.size());
        return wildPokemons.get(index);
    }

    public void encounter(Trainer trainer) {
        Pokemon wildPokemon = getRandomPokemon();
        System.out.println("A wild " + wildPokemon.getName() + " appeared!");

        System.out.println("Do you want to catch it? (yes/no)");
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.next();

        if (choice.equalsIgnoreCase("yes")) {
            if (random.nextInt(5) == 1) {
                System.out.println("You caught " + wildPokemon.getName() + "!");
                trainer.addPokemon(wildPokemon);
            } else {
                System.out.println(wildPokemon.getName() + " escaped!");
            }
        } else {
            System.out.println("You decide not to catch " + wildPokemon.getName() + ".");
        }
    }
}
