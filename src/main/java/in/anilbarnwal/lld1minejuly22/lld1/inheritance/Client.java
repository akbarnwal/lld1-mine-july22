package in.anilbarnwal.lld1minejuly22.lld1.inheritance;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        demoInheritance();

    }

    private static void demoInheritance() {
        Lion lion = new Lion("DON");
        lion.fun();
        lion.fun("Daddy");


        List<Animal> animals = new ArrayList<>();
        animals.add(new Cat("Goldy˚"));
        animals.add(new Mammals("Bird"));
        animals.add(new Lion("White"));
        animals.add(new Dog("Dog"));

        for (Animal animal : animals) {
            animal.whoIam();
        }
    }
}
