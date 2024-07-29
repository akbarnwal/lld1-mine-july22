package in.anilbarnwal.lld1minejuly22.lld1.inheritance;

public class Birds extends Animal{
    public Birds(String name) {
        super(name);
        System.out.println("Birds created " + name);
    }

    @Override
    public void whoIam() {
        System.out.println("I am Bird");
    }
}
