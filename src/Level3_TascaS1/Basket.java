package Level3_TascaS1;

public class Basket extends SportsNews {
    private String basket_competition;
    private String basket_club;

    public String getBasket_Competition() {
        return basket_competition;
    }

    public void setBasket_Competition(String basket_competition) {
        this.basket_competition = basket_competition;
    }

    public String getBasket_Club() {
        return basket_club;
    }

    public void setBasket_Club(String basket_club) {
        this.basket_club = basket_club;
    }

    public Basket(String name, String text, double mark, double price, String basket_competition, String basket_club) {

        super(name, text, mark, price);
        this.basket_competition = basket_competition;
        this.basket_club = basket_club;

    }

    @Override
    public double calculateNewsPrice() {
        double price = 250;
        if (getBasket_Competition().equalsIgnoreCase("Euroliga")) {
            price += 100;
        }
        if (getBasket_Club().equalsIgnoreCase("FCBarcelona") || getBasket_Club().equalsIgnoreCase("Real Madrid")) {
            price += 100;
        }
        setPrice(price);
        return price;
    }

    @Override
    public double calculateNewsMark() {
        double mark = 4;
        if (getBasket_Competition().equalsIgnoreCase("Euroliga")) {
            mark += 3;
        } else if (getBasket_Competition().equalsIgnoreCase("ACB")) {
            mark += 2;
        }
        if (getBasket_Club().equalsIgnoreCase("FCBarcelona") || getBasket_Club().equalsIgnoreCase("Real Madrid")) {
            mark += 1;
        }
        setMark(mark);
        return mark;
    }
}
