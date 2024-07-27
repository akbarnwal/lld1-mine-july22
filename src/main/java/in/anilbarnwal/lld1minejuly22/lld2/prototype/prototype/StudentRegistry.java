package in.anilbarnwal.lld1minejuly22.lld2.prototype.prototype;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {
    private Map<StudentType, Student> list = new HashMap<>();

    public void register(StudentType key, Student value) {
        list.put(key, value);
    }
    public Student get(StudentType key) {
        return list.get(key);
    }
}
