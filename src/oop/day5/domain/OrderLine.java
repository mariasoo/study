package oop.day5.domain;
//주문은 '출고상태 변경하기', '배송지 정보 변경하기', '주문취소하기', '결제완료하기'
//한 상품(Product)을 얼마에 (price) 몇 개 살지 (quantity) 담고, CalculatAmounts()구매 가격 계산 로직 구현


//주문항목 표현 클래스 : 주문할 상품, 상품의 가격, 구매 개수, 각 구매 항목의 구매 가격 제공
public class OrderLine {
    private Product product;
    private int price;
    private int quantity;
    private int amounts;

    public int getAmounts() {
        return amounts;
    }

    public OrderLine(Product product, int price, int quantity) {
        this.product = product;
        this.price = price;
        this.quantity = quantity;
        this.amounts = this.calculateAmounts();
    }
    private int calculateAmounts(){
        return this.price * quantity;
    }
}
