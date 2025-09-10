package Level3_TascaS1;

public abstract class SportsNews {
    private String title;
    private String text;
    private double mark;
    private double price;


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public double getMark() {
        return mark;
    }

    public void setMark(double mark) {
        this.mark = mark;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public SportsNews(String name, String text, double mark, double price){
        this.title = title;
        this.text = text;
        this.mark = mark;
        this.price = price;

    }

    public abstract double calculateNewsPrice();

    public abstract double calculateNewsMark();
}
