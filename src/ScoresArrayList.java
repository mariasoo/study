public class ScoresArrayList {

    public static void PrintItem (int[] scores){
        int printTotal = 0;
        double printAvg;

        System.out.printf("점수 : ");

        for(int i : scores ){
            System.out.printf("%d ",i);
            printTotal+=i;
        }
       printAvg = (double) printTotal/ scores.length;
        System.out.println();
        System.out.printf("총합 : %d ",printTotal);
        System.out.printf("평균 : %.1f",printAvg);

    }
    public static void main(String[] args) {
        int[] scores = new int[] {80, 90, 87};
        PrintItem(scores);

    }
}
