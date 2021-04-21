package java8;

import java.util.Optional;

public class OptionalTest {

    public static void main(String args[]) {
        Person p = null;

        if (Optional.ofNullable(p).isPresent()) {
            System.out.println("null check avoid");
        }
    }

}
