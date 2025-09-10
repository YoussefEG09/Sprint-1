package Level3_TascaS1;

import java.util.ArrayList;
import java.util.List;

public class Writer  {
    private String name;
    private final String id;
    private static double salary = 1500;

    private final List<SportsNews> news;


    public Writer(String name, String id) {
        this.name =name;
        this.id = id;
        this.news = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public double getSalary(){
        return salary;
    }

    public List<SportsNews> getNews() {
        return news;
    }

    public void addNews(SportsNews sportnew){
            news.add(sportnew);
    }

    public void deleteNews(SportsNews sportnew){
        news.add(sportnew);
    }




}
