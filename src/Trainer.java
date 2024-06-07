package src;

import java.util.ArrayList;
import java.util.Scanner;

public class Trainer {
    private String trainerName;
    private static String trainerSpecialty;
    private ArrayList<Pokemon> pokemonList;

    public Trainer (String name) {
        trainerName = name;
        this.pokemonList = new ArrayList<>();
    }
    public String getTrainerName() {
        return trainerName;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }

    public static void chooseSpecialty() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you specialise in specific pokémon? Options: fire, water, grass, electric, no specialty");

        trainerSpecialty=scanner.next();
    }

    public String getTrainerSpecialty() {
        return (trainerName + " has specialty: " + trainerSpecialty);
    }

    public void addPokemon(Pokemon pokemon) {
        pokemonList.add(pokemon);
    }

}
