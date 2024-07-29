package in.anilbarnwal.lld1minejuly22.lld1.inheritance;

public class Lion extends Cat{
    public Lion(String name) {
        super(name);
        System.out.println("Lion created" + name);
    }

    public void fun(){
        System.out.println("Lion fun");
    }

    public void fun(String name){
        System.out.println("Lion fun name " + name);
    }


    @Override
    public void whoIam() {
        System.out.println("I am Lion");
    }
}
