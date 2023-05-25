package com.demo.protected_class.other_package;

import com.demo.protected_class.ProtectedClass;

public class ChildClass extends ProtectedClass {
  public void getProtectedClass() {
    int number = protectedNumber;
    String str = protectedString;
    protectedMethod();
  }
}
