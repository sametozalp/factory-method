package example1.pizzastore;

import example1.pizza.CheesePizza;
import example1.pizza.IPizza;
import example1.pizza.VeggiPizza;

public class AnkaraPizzaStore extends PizzaStore {

    @Override
    protected IPizza createPizza(String type) {
        return switch (type){
            case "cheese" -> new CheesePizza();
            case "veggi" -> new VeggiPizza();
            default -> throw new IllegalArgumentException("Invalid example1.pizza type");
        };
    }
}