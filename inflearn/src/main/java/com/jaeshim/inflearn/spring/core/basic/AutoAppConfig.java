package com.jaeshim.inflearn.spring.core.basic;


import com.jaeshim.inflearn.spring.core.basic.member.MemberRepository;
import com.jaeshim.inflearn.spring.core.basic.member.MemoryMemberRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;

@Configuration
@ComponentScan(
    basePackages = "com.jaeshim.inflearn.spring.core.basic",
    excludeFilters = @ComponentScan.Filter(type= FilterType.ANNOTATION,classes = Configuration.class)
)
public class AutoAppConfig {

  /*
  @Bean(name="memoryMemberRepository")
  MemberRepository memberRepository() {
    return new MemoryMemberRepository();
  }
*/
}
