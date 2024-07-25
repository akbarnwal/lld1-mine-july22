package in.anilbarnwal.lld1minejuly22.lld2.builder.basicbuilder;

public class Student {
    private String name;
    private int age;
    private String batch;
    private String phoneNum;
    private String email;
    private String univName;
    private  int gradYear;
    private Double psp;

    Student(StudentHelper builder){
        //Validation first

        this.name = builder.getName();
        this.age = builder.getAge();
        this.batch = builder.getBatch();
        this.phoneNum = builder.getPhoneNum();
        this.email = builder.getEmail();
        this.univName = builder.getUnivName();
        this.gradYear = builder.getGradYear();
        this.psp = builder.getPsp();
    }


}
