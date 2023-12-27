package oop.day5.domain;
// 열거 타입 : 상태 정보를 표현
public enum OrderState {
    //enum은 고정값이라 모두 대문자로 표시, 상수라는 뜻 값=변수=필드 상수의 집합체 정리 위해서...
    PAYMENT_WAITING,PREPARING,SHIPPED,DELIVERING,DELIVERY_COMPLETED,CANCELED;} //필드
