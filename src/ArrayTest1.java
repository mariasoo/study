public class ArrayTest1 {
    public static void main(String[] args) {
        // 1. 배열 선언 : 타입[] 변수명; 타입 변수[];
        // 정수형 배열 intArray를 선언하시오.
        int[] intArray = null;
        // 실수형 배열 doubleArray를 선언하시오.
        double[] doubleArray = null;
        // 문자형 배열 strArray를 선언하시오.
        String[] strArray = null;

        // 2. 배열생성 (주소값 할당)
        intArray = new int[4];
        doubleArray = new double[4];
        strArray = new String[4];

        intArray[0] = 10;
        intArray[1] = 20;
        intArray[2] = 30;
        intArray[3] = 40;

        // intArraydp 50,60,70,80 재할당
        for (int i = 0; i < intArray.length; i++) {//배열의 길이 출력
            intArray[i] += 40;
            System.out.println(intArray[i]);
        }
        for(int i = 0; i < intArray.length;i++){
            System.out.println(intArray[i]);
        }
        for(int i : intArray){
            System.out.println(i);
        }

        doubleArray = new double[4];
        strArray = new String[4];

        doubleArray = new double[4]; //10.0 11.0 12.0 13.0
        // 값 할당
        // 할당된 값을 for문을 이용해서 출력
        for(int i = 0; i < doubleArray.length; i++){
            for (int j = 0; j < doubleArray.length; j++){
                doubleArray[j] = 10.0;}
            doubleArray[i] += (double) i;
        }
        }
    }