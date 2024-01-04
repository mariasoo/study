package collection.list.set.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapMain {
    public static void main(String[] args) {
        Map<String, Integer> scores = new HashMap<>();
        // Map map2 = new HashMap(); // 모든 타입의 객체의 키와 값을 저장, 거의 없다.

        //이름을 Key, 점수를 Value 저장하는 map 구현
        //키 중복 허용 안함
        Integer returncheck;
        returncheck= scores.put("이수연",100);
        System.out.println(scores.get("이수연"));
        //키 값을 리턴받을 수 있음
        scores.put("이지현",90);
        scores.put("이한강",80);
        scores.put("정휘제",80);
        System.out.println(scores.get("정휘제"));
        scores.put("정휘제",80);
        //set은 중복 값을 허용하지 않음 보따리. 같은 색상의 구슬을 넣을 수 없음.
        // 일반 맵은 값은 키에 의존하고, 키에 의해 검색 된다. 반면 엔트리는 키가 값에 의존하지 않음 하나의 같은 묶음!!!

        System.out.println("총 Entry 수 "+scores.size());
        System.out.println();
        String key = "정휘제";
        Integer value = scores.get(key);
        System.out.println(key + "학생의 점수는" + value);

        //키 Set 컬렉션을 얻어와, 반복자를 통해 키와 값을 출력하기
        Set<String> keySet = scores.keySet();
        Iterator<String> keyIterator = keySet.iterator();
        while (keyIterator.hasNext()){
            String k = keyIterator.next();
            Integer v = scores.get(k);
            System.out.println(k + " : " + v);
        }
        //엔트리 Set컬렉션 을 얻어, 반복하여 키와 값을 출력하기
        Set<Map.Entry<String , Integer>> entrySet = scores.entrySet();
        Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
        //Iterator 반복자 꺼내오는 기능!!! 순서가 정해져있지 않으므로

        while(entryIterator.hasNext()){ //hasnext는 엔트리객체가 존재하는지 검사! true면 뽑을게 있는 거고, faluse면 빈 보따리...
            Map.Entry<String , Integer> entry = entryIterator.next(); //엔트리 하나 꺼내기 ->next
            String k = entry.getKey(); //키값꺼내기
            Integer v = entry.getValue(); //값꺼내기
            System.out.println(k + " : " + v);
        }
        System.out.println();
        System.out.println("변경 전 : " +scores.size());
        scores.remove("이수연");
        System.out.println("변경 후 : " +scores.size());

        scores.clear();
        System.out.println("변경 후 : "+scores.size()); //전체 삭제
    }
}
