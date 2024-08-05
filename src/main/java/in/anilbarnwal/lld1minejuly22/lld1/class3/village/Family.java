package in.anilbarnwal.lld1minejuly22.lld1.class3.village;

public class Family {

    private int privateAttribute;
    int defaultAttribute;
    protected int protectedAttribute;
    public int publicAttribute;


    private void checkAccess() {
        System.out.println("Checking access");
        System.out.println(privateAttribute);
        System.out.println(defaultAttribute);
        System.out.println(protectedAttribute);
        System.out.println(publicAttribute);
    }

    class SubFamily{
        private void checkAccess() {
            System.out.println(privateAttribute);
        }
    }


}
