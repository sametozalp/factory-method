package example2.phone;

public class Note8 extends Phone{

    public Note8(String model, String color) {
        super(model, color);
    }

    @Override
    public String toString() {
        return "Note8{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
