package com.demo.private_package;

public class PrivateClass {

  private int privateNumber = 0;
  private String privateString = "private String";

  private PrivateClass(){}

  private void privateMethod() {
    System.out.println("Private Method.");
  }

}
