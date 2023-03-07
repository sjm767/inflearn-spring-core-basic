package com.jaeshim.inflearn.spring.core.basic.discount;

import com.jaeshim.inflearn.spring.core.basic.member.Member;

public interface DiscountPolicy {

  /**
   * 
   * @return 할인 대상 금액
   */
  int discount(Member member,int price);

}
