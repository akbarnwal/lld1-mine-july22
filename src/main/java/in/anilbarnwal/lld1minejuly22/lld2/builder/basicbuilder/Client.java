package in.anilbarnwal.lld1minejuly22.lld2.builder.basicbuilder;

public class Client {
    public static void main(String[] args) {
        StudentHelper builder = new StudentHelper();
        builder.setName("Aanya");
        builder.setAge(5);

        Student student = builder.build();
        System.out.println(student);

    }
}