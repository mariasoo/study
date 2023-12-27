package oop.day3.ex;

public class Add {
    //1단계
    private  int a;
    private  int b;
    private double c;
    private double d;

    Add(){}
    Add(int a, int b){
        this.a = a;
        this.b = b;
        adder(a,b);
    }
    Add(double a, double b){
        this.c = a;
        this.d = b;
        adder(a,b);
    }
    Add(int a , double b){
        this.a = a;
        this.c = b;
        adder(a,b);
      }

      public void adder(int a, int b){
        int result = a + b;
          System.out.println(result);
      }
      public void adder(double a, double b){
        double result = a + b;
          System.out.println(result);
      }
      public void adder(int a, double b){
        double result = a + b;
          System.out.println(result);
      }



}
