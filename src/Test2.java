public class Test2 {
    public static void main(String[] args) {
        //주소값을 비교할 때는 동등비교연산자를 사용. == !=
        //정수형 배열 변수 array1 선언
        int[] array1 = null;
        //정수형 배열 변수 array2 선언
        int[] array2 = null;
        //정수형 배열 변수 array3 선언
        int[] array3 = null;

        int[] array4 = null;
        array4 = new int[3];
        System.out.println(array4);//값이 할당되지 않음
        System.out.println(array4.toString());//이게 주소값비교!!!
        array4[0] = 10;
        System.out.println(array4[0]);

        //배열 { 1, 2, 3 }을 생성하고 array1 변수에 대입
        array1 = new int[] {1,2,3}; //array1 정수형 배열을 생성하고 초기화 한꺼번에 정의
        //배열 { 1, 2, 3 }을 생성하고 array2 변수에 대입
        array2 = new int[3];//크기 설정
        array2[0] = 1;
        array2[1] = 2;
        array2[2] = 3;
        //배열 변수 arr2의 값을 배열 변수 array3에 대입
        array3 = array2; //같은 주소값!!
         boolean result = (array1 == array2);
         boolean result1 = (array1 == array3);

        // array1과 array2 변수가 같은 배열을 참조하는지 검사
        System.out.println(array1.hashCode() == array2.hashCode());
        System.out.println(array1.equals(array2));
        // array2와 array3 변수가 같은 배열을 참조하는지 검사
        System.out.println(array2.hashCode() == array3.hashCode());
        System.out.println(array2.equals(array3));

        System.out.println(result);
        System.out.println(result1);
    }
}
