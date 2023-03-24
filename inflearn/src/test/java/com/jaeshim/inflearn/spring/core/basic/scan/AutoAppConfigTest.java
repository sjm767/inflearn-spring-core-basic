package com.jaeshim.inflearn.spring.core.basic.scan;

import static org.assertj.core.api.Assertions.assertThat;

import com.jaeshim.inflearn.spring.core.basic.AutoAppConfig;
import com.jaeshim.inflearn.spring.core.basic.member.MemberService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class AutoAppConfigTest {

  @Test
  void basicScan() {
    ApplicationContext ac = new AnnotationConfigApplicationContext(
        AutoAppConfig.class);

    MemberService memberService = ac.getBean(MemberService.class);
    assertThat(memberService).isInstanceOf(MemberService.class);

  }

}
