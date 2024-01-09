package presetation;

import java.util.Arrays;
import java.util.Comparator;

public class StundentMain {
    public static void main(String[] args) {
        Student student[] = new Student[5];
        //순서대로 "이름", 학번, 학점
        student[0] = new Student("Dave", 20240001, 4.2);
        student[1] = new Student("Amie", 20160001, 4.5);
        student[2] = new Student("Emma", 20110001, 3.5);
        student[3] = new Student("Brad", 20130001, 2.8);
        student[4] = new Student("Cara", 20140001, 4.2);

        System.out.println("기본정렬 : 학번 오름차순");
        Arrays.sort(student);
        Arrays.stream(student).forEach(students -> System.out.printf("이름 : %s 학번 : %d 성적 : %.1f\n",students.name,students.id,students.score));
        //forEach(안에는 별명을 지어주어야 한다)

        System.out.println("추가정렬 : 학번 내림차순");
        Arrays.sort(student, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.score == o2.score) {
                    return Integer.compare(o1.id, o2.id); //오름차순
                }
                return Double.compare(o2.score, o1.score); //내림차순
            }
        });
        //출력
        Arrays.stream(student).limit(2).forEach(number -> System.out.printf("성적 장학금을 받을 학생 -> 이름 : %s 학번 : %d 성적 : %.1f\n",number.name,number.id,number.score));
    }
}

