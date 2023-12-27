public class Person {

    public String name;

    public int age;

    public String address;

    public String tel;

    public Person(){}  //생성자

    public Person(String name, int age, String address, String tel){
        this.name = name;
        this.age = age;
        this.address = address;
        this.tel = tel;

    }
    public void personInformation(){

        System.out.printf("%s의 나이는 %d살이고 주소는 %s이며 전화번호는 %s",this.name,this.age,this.address,this.tel);

    }

}
