package com.jaeshim.inflearn.spring.core.basic;

import com.jaeshim.inflearn.spring.core.basic.member.Grade;
import com.jaeshim.inflearn.spring.core.basic.member.Member;
import com.jaeshim.inflearn.spring.core.basic.member.MemberServiceImpl;
import com.jaeshim.inflearn.spring.core.basic.order.Order;
import com.jaeshim.inflearn.spring.core.basic.order.OrderServiceImpl;

public class OrderApp {

  public static void main(String[] args) {
    MemberServiceImpl memberService = new MemberServiceImpl();
    OrderServiceImpl orderService = new OrderServiceImpl();

    Long memberId = 1L;
    Member member = new Member(memberId, "memberA", Grade.VIP);

    memberService.join(member);
    Order order = orderService.createOrder(memberId, "itemA", 10000);

    System.out.println("order = " + order);
  }
}
