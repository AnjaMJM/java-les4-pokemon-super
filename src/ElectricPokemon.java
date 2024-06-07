package src;

public  class ElectricPokemon extends Pokemon {

    public ElectricPokemon(String name, Integer level, Integer hp, Integer xp, String sound) {
        super(name, level, hp, xp, sound);
    }

    @Override
    public String sound() {
        return ("says: " + sound);
    }

    public String pokeDexFightInfo() {
        return (getName() + " is an electric pokemon with " + electricAttacks.length + " types of attack. Their attacks are extra successful against water pokemon. They are more vulnerable against grass pokemon");
    }

    String[] electricAttacks = {"ElectroBall", "VoltTackle"};

    public String useAttack (int number) {
        return (getName() + " use " + electricAttacks[number] + "!");
    }


}
