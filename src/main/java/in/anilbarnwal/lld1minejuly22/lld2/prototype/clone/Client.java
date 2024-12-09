package in.anilbarnwal.lld1minejuly22.lld2.prototype.clone;

public class Client {

    public static void main(String[] args) {
        try {
            cloneStudent();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    private static void cloneStudent() throws CloneNotSupportedException {
        Student student = new Student("Aanya", 5);

        Student cloneStudent = (Student) student.clone();  //Will create new instance/object
        cloneStudent.setName("Aanya2");
        System.out.println(student + " " + student.getName());
        System.out.println(cloneStudent + " " + cloneStudent.getName());

        Student refStudent = student;   //Reference of the same object
        refStudent.setName("Anil");
        System.out.println(student + " " + student.getName());
        System.out.println(refStudent + " " + refStudent.getName());
    }
}
