package in.anilbarnwal.lld1minejuly22.lld2.builder.productionbuilder;

public class Client {
    public static void main(String[] args) {
        //Optimised
        Student student = Student.Builder("Aanya", 6)
                .setEmail("Email id")
                .build();
        System.out.println(student.getName());
    }
}
