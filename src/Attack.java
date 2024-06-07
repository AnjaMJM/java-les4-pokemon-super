package src;

public class Attack {
    private String attack;
    private Integer damage;

    public Attack(String attack, Integer damage){
        this.attack=attack;
        this.damage=damage;
    }

    public String getAttack(){
        return attack;
    }

    public Integer getDamage(){
        return damage;
    }
}
