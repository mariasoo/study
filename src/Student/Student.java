package Student;

public class Student {
    int id;
    String name;

    Student(){
        System.out.println("기본 생성자 Student() 호출");
    }

    Student(int id , String name){
        System.out.println("일반 생성자 Student(...) 호출");
        this.id = id;
        this.name = name;
    }
    void insertRecord(int id,String name){
        this.id = id;
        this.name = name;
    }
    void printInfo(){
        System.out.println("아이디: "+id);
        System.out.println("이름: "+name);

    }
}
