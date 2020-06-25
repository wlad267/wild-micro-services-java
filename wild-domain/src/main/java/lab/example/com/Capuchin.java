package lab.example.com;

import java.util.ArrayList;
import java.util.List;

public class Capuchin {
    private int id;
    private List<Meal> meals;

    public Capuchin(int id) {
        this.id = id;
        this.meals = new ArrayList<>();
    }
}
