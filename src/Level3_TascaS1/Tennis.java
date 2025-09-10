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

    @Override
    public double calculateNewsPrice() {
        double price = 150;
        if (getPlayers().equalsIgnoreCase("Federer") || getPlayers().equalsIgnoreCase("Nadal")
                || getPlayers().equalsIgnoreCase("Djokovic")) {
            price += 100;
        }
        setPrice(price);
        return price;
    }

    @Override
    public double calculateNewsMark() {
        double mark = 4;

        if (getPlayers().equalsIgnoreCase("Federer") || getPlayers().equalsIgnoreCase("Nadal")
                || getPlayers().equalsIgnoreCase("Djokovic")){
            mark += 3;
        }
        setMark(mark);
        return mark;
    }
}
