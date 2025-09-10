package Level3_TascaS1;

public class Tennis extends SportsNews{
    private String tennis_competition;
    private String players;


    public Tennis(String name, String text, double mark, double price, String tennis_competition, String players) {
        super(name, text, mark, price);
        this.tennis_competition = tennis_competition;
        this.players = players;

    }

    public String getTennis_Competition() {
        return tennis_competition;
    }

    public void setTennis_competition(String competition) {
        this.tennis_competition = competition;
    }

    public String getPlayers() {
        return players;
    }

    public void setPlayers(String players) {
        this.players = players;
    }
}
