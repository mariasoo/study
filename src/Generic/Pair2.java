package Generic;

public class Pair2 <T> {
    private T first;
    private T second;

    public Pair2(T first, T second) {
        this.first = first;
        this.second = second;
    }
    public void swap(){
        T temp = first;
        first = second;
        second = temp;
    }
    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public static void main(String[] args) {
        Pair2<Integer> intpair = new Pair2<Integer>(1,2);
        System.out.println(intpair.getFirst()+" "+ intpair.getSecond());
        intpair.swap();
        System.out.println(intpair.getFirst()+" "+ intpair.getSecond());
    }
}
