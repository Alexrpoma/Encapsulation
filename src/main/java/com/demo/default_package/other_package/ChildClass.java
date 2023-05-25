package com.demo.default_package.other_package;

//import com.demo.default_package.DefaultClass; --> Not works!, its necessary make DefaultClass to public Class

public class ChildClass
  //extends DefaultClass --> Impossible extends from DefaultClass!!
{

  public void getDefaultClass() {
    /*
    We cannot access the DefaultClass, tributes or methods.
      DefaultClass defaultClass = new DefaultClass();
      int getNumber = defaultClass.defaultNumber;
      String getString = defaultClass.defaultString;
      defaultClass.defaultMethod();
    */
  }
}
