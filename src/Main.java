import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Dog d1 = new Dog();
        d1.speak();

        Dog d2 = new Dog();

        List<Dog> dogs = new ArrayList<>(Arrays.asList(d1, d2));
        for (Dog dog : dogs) {
            dog.speak();
        }

        Cat c = new Cat();
        c.speak();

        // TODO: Loop over a list of cats AND dogs and call speak?
        // What would you have to do without the interface?
//        List<Object> animals = new ArrayList<>(Arrays.asList(d1, d2, c));
//
//        for (Object o: animals) {
//            if (o instanceof Dog)
//                ((Dog)o).speak();
//            if (o instanceof Cat)
//                ((Cat)o).speak();
//        }

        List<Pet> animals = new ArrayList<>(Arrays.asList(d1, d2, c));
        for (Pet p: animals) {
            p.speak();
            if (p instanceof Cat cat) {
                cat.reallyCoolCatMethod();
            }
        }
    }
}