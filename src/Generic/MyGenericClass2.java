package Generic;

public class MyGenericClass2 {

    public static <T> void swap(T[] array, int i, int j) {

        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("==Before swap==");
        for(Integer number : intArray){
            System.out.println(number+" ");
        }
        System.out.println();
        swap(intArray, 1, 3);

        System.out.println("==After swap==");
        for(Integer number : intArray){
            System.out.println(number+" ");
        }

    }

}

