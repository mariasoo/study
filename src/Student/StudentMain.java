package Student;

public class StudentMain {
    public static void main(String[] args) {
        System.out.println("****학생 주소록****");
        Student student1 = new Student();

        student1.insertRecord(20221004,"홍길순");
        student1.printInfo();

        Student student2 = new Student(20221005, "홍길동");
        student2.printInfo();

    }
}
