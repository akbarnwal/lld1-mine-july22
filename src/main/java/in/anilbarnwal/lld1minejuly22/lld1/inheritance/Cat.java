package in.anilbarnwal.lld1minejuly22.lld1.inheritance;

public class Cat extends Mammals{
    Cat(String name) {
        super(name);
        System.out.println("Cat created" + name);
    }

    @Override
    public void whoIam() {
        System.out.println("I am Cat");
    }
}
