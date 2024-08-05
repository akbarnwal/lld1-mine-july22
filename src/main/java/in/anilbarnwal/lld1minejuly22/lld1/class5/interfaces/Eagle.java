package in.anilbarnwal.lld1minejuly22.lld1.class5.interfaces;

public class Eagle implements Bird{
    @Override
    public void move() {
        System.out.println("Eagle moves");
    }

    @Override
    public void eat() {
        System.out.println("Eagle eats");

    }

    @Override
    public void fly() {
        System.out.println("Eagle flies");
    }
}
