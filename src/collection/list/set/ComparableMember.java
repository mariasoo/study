package collection.list.set;

import java.util.Collections;
import java.util.TreeSet;

public class ComparableMember {
    public static void main(String[] args) {

        TreeSet <Member> members = new TreeSet<>();

        //객체 저장
        members.add(new Member("김진영",22));
        members.add(new Member("김진아",21));
        members.add(new Member("김소영",21));
        members.add(new Member("박소영",25));

        System.out.println(members.size());

        for (Member member : members) {
            System.out.println(member.name + " "+ member.age);

        }

    }
}
