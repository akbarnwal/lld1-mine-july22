package in.anilbarnwal.lld1minejuly22.lld2.builder.productionbuilder;

public class Client {
    public static void main(String[] args) {
//        StudentHelper builder = Student.getBuilder();
//        builder.setName("Anil");
//        builder.setAge(40);
//
//        Student student = builder.build();
//        System.out.println(student);

        Student.StudentHelper builder = Student.getBuilder();
        builder.setName("Aanya");
        builder.setAge(5);

        Student student = builder.build();
        System.out.println(student.getName());


        //Optimised
        Student student2 = Student
                .getBuilder()
                .setName("Aanya")
                .setAge(5)
                .build();
        System.out.println(student2.getName());




    }
}
