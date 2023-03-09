package com.jaeshim.inflearn.spring.core.basic;

import com.jaeshim.inflearn.spring.core.basic.member.Grade;
import com.jaeshim.inflearn.spring.core.basic.member.Member;
import com.jaeshim.inflearn.spring.core.basic.member.MemberService;
import com.jaeshim.inflearn.spring.core.basic.member.MemberServiceImpl;

public class MemberApp {

  public static void main(String[] args) {
    AppConfig appConfig = new AppConfig();
    MemberService memberService = appConfig.memberService();
    Member member = new Member(1L, "memberA", Grade.VIP);
    memberService.join(member);

    Member findMember = memberService.findMember(1L);


    System.out.println("nen member = " + member.getName());
    System.out.println("find member = " + findMember.getName());
  }
}
