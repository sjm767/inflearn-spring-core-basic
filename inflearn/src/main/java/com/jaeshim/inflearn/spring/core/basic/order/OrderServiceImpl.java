package com.jaeshim.inflearn.spring.core.basic.order;

import com.jaeshim.inflearn.spring.core.basic.annotation.MainDiscountPolicy;
import com.jaeshim.inflearn.spring.core.basic.discount.DiscountPolicy;
import com.jaeshim.inflearn.spring.core.basic.member.Member;
import com.jaeshim.inflearn.spring.core.basic.member.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OrderServiceImpl implements OrderService {

  private final MemberRepository memberRepository;
  private final DiscountPolicy discountPolicy;

  @Autowired
  public OrderServiceImpl(MemberRepository memberRepository, @MainDiscountPolicy DiscountPolicy discountPolicy) {
    this.memberRepository = memberRepository;
    this.discountPolicy = discountPolicy;
  }

  @Override
  public Order createOrder(Long memberId, String itemName, int itemPrice) {

    Member member = memberRepository.findById(memberId);
    int discountPrice = discountPolicy.discount(member, itemPrice);

    return new Order(memberId, itemName, itemPrice, discountPrice);
  }

  //테스트 용도
  public MemberRepository getMemberRepository() {
    return memberRepository;
  }
}
