package in.anilbarnwal.lld1minejuly22.lld2.builder.productionbuilder;

import lombok.Getter;

@Getter
public class Student {
    private String name;
    private int age;
    private String phoneNum;
    private String email;

    Student(Builder builder) {
        this.name = builder.getName();
        this.age = builder.getAge();
        this.phoneNum = builder.getPhoneNum();
        this.email = builder.getEmail();
    }

    public static Builder Builder(String name, int age){
        return new Builder(name, age);
    }

    @Getter
    public static class Builder {
        private String name;
        private int age;
        private String phoneNum;
        private String email;

        private Builder(String name, int age){
            this.name = name;
            this.age = age;
        }

        public Builder setPhoneNum(String phoneNum) {
            this.phoneNum = phoneNum;
            return this;
        }
        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }
        public Student build(){
            return new Student(this);
        }
    }
}
