package example2.phone;

public class PhoneFactory {

    public static Phone getPhone(String model, String color) {

        if("s8".equalsIgnoreCase(model)) {
            return new S8(model, color);
        } else if("note8".equalsIgnoreCase(model)) {
            return new Note8(model, color);
        } else {
            throw new IllegalArgumentException("Invalid model: " + model);
        }
    }
}
