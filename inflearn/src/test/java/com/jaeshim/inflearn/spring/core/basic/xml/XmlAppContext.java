package com.jaeshim.inflearn.spring.core.basic.xml;

import com.jaeshim.inflearn.spring.core.basic.member.MemberService;
import com.jaeshim.inflearn.spring.core.basic.member.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

class XmlAppContext {


  @Test
  void xmlAppContext() {
    ApplicationContext ac = new GenericXmlApplicationContext("appConfig.xml");

    MemberServiceImpl memberService = ac.getBean("memberService", MemberServiceImpl.class);
    Assertions.assertThat(memberService).isInstanceOf(MemberService.class);
  }
}
