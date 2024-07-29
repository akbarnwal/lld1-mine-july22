package in.anilbarnwal.lld1minejuly22.lld1.inheritance;

public class Mammals extends Animal {
    Mammals(String name) {
        super(name);
        System.out.println("Mammals created" + name);
    }

    @Override
    public void whoIam() {
        System.out.println("I am a Mammal");
    }
}
