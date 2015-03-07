// test instance fields initialization:
// inline initialization is called
// before user defined constructor initialization
// and instead of default constructor null initialization

import java.io.*;

public class FieldInitTest{
	 public static void main(String args[]) {
    // not initialized: trying to evaluate it
		// will trigger a compilation error
		A a1;
    System.out.println("");

		// inline initialization is takes place before
		// user defined constructor initialization
		A a2 = new A();
    System.out.println("");

		// inline initialization takes place instead of
		// default constructor null initialization
		B b = new B();
	}
}

class A {
  PrintStream i = System.out.printf("inline initialization\n");
  
  A() {
    i = System.out.printf("user defined constructor initialization\n");
  }
}

class B{
  PrintStream i = System.out.printf("inline initialization\n");
}
