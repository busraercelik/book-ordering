package java101.classes.boxing_match;

public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;
    double chance;

    public Fighter(String name, int damage, int health, int weight, double dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        if (dodge >= 0 && dodge <= 100) {
            this.dodge = dodge;
        } else {
            this.dodge = 0;
        }
        this.dodge = dodge;
        this.chance = Math.random() * 100;
    }

    int hitOpponent(Fighter opponent) {
        System.out.println(this.name + " gave "+ this.damage + " damage to => " + opponent.name);

        if (opponent.canDodge()) {
            System.out.println(opponent.name + " has dodged the damage");
            return opponent.health;
        }

        if (opponent.health - this.damage < 0){
            return 0;
        }
        return opponent.health - this.damage;
    }

    boolean canDodge() {
        double randomNo = Math.random() * 100;
        return randomNo <= this.dodge;
    }




}
