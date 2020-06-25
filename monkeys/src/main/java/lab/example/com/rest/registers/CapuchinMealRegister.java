package lab.example.com.rest.registers;

import java.util.HashMap;
import java.util.Map;

public class CapuchinMealRegister {

    private Map<Integer, String> meals = new HashMap<>();

    public void registerMeal(Integer capuchinId, String meal){
        meals.put(capuchinId, meal);
    }

}
