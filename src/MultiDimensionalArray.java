public class MultiDimensionalArray {
    public static void main(String[] args) {
        //2반 한반당 학생수 5명만 2차원 배열 scores를 생성하세요. 1반(90,80,70,80,50) 2반(90,100,80,70,88)

        int[][] scores = {{90,80,70,80,50},{90,100,80}}; //2행 5열

        // 배열 scores 길이 [반]

        System.out.println(scores.length); //반 갯수
        //첫번째 반의 학생 수
        System.out.println(scores[0].length);
        //두번째 반의 학생 수
        System.out.println(scores[1].length);
        // 1반의 모든 학생의 점수 출력
        System.out.println(scores[0][0]); //1반의 1번 학생 점수
        System.out.println(scores[0][1]);
        System.out.println(scores[0][2]);
        System.out.println(scores[0][3]);
        System.out.println(scores[0][4]);
        //2반의 모든 학생의 점수 출력
        System.out.println(scores[1][0]);
        System.out.println(scores[1][1]);
        System.out.println(scores[1][2]);

        //1반의 총합과 평균을 구하여 출력
        int total1 = 0;
        for(int i = 0; i <scores[0].length; i++){
            total1 += scores[0][i]; //반은 고정이므로
        }
        double average = (double) (total1/scores[0].length);
        System.out.printf("average : %.1f",average);

        //2반의 총합과 평균을 구하여 출력


    }
}
