import java.util.Objects;

public class Dog implements Pet, Robot {

    public void speak() {
        System.out.println("bark");
    }
    public int getBattery() {
        return 0;
    }
}
