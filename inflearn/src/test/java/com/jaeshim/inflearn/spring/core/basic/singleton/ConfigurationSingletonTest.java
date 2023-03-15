package com.jaeshim.inflearn.spring.core.basic.singleton;

import static org.assertj.core.api.Assertions.*;

import com.jaeshim.inflearn.spring.core.basic.AppConfig;
import com.jaeshim.inflearn.spring.core.basic.member.MemberRepository;
import com.jaeshim.inflearn.spring.core.basic.member.MemberService;
import com.jaeshim.inflearn.spring.core.basic.member.MemberServiceImpl;
import com.jaeshim.inflearn.spring.core.basic.order.OrderServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ConfigurationSingletonTest {

  @Test
  void configurationTest(){

    ApplicationContext ac = new AnnotationConfigApplicationContext(
        AppConfig.class);

    MemberServiceImpl memberService = ac.getBean("memberService", MemberServiceImpl.class);
    OrderServiceImpl orderService = ac.getBean("orderService", OrderServiceImpl.class);
    MemberRepository memberRepository = ac.getBean("memberRepository", MemberRepository.class);

    MemberRepository memberRepository1 = memberService.getMemberRepository();
    MemberRepository memberRepository2 = orderService.getMemberRepository();

    System.out.println("memberService -> memberRepository1 = " + memberRepository1);
    System.out.println("orderService -> memberRepository2 = " + memberRepository2);
    System.out.println("memberRepository = " + memberRepository);

    assertThat(memberService.getMemberRepository()).isSameAs(memberRepository);
    assertThat(orderService.getMemberRepository()).isSameAs(memberRepository);
  }

  @Test
  void configurationDeep(){
    ApplicationContext ac = new AnnotationConfigApplicationContext(
        AppConfig.class);

    AppConfig bean = ac.getBean(AppConfig.class);
    System.out.println("bean = " + bean.getClass());

  }

}
