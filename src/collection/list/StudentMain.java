package collection.list;

public class StudentMain {
    public static void main(String[] args) {
        StudentDao studentDao = new StudentDao();
        studentDao.getStulist();
        studentDao.studentExamInsert();
        studentDao.studentRecordPrint();
        studentDao.studentPrintAll();
        studentDao.studentPickPrint();
        studentDao.studentUpdate();
    }
}
