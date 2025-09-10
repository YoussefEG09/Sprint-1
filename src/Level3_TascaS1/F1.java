package Level3_TascaS1;

public class F1 extends SportsNews{
    private String f1_team;

    public String getF1_team() {
        return f1_team;
    }

    public void setTeam(String f1_team) {
        this.f1_team = f1_team;
    }

    public F1(String name, String text, double mark, double price, String f1_team) {
        super(name, text, mark, price);
        this.f1_team = f1_team;
    }

    @Override
    public double calculateNewsPrice() {
        double price = 100;
        if (getF1_team().equalsIgnoreCase("Ferrari") || getF1_team().equalsIgnoreCase("Mercedes")) {
            price += 50;
        }
        setPrice(price);
        return price;
    }

    @Override
    public double calculateNewsMark() {
        double mark = 4;

        if (getF1_team().equalsIgnoreCase("Ferrari") || getF1_team().equalsIgnoreCase("Mercedes")) {
            mark += 2;
        }
        setMark(mark);
        return mark;
    }
}
