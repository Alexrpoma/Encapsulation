package com.demo.protected_class;

public class Consultant {
  public void getProtectedClass() {
    ProtectedClass protectedClass = new ProtectedClass();
    int number = protectedClass.protectedNumber;
    String str = protectedClass.protectedString;
    protectedClass.protectedMethod();
    System.out.println("Here we can get attributes and methods from a protected class");
  }
}
