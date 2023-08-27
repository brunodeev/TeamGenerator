import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Leagues leagues = new Leagues();
        FranceTeams france = new FranceTeams();

        Random rand = new Random();
        int randomNumber = rand.nextInt(leagues.leagues.length);

        System.out.println(leagues.leagues[randomNumber]);

        switch (leagues.leagues[randomNumber]){
            case "Brasileirão" : System.out.println(leagues.leagues[randomNumber]);
                break;
            case "Premier League" : System.out.println(leagues.leagues[randomNumber]);
                break;
            case "Serie A" : System.out.println(leagues.leagues[randomNumber]);
                break;
            case "Ligue 1" : System.out.println(france.franceTeams[2]);
                break;
            case "Bundesliga" : System.out.println(leagues.leagues[randomNumber]);
                break;
            case "Eredivise" : System.out.println(leagues.leagues[randomNumber]);
                break;
            case "Liga Portugal" : System.out.println(leagues.leagues[randomNumber]);
                break;
        }
    }
}