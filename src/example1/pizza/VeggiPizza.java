package example1.pizza;

public class VeggiPizza implements IPizza{
    @Override
    public void prepare() {
        System.out.println("veggi example1.pizza prepare");
    }

    @Override
    public void bake() {
        System.out.println("veggi example1.pizza bake");
    }

    @Override
    public void cut() {
        System.out.println("veggi example1.pizza cut");
    }
}
