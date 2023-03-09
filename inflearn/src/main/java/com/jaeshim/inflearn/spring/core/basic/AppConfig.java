package com.jaeshim.inflearn.spring.core.basic;

import com.jaeshim.inflearn.spring.core.basic.discount.DiscountPolicy;
import com.jaeshim.inflearn.spring.core.basic.discount.RateDiscountPolicy;
import com.jaeshim.inflearn.spring.core.basic.member.MemberRepository;
import com.jaeshim.inflearn.spring.core.basic.member.MemberService;
import com.jaeshim.inflearn.spring.core.basic.member.MemberServiceImpl;
import com.jaeshim.inflearn.spring.core.basic.member.MemoryMemberRepository;
import com.jaeshim.inflearn.spring.core.basic.order.OrderService;
import com.jaeshim.inflearn.spring.core.basic.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

  @Bean
  public MemberService memberService() {
    return new MemberServiceImpl(memberRepository());
  }

  @Bean
  public OrderService orderService() {
    return new OrderServiceImpl(memberRepository(), discountPolicy());
  }

  @Bean
  public MemberRepository memberRepository() {
    return new MemoryMemberRepository();
  }

  @Bean
  public DiscountPolicy discountPolicy() {
//    return new FixDiscountPolicy();
    return new RateDiscountPolicy();
  }
}
