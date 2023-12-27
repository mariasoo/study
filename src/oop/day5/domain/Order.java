package oop.day5.domain;
import java.util.List;
public class Order {

    private List<OrderLine> orderLines; //장바구니 구현
    private ShippingInfo shippingInfo;
    private Money totalAmounts; //돈을 왜 클래스로 뽑았을까?

    private OrderState state;

    public Order(List<OrderLine>orderLines,ShippingInfo shippingInfo){
        setOrderLines((orderLines));
        setShippingInfo(shippingInfo);
    }
private void setShippingInfo(ShippingInfo shippingInfo){
        if(shippingInfo == null)
            throw new IllegalArgumentException("no ShippingInfo");
        this.shippingInfo = shippingInfo;
}
    private void setOrderLines(List<OrderLine>orderLines){
        verifyLestOneOrMoreOrderLines(orderLines);
        this.orderLines = orderLines;
        calculateTotalAmounts();
    }
    private void verifyLestOneOrMoreOrderLines(List<OrderLine> orderLines) {
        if (orderLines == null || orderLines.isEmpty()) {
            throw new IllegalArgumentException("no OrderLine");
        }

    }
    private void calculateTotalAmounts(){
        int sum = orderLines.stream().mapToInt(x->x.getAmounts( )).sum();
                this.totalAmounts = new Money(sum);
    }

    //시그니처부터 구성
    public void changeShipped(ShippingInfo shippingInfo){
        verifyNotYetShipped();
        setShippingInfo(shippingInfo);
    }
    private void verifyNotYetShipped() {
        if(state != OrderState.PAYMENT_WAITING && state != OrderState.PREPARING)
            throw new IllegalArgumentException("already shipped");
    }

    public void  changeShippingInfo(ShippingInfo newShipping){}

    public void cancel(){
        verifyNotYetShipped();
        this.state= OrderState.CANCELED;
    }
    public void completePayment(){}

}
