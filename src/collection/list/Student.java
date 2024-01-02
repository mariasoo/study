package collection.list;

public class Student {

    private String stuno;

    private String name;

    private int kor;

    public void setKor(int kor) {
        this.kor = kor;
    }

    public void setEng(int eng) {
        this.eng = eng;
    }

    public void setMath(int math) {
        this.math = math;
    }

    private int eng;
    private int math;

    public String getStuno() {
        return stuno;
    }

    public String getName() {
        return name;
    }

    public int getKor() {
        return kor;
    }

    public Student(String stuno, String name) {
        this.stuno = stuno;
        this.name = name;
    }

    public int getEng() {
        return eng;
    }

    public int getMath() {
        return math;
    }
}
