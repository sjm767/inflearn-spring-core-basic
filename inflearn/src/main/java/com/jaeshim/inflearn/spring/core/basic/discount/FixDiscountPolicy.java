package com.jaeshim.inflearn.spring.core.basic.discount;

import com.jaeshim.inflearn.spring.core.basic.member.Grade;
import com.jaeshim.inflearn.spring.core.basic.member.Member;

public class FixDiscountPolicy implements DiscountPolicy{

  private int discountFixAmount = 1000; //1000원 할인
  @Override
  public int discount(Member member, int price) {
    if (member.getGrade() == Grade.VIP) {
      return discountFixAmount;
    }
    return 0;
  }
}
