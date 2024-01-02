package collection.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentDao {
    Scanner scan = new Scanner(System.in);

    List<Student> stulist  = new ArrayList<Student>();

    public List<Student> getStulist() {
        List<Student> stulist = new ArrayList<Student>();

        stulist.add(new Student("1", "이수연"));
        stulist.add(new Student("2", "이한강"));
        stulist.add(new Student("3", "이지현"));
        return stulist;
    }

    public void studentExamInsert(){
        for (Student student : stulist) {
            System.out.println("국어 성적 입력");
            student.setKor(scan.nextInt());
            System.out.println("수학 성적 입력");
            student.setEng(scan.nextInt());
            System.out.println("영어 성적 입력");
            student.setMath(scan.nextInt());
        }
    }

    public void studentRecordPrint(){
        for (Student student : stulist) {
            System.out.println("학번");
            System.out.println(student.getStuno());
            int total = (student.getKor()+student.getEng()+student.getMath());
            System.out.println(total);
            int avg = total/3;
            System.out.println(avg);
        }
    }
    public void studentPrintAll(){
        for (Student student : stulist) {
            System.out.println("학번 : "+ student.getStuno()+" 이름 : "+student.getName());
            System.out.println("국어 성적 : "+ student.getKor());
            System.out.println("수학 성적 : "+ student.getMath());
            System.out.println("영어 성적 : "+ student.getEng());
        }
    }

    public void studentPickPrint(){
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
    public void studentUpdate(){
        
    }


}
