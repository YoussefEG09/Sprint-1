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
        return 0;
    }
}
