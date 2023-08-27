import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Leagues leagues = new Leagues();
        Random rand = new Random();
        int randomNumber = rand.nextInt(leagues.leagues.length);

        System.out.println(leagues.leagues[randomNumber]);
    }
}