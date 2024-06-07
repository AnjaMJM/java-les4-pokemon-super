package src;

public class WaterPokemon extends Pokemon{

    public WaterPokemon(String name, Integer level, Integer hp, Integer xp, String sound) {
        super(name, level, hp, xp, sound);
        }

    @Override
    public String sound() {
        return "says: " + sound + " under water";

    }
        public String pokeDexFightInfo() {
        return (getName() + " is a water pokemon with " + waterAttacks.length + " types of attack. Their attacks are extra successful against fire pokemon. They are more vulnerable against electric pokemon");
    }

    String[] waterAttacks = {"HydroPump", "HydroCanon", "RainDance",};
    public String useAttack (int number) {
        return (getName() + " use " + waterAttacks[number] + "!");
    }
}
