public class Test1 {

    public static void childMethod(){
        System.out.println("Child Method!");

    }
    public static void main(String[] args) {
        int value = 5;
        System.out.println(value);
        //String name=null;//초기화 되었다는 뜻
        String name = "Java";
        String name1 = "Java";
        String name2 = "Java";
        String name3 = "Java";
        String name4 = new String("Java");

        System.out.println(name.hashCode() == name1.hashCode()); //주소값 비교
        System.out.println(name1.equals(name));//값 비교
        System.out.println(name1.hashCode());
        System.out.println(name2.hashCode());
        System.out.println(name1.equals(name3));
        childMethod();


    }
}
