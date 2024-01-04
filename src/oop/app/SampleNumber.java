package oop.app;

public class SampleNumber implements Comparable<SampleNumber>{

    private int first;
    public int second;
    public int third;

    public SampleNumber(int first, int second, int third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    @Override
    public String toString() {
        return "SampleNumber{" +
                "first=" + first +
                ", second=" + second +
                ", third=" + third +
                '}';
    }

    @Override
    public int compareTo(SampleNumber o) {
        int result = Integer.compare(first, o.first); //현재 객체와 전달받은 객체를 비교해서 result에 넣겠다
        if(result == 0){
            result = Integer.compare(second, o.second); //내부적으로 한번 더 비교
            if(result == 0){
                result = Integer.compare(third, o.third);//또 비교 심층적인 비교가 필요할 때 음수 양수 0만 리턴 가능. 내부적인 구현은 제한 없음.
            }
        }
        return result;
    }
}
