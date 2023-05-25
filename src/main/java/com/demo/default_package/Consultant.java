package com.demo.default_package;

public class Consultant {
  public void getDefaultClass() {
    DefaultClass defaultClass = new DefaultClass();
    int getNumber = defaultClass.defaultNumber;
    String getString = defaultClass.defaultString;
    defaultClass.defaultMethod();
    System.out.println("Here we can get attributes and methods from a default class");
  }
}
