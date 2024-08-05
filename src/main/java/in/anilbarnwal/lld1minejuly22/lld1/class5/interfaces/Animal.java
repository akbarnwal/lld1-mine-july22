package in.anilbarnwal.lld1minejuly22.lld1.class5.interfaces;

public interface Animal {
    void move();
    void eat();
    default void fly(){
        System.out.println("Oops can't fly");
    }
}
