package Generic;

public interface Comparator<T> {
    public int compare(T o1, T o2);
}
// 인터페이스는 메소드 내용을 채우지 않음 시그니처만 있으면 됨
// 같은 객체(T)를 받아서 비교할 것이기 때문에 타입을 하나만 받음
// 추상메소드니까 구현 필요 없음

