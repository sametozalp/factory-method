package example2.phone;

public abstract class Phone {

    protected String model;
    protected String color;

    public Phone(String model, String color) {
        this.model = model;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }
}
