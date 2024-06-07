package src;

public class FirePokemon extends Pokemon {
    public FirePokemon(String name, Integer level, Integer hp, Integer xp, String sound) {
        super(name, level, hp, xp, sound);
    }

    @Override
    public String sound() {
        return ("says: " + sound);
    }

    String[] fireAttacks ={"Inferno", "Pyroball" ,"FireLash", "FlameThrower"};

    public String pokeDexFightInfo() {
        return (getName() + " is a fire pokemon with " + fireAttacks.length + " types of attack. Their attacks are extra successful against grass pokemon. They are more vulnerable against water pokemon.");
    }

    public String useAttack (int number) {
        return (getName() + " use " + fireAttacks[number] + "!");
    }
}