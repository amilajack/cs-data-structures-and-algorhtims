package examples.polymorphisim;

import examples.polymorphisim.SuperClass;

class SubClass extends SuperClass {

  /**
   * The constructor for SubClass
   */
  SubClass() {
    System.out.print("SubClass has been constructed \n");
  }

  /**
   * This method overrides the SuperClass method `exampleInheritedMethod` and will be printed
   */
  public void exampleOverridenMethod() {
    System.out.print(
      "This method overrides the SuperClass method `exampleInheritedMethod` and will be printed\n"
    );
  }

  /**
   * Main is what actually runs the java program.
   */
  public static void main(String[] args) {
    SubClass example = new SubClass();
    example.exampleInheritedMethod();
    example.exampleOverridenMethod();
  }
}
