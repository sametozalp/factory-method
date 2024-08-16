package example1.pizzastore;

import example1.pizza.IPizza;

public abstract class PizzaStore {

    protected abstract IPizza createPizza(String type);

    public IPizza orderPizza(String type) {

        IPizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();

        return pizza;
    }
}
