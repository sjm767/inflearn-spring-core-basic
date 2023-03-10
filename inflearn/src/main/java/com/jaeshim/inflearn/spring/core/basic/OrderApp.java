package com.jaeshim.inflearn.spring.core.basic;

import com.jaeshim.inflearn.spring.core.basic.member.Grade;
import com.jaeshim.inflearn.spring.core.basic.member.Member;
import com.jaeshim.inflearn.spring.core.basic.member.MemberService;
import com.jaeshim.inflearn.spring.core.basic.order.Order;
import com.jaeshim.inflearn.spring.core.basic.order.OrderService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class OrderApp {

  public static void main(String[] args) {
//    AppConfig appConfig = new AppConfig();
//    MemberService memberService = appConfig.memberService();
//    OrderService orderService = appConfig.orderService();

    ApplicationContext applicationContext = new AnnotationConfigApplicationContext(
        AppConfig.class);
    MemberService memberService = applicationContext.getBean("memberService", MemberService.class);
    OrderService orderService = applicationContext.getBean("orderService", OrderService.class);

    Long memberId = 1L;
    Member member = new Member(memberId, "memberA", Grade.VIP);

    memberService.join(member);
    Order order = orderService.createOrder(memberId, "itemA", 10000);

    System.out.println("order = " + order);
  }
}
