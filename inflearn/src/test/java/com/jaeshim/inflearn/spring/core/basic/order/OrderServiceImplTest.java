package com.jaeshim.inflearn.spring.core.basic.order;

import static org.assertj.core.api.Assertions.assertThat;

import com.jaeshim.inflearn.spring.core.basic.discount.FixDiscountPolicy;
import com.jaeshim.inflearn.spring.core.basic.member.Grade;
import com.jaeshim.inflearn.spring.core.basic.member.Member;
import com.jaeshim.inflearn.spring.core.basic.member.MemberRepository;
import com.jaeshim.inflearn.spring.core.basic.member.MemoryMemberRepository;
import org.junit.jupiter.api.Test;

class OrderServiceImplTest {


  @Test
  void createOrder(){
    MemberRepository memoryMemberRepository = new MemoryMemberRepository();
    OrderService orderService = new OrderServiceImpl(memoryMemberRepository,new FixDiscountPolicy());
    memoryMemberRepository.save(new Member(1L, "name", Grade.VIP));
    Order order = orderService.createOrder(1L, "iteamA", 10000);

    assertThat(order.getDiscountPrice()).isEqualTo(1000);
  }
}