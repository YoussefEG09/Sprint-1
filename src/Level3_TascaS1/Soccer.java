package Level3_TascaS1;

public class Soccer extends SportsNews{
    private String soccer_competition;
    private String soccer_club;
    private String player;

    public String getSoccer_competition() {
        return soccer_competition;
    }

    public void setSoccer_competition(String soccer_competition) {
        this.soccer_competition = soccer_competition;
    }

    public String getSoccer_club() {
        return soccer_club;
    }

    public void setSoccer_club(String soccer_club) {
        this.soccer_club = soccer_club;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public Soccer(String name, String text, double mark, double price, String soccer_competition, String soccer_club, String player) {

        super(name, text, mark, price);
        this.soccer_competition = soccer_competition;
        this.soccer_club = soccer_club;
        this.player = player;

    }

    @Override
    public double calculateNewsPrice() {
         double price = 300;
        if (getSoccer_competition().equalsIgnoreCase("Champions")){
            price += 100;
        } if (getSoccer_club().equalsIgnoreCase("FCBarcelona") || getSoccer_club().equalsIgnoreCase("Real Madrid")){
            price += 100;
        } if (getPlayer().equalsIgnoreCase("Ferran Torres") || getPlayer().equalsIgnoreCase("Benzema"))
            price += 50;
        return price;
    }
}
