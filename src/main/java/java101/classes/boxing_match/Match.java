package java101.classes.boxing_match;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void run() {
        if (isWeightInRange()) {
            giveFirstPunchAccordingToChance();
            // beat each other one by one
            while (this.f1.health > 0 && this.f2.health >0) {
                System.out.println("======= NEW ROUND =======");
                this.f2.health = this.f1.hitOpponent(f2);
                if (hasWon()) {
                    break;
                }
                this.f1.health = this.f2.hitOpponent(f1);
                if (hasWon()) {
                    break;
                }
                System.out.println(this.f1.name + "'s health => " + this.f1.health);
                System.out.println(this.f2.name + "'s health => " + this.f2.health);
            }
        } else {
            System.out.println("Athletes' weight category does not match!");
        }
    }

    void giveFirstPunchAccordingToChance() {
        System.out.println("======= FIRST ROUND =======");
        System.out.println(this.f1.name + "'s chance " + this.f1.chance + "\n" + this.f2.name + "'s chance " + this.f2.chance );

        if(this.f1.chance > this.f2.chance) {
            this.f2.health = this.f1.hitOpponent(f2);
        } else {
            this.f1.health = this.f2.hitOpponent(f1);
        }
    }

    boolean isWeightInRange() {
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) &&
                (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    boolean hasWon() {
        if (this.f1.health == 0) {
            System.out.println(this.f2.name + " has won!");
            return true;
        } else if (this.f2.health == 0) {
            System.out.println(this.f1.name + " has won!");
            return true;
        }
        return false;
    }
}
