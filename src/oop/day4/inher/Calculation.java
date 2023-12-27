package oop.day4.inher;

public class Calculation {

    protected int number1;
    protected int number2;

    public int getNumber1() {
        return number1;
    }

    public int getNumber2() {
        return number2;
    }

    Calculation(){}

    Calculation(int number1,int number2){
        this.number1=number1;
        this.number2=number2;
    }

        public void addition(){
            System.out.println("두 수의 덧셈 : " + (number1+number2));
        }
        public void subtraction(){
            System.out.println("두 수의 뺄셈 : " + (number1-number2));
        }
    }
