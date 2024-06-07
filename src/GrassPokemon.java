package src;

public class GrassPokemon extends Pokemon{
    String sound;
    public GrassPokemon(String name, Integer level, Integer hp, Integer xp, String sound) {
        super(name, level, hp, xp, sound);
    }

    @Override
    public String sound() {
        return "says: " + sound + " under in the leaves";
    }

        public String pokeDexFightInfo() {
        return (getName() + " is a grass pokemon with " + grassAttacks.length + " types of attack. Their attacks are extra successful against electric pokemon. They are more vulnerable against fire pokemon");
    }

    String[] grassAttacks = {"LeafStorm", "LeechSeed", "LeaveBlade",};

    public String useAttack (int number) {
        return (getName() + " use " + grassAttacks[number] + "!");
    }


}
