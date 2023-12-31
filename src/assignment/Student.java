package assignment;

public class Student implements Comparable<Student> {
    String name; //이름
    int id; //학번
    double score; //학점
    public Student(String name, int id, double score){
        this.name = name;
        this.id = id;
        this.score = score;
    }
    public String toString(){ //출력용 toString오버라이드
        return "이름: "+name+", 학번: "+id+", 학점: "+score;
    }

    @Override
    public int compareTo(Student o) {
        return Integer.compare(id,o.id);
    }
    //return Comparator.comparingDouble((Student stuTmp) -> stuTmp.score).reversed() //반대로 출력
    //        .thenComparingInt(stuTmp -> - stuTmp.id).compare(o2,o1);
}
