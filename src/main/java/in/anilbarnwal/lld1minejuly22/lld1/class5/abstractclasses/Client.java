package in.anilbarnwal.lld1minejuly22.lld1.class5.abstractclasses;

public class Client {
    public static void main(String[] args) {
        demoAbstractClasses();
    }

    private static void demoAbstractClasses() {
        Mammal lion = new Lion();
        lion.eat();
        lion.move();

        Mammal whiteWhale = new WhiteWhale();
        whiteWhale.eat();
        whiteWhale.move();

    }
}
