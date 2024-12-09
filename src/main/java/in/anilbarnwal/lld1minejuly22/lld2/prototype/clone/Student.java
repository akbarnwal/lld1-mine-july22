package in.anilbarnwal.lld1minejuly22.lld2.prototype.clone;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Student implements Cloneable{
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
       return super.clone();
    }
}
