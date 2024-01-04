package collection.list.linkedlist;

public class SingleLinkedList<T> {
    public Node<T> head = null;

    public class Node<T> {
        T data; //T가 모든 자료타입을 넣을 수 있는 것 제너릭
        Node<T> next = null; //다음 레벨의 주소값을 가지고 올 수 있음

        public Node(T data) {
            this.data = data;
        }
    }

    public void addNode(T data) { //head 스타트값
        if (head == null) {
            head = new Node<T>(data);
        } else {
            Node<T> node = this.head; //새로운 노드에 헤드를 넣은 것
            while (node.next != null) { //노드 넥스트가 없을 때까지 주소값을 앞의 노드에 넣어주면서 연결작업!!!
                node = node.next;
            }
            node.next = new Node<T>(data);
        }
    }
    public void printAll() {
        if (head != null) {
            Node<T> node = this.head;
            System.out.println(node.data);
            while (node.next != null) {
                node = node.next;
                System.out.println(node.data);
            }
        }
    }
    public Node<T> search(T data) {
        if (this.head == null) {
            return null;
        } else {
            Node<T> node = this.head;
            while(node != null) {
                if (node.data == data) {
                    return node;
                } else {
                    node = node.next;
                }
            }
            return null;
        }
    }
    // isData 는 data를 넣고자 하는  이전 노드 data
// 1. searchedNode 는 내가 추가하고자 하는 노드 바로 이전거
// 2. searchedNode next를 nextNode 에 저장
// 3. searchedNode next에 추가하고자 하는 노드 추가
// 4. searchedNode next 는 이제 추가 하는 노드 이므로, searchedNode next next는 추가하는 노드 next 이다
// 그래서 추가하는 노드의 next 칸에 2번에서 저장한 nextnode 저장.
    public void addNodeInside(T data, T isData) {
        Node<T> searchedNode = this.search(isData);

        if (searchedNode == null) {
            this.addNode(data);
        } else {
            Node<T> nextNode = searchedNode.next;
            searchedNode.next = new Node<T>(data);
            searchedNode.next.next = nextNode;
        }
    }
    public boolean delNode(T isData) {
        if (this.head == null) {
            return false;
        } else {
            Node<T> node = this.head;
            if (node.data == isData) {
                this.head = this.head.next;
                return true;
            } else {
                while (node.next != null) {
                    if (node.next.data == isData) {
                        node.next = node.next.next;
                        return true;
                    }
                    node = node.next;
                }
                return false;
            }
        }
    }
}