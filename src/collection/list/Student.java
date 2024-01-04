package collection.list;

import lombok.Setter;

public class Student {

    private String stuno;

    private String name;

    @Setter
    private int kor;

    @Setter
    private int eng;
    @Setter
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
        this.name = name; //VO 클래스에서 생성자 정의를 해줌.
    }

    public int getEng() {
        return eng;
    }

    public int getMath() {
        return math;
    }
}
