package in.anilbarnwal.lld1minejuly22.lld2.builder.productionbuilder;

import lombok.Getter;

@Getter
public class Student {
    private String name;
    private int age;
    private String batch;
    private String phoneNum;
    private String email;
    private String univName;
    private  int gradYear;
    private Double psp;

    Student(StudentHelper builder) {
        this.name = builder.getName();
        this.age = builder.getAge();
        this.batch = builder.getBatch();
        this.phoneNum = builder.getPhoneNum();
        this.email = builder.getEmail();
        this.univName = builder.getUnivName();
        this.gradYear = builder.getGradYear();
        this.psp = builder.getPsp();
    }

    public static StudentHelper getBuilder(){
        return new StudentHelper();
    }

    @Getter
    public static class StudentHelper {
        private String name;
        private int age;
        private String batch;
        private String phoneNum;
        private String email;
        private String univName;
        private  int gradYear;
        private Double psp;

        public StudentHelper setName(String name) {
            this.name = name;
            return this;
        }

        public StudentHelper setAge(int age) {
            this.age = age;
            return this;
        }
        public StudentHelper setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public StudentHelper setPhoneNum(String phoneNum) {
            this.phoneNum = phoneNum;
            return this;
        }
        public StudentHelper setEmail(String email) {
            this.email = email;
            return this;
        }

        public StudentHelper setUnivName(String univName) {
            this.univName = univName;
            return this;
        }
        public StudentHelper setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }
        public StudentHelper setPsp(Double psp) {
            this.psp = psp;
            return this;
        }

        public Student build(){
            return new Student(this);
        }
    }




}
