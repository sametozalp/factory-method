package example2;

import example2.phone.Phone;
import example2.phone.PhoneFactory;

public class Main {
    public static void main(String[] args) {

        Phone phone = PhoneFactory.getPhone("s8", "red");
        System.out.println(phone.toString());

    }
}
