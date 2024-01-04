package collection.list.linkedlist;

public class Node<T> {
    T data; //자기 데이터 갖고 있음 12
    Node<T> next = null; //새로 생성된 내 뒤의 노드의 주소값을 저장하는 공간 틀!!!
    public Node(T data){
        this.data = data;
    }
}
