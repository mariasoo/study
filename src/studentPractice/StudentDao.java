package studentPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentDao {

    List<Student> stuList = new ArrayList<Student>();

    Scanner scan = new Scanner(System.in);

    public void getStuList(){
        stuList.add(new Student("1","이수연"));
        stuList.add(new Student("2","이한강"));
    }

    public void studentExamInsert(){

    }

}
