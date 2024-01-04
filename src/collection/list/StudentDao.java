package collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentDao {
    Scanner scan = new Scanner(System.in);

    List<Student> stulist  = new ArrayList<Student>();

    public void getStulist() {

        stulist.add(new Student("1", "이수연"));
        stulist.add(new Student("2", "이한강"));
        stulist.add(new Student("3", "이지현"));
    } // Student 데이터 생성

    public void studentExamInsert(){
        for (Student student : stulist) {
            System.out.println("===================================");
            System.out.println("학생의 성적을 입력해주세요. 학번 : "+(stulist.indexOf(student)+1));
            System.out.println("국어 성적 입력");
            student.setKor(Integer.parseInt(scan.nextLine()));
            System.out.println("수학 성적 입력");
            student.setEng(Integer.parseInt(scan.nextLine()));
            System.out.println("영어 성적 입력");
            student.setMath(Integer.parseInt(scan.nextLine()));
        }
    }

    public void studentRecordPrint(){
        for (Student student : stulist) {
            System.out.println("===================================");
            System.out.print("학번 : ");
            System.out.println(student.getStuno());
            int total = (student.getKor()+student.getEng()+student.getMath());
            System.out.print("총점 :"+total);
            int avg = total/3;
            System.out.println(", 평균 :"+avg);

        }
    }
    public void studentPrintAll(){
        for (Student student : stulist) {
            System.out.println("===================================");
            System.out.println("학번 : "+ student.getStuno()+" 이름 : "+student.getName());
            System.out.println("국어 성적 : "+ student.getKor());
            System.out.println("수학 성적 : "+ student.getMath());
            System.out.println("영어 성적 : "+ student.getEng());
        }
    }

    public void studentPickPrint(){
        System.out.println("=================pickprint==================");
        System.out.println("성적을 확인 할 학번을 입력해주세요");
        String stuno = scan.nextLine();
        for (Student student : stulist) {
        if(stuno.equals(student.getStuno())){
            System.out.println("학번 : "+ student.getStuno()+" 이름 : "+student.getName());
            System.out.println("국어 성적 : "+ student.getKor());
            System.out.println("수학 성적 : "+ student.getMath());
            System.out.println("영어 성적 : "+ student.getEng());
            }
        }
    }

    // 성적을 수정한다 (성적은 이미 저장되어 있는 상태다)
    public void studentUpdate(){
        System.out.println("===================================");
        System.out.println("성적을 수정 할 학번 입력");
        String stuno = scan.nextLine();  // 비교할 학번을 입력받는다
        for (Student student : stulist) {  // 학번이 맞는 학생을 다 조회해본다
            if(student.getStuno().equals(stuno)){  // 학번이 같다면
                System.out.println("국어 성적 입력");
                 student.setKor(scan.nextInt());
                System.out.println("영어 성적 입력");
                 student.setEng(scan.nextInt());
                System.out.println("수학 성적 입력");
                 student.setMath(scan.nextInt()); //학생의 성적을 set 함수를 통해 저장한다.
            }

        }
        System.out.println("수정 완료");
        
    }


}
