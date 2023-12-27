package Student.Add;

public class Add {

    int a;
    int b;

    public Add(){}
   public Add(int a, int b){
       System.out.println("일반 생성자 Add(int a, int b) 호출");
       System.out.println(a + "+" + b + "=" + (a+b));
   }
   public Add(double a,double b){
       System.out.println("일반 생성자 Add(double a, double b) 호출");
       System.out.println(a + "+" + b + "=" + (a+b));
   }
   public Add(int a, double b){
       System.out.println("일반 생성자 Add(int a, double b) 호출");
       System.out.println(a + "+" + b + "=" + (a+b));
   }
}
