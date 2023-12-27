import java.util.ArrayList;

public class Test3 {
    public static void main(String[] args) {
        //1.
        String blank = "";
        if(blank.equals("")){
            System.out.println("blank가 참조하는 String 객체는 빈 문자열");
        }
        //2-1.문자 추출
        //문자열에서 특정 위치의 "시험은 역시 나를 성장케 해!"
        //'성' ==> charAt(index) ==> 문자열의 길이(0~ 문자열의 길이 -1)
        String subject = "자바 네트워크 프로그래밍";
        char charValue = subject.charAt(4);
        System.out.println(charValue);
        StringBuilder sb = new StringBuilder();
        sb.append("자바").append("네트워크");
        String str = sb.toString();
        System.out.println(sb.toString() + " " + str);

//        for(int i = 3; i<7; i++){
//            StringBuilder
//            System.out.printf("%s",subject.charAt(i));
//        }
        //String str += subject.charAt(i);
        //StringBuffer str; subject.charAt(i)

        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("1, ");
        arrayList.add("2, ");
        arrayList.add("3, ");
        arrayList.add("4, ");
        arrayList.add("5, ");

        for(int i = 0; i < arrayList.size();i++){
            sb.append(arrayList.get(i));

        }
            System.out.println(sb. toString());

        String oldStr = "자바 문자열은 불변의 특징이 있다. 자바 문자열은 String타입이다.";
        String newStr = String.valueOf(oldStr).replace("자바","Java");
        System.out.println(newStr);
        //String newStr = String 클래스를 참조하여 "자바" ==> 영문 자바로 교체 "Java"
        //교체 기능 메소드를 찾아내기

        //String newStr = oldStr.replace("자바","Java");

        //3. 문자열 잘라내기 substring
        System.out.println("이수연".substring(0,1)); //substring(시작, 끝 값)
        //"Java 문자열은 불변의 특징이 있다. Java 문자열은 String타입니다."
        String result1 = oldStr.substring(20);
        String result2 = oldStr.substring(20,26);
        System.out.println(result1);
        System.out.println(result2);

        //ssn : 880123-4234567 2023년 현재 나이와 성별을 출력하는 코드 작성
        String ssn ="880123-4234567";
        int age = Integer.parseInt(ssn.substring(0,2));
        System.out.println(age);
        String gender = ssn.substring(7,8); //char gender = ssn.charAt(7);
        System.out.println(gender);

        System.out.printf("%d 살이고 %s 입니다.",age,gender);

        //indexOf() return 값 확인(특정 문자열의 위치를 찾을 때 사용)
        //subject = "자바 네트워크 프로그래밍"; 프로그래밍 문자열의 존재 여부
        int index = subject.indexOf("프로그래밍");
        if(index == -1){
            System.out.println("존재하지 않는 문자열입니다.");
        } else{
            System.out.println(index);
            System.out.println("존재합니다.");
        }
        //오버로딩 기법 같은 이름의 메서드에 매개변수의 종류나 개수를 달리하여 만드는 것
        boolean subjectContain = subject.contains("프로그래밍");
        if(subjectContain == true){
            System.out.println("포함되어 있습니다.");
        } else{
            System.out.println("포함되어 있지 않습니다.");
        }

        //splitOf() return 값 확인 String[]
        String board = "번호, 제목, 내용, 이름";
        String[] th = board.split(",");
        for(int i = 0; i<th.length;i++){
            System.out.print(th[i] + " ");
        }
    }
}
