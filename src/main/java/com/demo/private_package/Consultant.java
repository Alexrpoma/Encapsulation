package com.demo.private_package;

public class Consultant {

  public void getPrivateClass() {
    //PrivateClass privateClass = new PrivateClass(); --> Access privateClass forbidden.
    //int number = privateClass.privateNumber; --> forbidden.
    //privateClass.privateMethod() --> forbidden.
  }
}
