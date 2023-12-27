public class ArrayCreateByValue {
    public static void main(String[] args) {
        String[] season = {"Spring", "Summer", "Fall", "Winter"};//문자열 배열 생성 후 값 할당

        //항목 값 읽기
//        System.out.println("season[0] = " + season[0]);
//        System.out.println("season[1] = " + season[1]);
//        System.out.println("season[2] = " + season[2]);
//        System.out.println("season[3] = " + season[3]);
//
//        for (String s : season) {
//            System.out.println(s);
//            System.out.printf("사계절 중 %s\n", s);
//        }
        // 인덱스 1의 값을 변경 : "여름" 값 변경
        season[1]="여름";
//        System.out.println(season[1]);
//
//        for(String s : season){
//            System.out.println(s);
//        }
        printSeason(season);

        String result = printSeason(season);

        System.out.println(result);

    }
    public static String printSeason(String[] season){
        for(String s : season){
            System.out.println(s);}
        return "출력완료";

    }

}
