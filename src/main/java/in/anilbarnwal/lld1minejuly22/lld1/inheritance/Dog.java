package in.anilbarnwal.lld1minejuly22.lld1.inheritance;

public class Dog extends Mammals{
    Dog(String name){
        super(name);
        System.out.println("Dog created" + name);
    }

    @Override
    public void whoIam() {
        System.out.println("I am a Dog");
    }
}
