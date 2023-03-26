package com.jaeshim.inflearn.spring.core.basic;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class HelloLombok {

  private String name;
  private int age;

  public static void main(String[] args) {
    HelloLombok helloLombok = new HelloLombok();
    helloLombok.setName("jaeshim");

    System.out.println("helloLombok = " + helloLombok.getName());
    System.out.println("helloLombok = " + helloLombok);
  }

}
