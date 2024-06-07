package src;

public abstract class Pokemon {
    private String name;
    private Integer level;
    private Integer hp;
    private Integer xp;
    public String sound;

    public Pokemon(String name, Integer level, Integer hp, Integer xp, String sound) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.xp = xp;
        this.sound = sound;
    }


    public abstract String sound();

    public String attack() {
        return (getName() + ", attack!");
    }

    public String defend() {
        return (getName() + ", defend!");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp){
        this.hp = hp;
    }

    public Integer getXp() {
        return xp;
    }

    public void setXp(Integer xp) {
        this.xp = xp;
    }


    public String pokeDex() {
         return ("this is a " + getName() + " of level " + getLevel() + " with " + getHp() + " hit points and " + getXp() + " experience points");
    }

    public String choosePokemon() {
        return (getName() + ", I choose you!");
    }
}
