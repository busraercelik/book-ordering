package java101.classes.boxing_match;

public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Muhammed Ali", 10, 100, 100, 30);
        Fighter f2 = new Fighter("Adam", 20, 85, 85, 40);

        Match match = new Match(f1, f2, 85, 100);
        match.run();
    }
}
