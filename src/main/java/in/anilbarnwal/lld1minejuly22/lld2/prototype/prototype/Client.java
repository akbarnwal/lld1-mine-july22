package in.anilbarnwal.lld1minejuly22.lld2.prototype.prototype;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        prototypeStudent();

//        demoRegister();

    }

    private static void demoRegister() {
        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegister(studentRegistry);

        Student student = studentRegistry.get(StudentType.STUDENT);
        Student intelligentStudent = studentRegistry.get(StudentType.STUDENT_INTELLIGENT);
        Student creativeStudent = studentRegistry.get(StudentType.STUDENT_CREATIVE);

        System.out.println( "Student: " + student);

    }

    private static void fillRegister(StudentRegistry studentRegistry) {
        List<Integer> marks = new ArrayList<>();
        marks.add(70);
        marks.add(80);
        marks.add(85);

        Student student = new Student("Aanya", 5, marks);
        IntelligentStudent intelligentStud = new IntelligentStudent("Mohi", 6, marks, 8);
        CreativeStudent creativeStud = new CreativeStudent("Gudiya", 40, marks, 9);


        studentRegistry.register(StudentType.STUDENT, student);
        studentRegistry.register(StudentType.STUDENT_CREATIVE, creativeStud);
        studentRegistry.register(StudentType.STUDENT_INTELLIGENT, intelligentStud);

        System.out.println("Student registry: " + studentRegistry);
    }

    private static void prototypeStudent() {
        List<Integer> marks = new ArrayList<>();
        marks.add(70);
        marks.add(80);
        marks.add(85);

        Student student = new Student("Aanya", 5, marks);
        IntelligentStudent intelligentStud = new IntelligentStudent("Mohi", 6, marks, 8);
        CreativeStudent creativeStud = new CreativeStudent("Gudiya", 40, marks, 9);

        Student studentRef = student;
        Student studentCopy = studentRef.copy();

        Student intelligentStudentCopy = intelligentStud;
        Student intelligentStudentCopy2 = intelligentStudentCopy.copy();

        Student creativeStudentCopy = creativeStud;
        Student creativeStudentCopy2 = creativeStudentCopy.copy();

        marks.add(10);

        System.out.println("Student: " + student);
        System.out.println("studentRef: " + studentRef);
        System.out.println("studentCopy: " + studentCopy);
        System.out.println(intelligentStud);
        System.out.println(creativeStud);
    }
}
