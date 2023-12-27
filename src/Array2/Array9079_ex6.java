package Array2;

import java.util.Scanner;

public class Array9079_ex6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][]scores = new int[3][3]; //3명 학생, 3과목


        for(int i = 0; i<3; i++) {
            System.out.printf("%d번째 학생의 점수 ", i+1);
            for (int j = 0; j < 3; j++) {
                scores[i][j] = scan.nextInt();
            }
        }


        System.out.println("     국어 영어 수학 총점");
        for(int i = 0; i<3; i++){
            int total = scores[i][0]+scores[i][1]+scores[i][2];
            System.out.printf(" %d번 %3d %3d %3d %3d\n",i+1,scores[i][0],scores[i][1],scores[i][2],total);
        }
        int korSum = 0;
        int engSum = 0;
        int mathSum = 0;

        for(int i = 0; i<3; i++){
            korSum += scores[i][0];
            engSum += scores[i][1];
            mathSum += scores[i][2];
        }
        int totalSum = korSum+engSum+mathSum;
        System.out.printf("합계 %d %d %d %d",korSum,engSum,mathSum,totalSum);
    }
}
