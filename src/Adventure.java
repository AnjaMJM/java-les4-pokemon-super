package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Adventure {
    private Trainer trainer;
    private WildPokemon wildPokemon;
    Random random = new Random();
    List<String> onAdventure = new ArrayList<>();


    public Adventure(Trainer trainer) {
        this.trainer = trainer;
        this.wildPokemon = new WildPokemon();
        onAdventure.add("As you walk across a field, you see something moving in the corner of you eyes.");
        onAdventure.add("You hear the leaves rustling as you walk through the forest. Suddenly you see something move in the bushes");
        onAdventure.add("The cave is dark, yet you hear the unmistakable sound of something trying to scuttle away");
        onAdventure.add("The city is starting to grow on the horizon. You can almost feel the warm bed you'll be sleeping in tonight. Suddenly you see something moving");
        onAdventure.add("You startle, when something jumps out of the bushes and blocks your path");
    }

    public void getRandomAdventure() {
        int index = random.nextInt(onAdventure.size());
        System.out.println(onAdventure.get(index));
    }

    public void start() {
        System.out.println("Welcome, " + trainer.getTrainerName() + "!");
        System.out.println("Let's go on an adventure.");

        boolean continueAdventure = true;
        Scanner scanner = new Scanner(System.in);
        while (continueAdventure) {
            getRandomAdventure();
            wildPokemon.encounter(trainer);

            System.out.println("Do you want to continue the adventure? (yes/no)");
            String choice = scanner.next();
            if (choice.equalsIgnoreCase("no")) {
                continueAdventure = false;
                System.out.println("Thank you for playing. Goodbye!");
            }
        }
    }


}

