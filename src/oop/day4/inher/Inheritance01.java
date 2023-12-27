package oop.day4.inher;

public class Inheritance01 extends Calculation{

  Inheritance01(){}
  public Inheritance01(int number1, int number2){
    super(number1, number2);}

      public void multiplication(){
      System.out.println("두 수의 곱셈 : " + (getNumber1()*getNumber2()));
    }

}
