package oop.isp.refactor;

import oop.isp.before.Bank;
import oop.isp.before.Duty;

import java.util.Enumeration;

/**
 * packageName : isp.domain
 * fileName : ABank
 * author :
 * date : 2023-12-27
 * description : 객체지향 원칙 인터페이스 분리 원칙(Interface Segregation Principle)
 */
public class HappyBank implements PersonalFinance,EnterpriseFinance {
    @Override
    public void doPersonalFinance() {
        System.out.println(this.messageSend(this.getClass().getSimpleName(), oop.isp.refactor.Duty.PERSONAL_FINANCE));
    }

    @Override
    public void doEnterpriseFinance() {
        System.out.println(this.messageSend(this.getClass().getSimpleName(), oop.isp.refactor.Duty.ENTERPRISE_FINANCE));
    }

}
