package com.jaeshim.inflearn.spring.core.basic.member;

public interface MemberService {

  void join(Member member);

  Member findMember(Long memberId);

}
