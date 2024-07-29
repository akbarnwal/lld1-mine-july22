package in.anilbarnwal.lld1minejuly22.lld1.inheritance;

public class Reptiles extends Animal{
    public Reptiles(String name) {
        super(name);
        System.out.println("Reptiles created" + name);
    }

    @Override
    public void whoIam() {
        System.out.println("I am Reptile");
    }
}
