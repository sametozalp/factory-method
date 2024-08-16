package example2.phone;

public class S8 extends Phone{

    public S8(String model, String color) {
        super(model, color);
    }

    @Override
    public String toString() {
        return "S8{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
