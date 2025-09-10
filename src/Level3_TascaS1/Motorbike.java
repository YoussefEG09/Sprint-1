package Level3_TascaS1;

public class Motorbike extends SportsNews{
    private String moto_team;

    public Motorbike(String name, String text, double mark, double price, String moto_team) {
        super(name, text, mark, price);
        this.moto_team = moto_team;
    }

    public String getMoto_team() {
        return moto_team;
    }

    public void setMoto_team(String moto_team) {
        this.moto_team = moto_team;
    }

    @Override
    public double calculateNewsPrice() {
        double price = 100;
        if (getMoto_team().equalsIgnoreCase("Honda") || getMoto_team().equalsIgnoreCase("Yamaha")){
            price += 50;
        }
        setPrice(price);
        return price;
    }

    @Override
    public double calculateNewsMark() {
        double mark = 3;

        if (getMoto_team().equalsIgnoreCase("Honda") || getMoto_team().equalsIgnoreCase("Yamaha")){
            mark += 3;
        }
        setMark(mark);
        return mark;
    }
}
