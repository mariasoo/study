package collection.list.set;

public class Member implements Comparable {
    public String name;
    public Integer age;
    public Member(String name, Integer age){
        this.name = name;
        this.age = age;
    }
    public int hashCode(){
        return name.hashCode()+age;
    }
    public boolean equals(Object o){
        if(o instanceof Member m){
            return m.name.equals(name) && (m.age==age);
        } else {
            return false;
        }
    }


//    @Override
//    public int compareTo(Member o) {
//        if(age<o.age) return -1;
//        else if (age==o.age) return 0;
//        else return 1;
//    }

    //implements Comparable<Member> 오버라이딩

    @Override
    public int compareTo(Object o) {
        return 0; //김진영만 나옴. 왜지?
    }
}

