package in.anilbarnwal.lld1minejuly22.lld1.class5.interfaces;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Animal lion = new Lion();
//        lion.eat();
//        lion.move();
//        lion.fly();

        Animal eagle = new Eagle();
//        eagle.eat();
//        eagle.move();
//        eagle.fly();

        List<Animal> animals = new ArrayList<>();
        animals.add(lion);
        animals.add(eagle);

        for (Animal animal : animals) {
            animal.eat();
            animal.move();
            animal.fly();
        }
    }
}
