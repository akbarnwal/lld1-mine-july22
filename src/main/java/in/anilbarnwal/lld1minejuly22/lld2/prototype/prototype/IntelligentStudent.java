package in.anilbarnwal.lld1minejuly22.lld2.prototype.prototype;

import java.util.List;

public class IntelligentStudent extends Student{
    private int iq;

    IntelligentStudent(String name, int age, List<Integer> marks, int iq) {
        super(name, age, marks);
        this.iq = iq;
    }
    IntelligentStudent(IntelligentStudent student){
        super(student);
        this.iq = student.iq;
    }

    @Override
    public IntelligentStudent copy(){
        return new IntelligentStudent(this);
    }
}
