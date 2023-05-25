package com.demo.protected_class;

public class ProtectedClass {

  protected int protectedNumber = 0;
  protected String protectedString = "Protected string";
  protected ProtectedClass(){}

  protected void protectedMethod() {
    System.out.println("Protected Method.");
  }
}
