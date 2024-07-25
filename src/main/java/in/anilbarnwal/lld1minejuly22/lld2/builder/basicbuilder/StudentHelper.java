package in.anilbarnwal.lld1minejuly22.lld2.builder.basicbuilder;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class StudentHelper {
    private String name;
    private int age;
    private String batch;
    private String phoneNum;
    private String email;
    private String univName;
    private  int gradYear;
    private Double psp;

    public Student build(){
        return new Student(this);
    }
}
