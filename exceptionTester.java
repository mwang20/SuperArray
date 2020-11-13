public class exceptionTester{
  public static void main(String[] args){
    System.out.println();
    System.out.println("~~ Testing the SuperArray constructor with exceptions ~~");
    try{
      SuperArray test = new SuperArray(-500);
    }
    catch (Exception IllegalArgumentException){
      System.out.println();
      System.out.println("This is an invalid capacity");
    }
    System.out.println();
    System.out.println("~~ Testing the get method with exceptions ~~");
    try{
      SuperArray test = new SuperArray(500);
      test.get(501);
    }
    catch (Exception IllegalArgumentException){
      System.out.println();
      System.out.println("This index is out of range");
    }
    System.out.println();
    System.out.println("~~ Testing the set method with exceptions ~~");
    try{
      SuperArray test = new SuperArray(500);
      test.set(501, "notValid");
    }
    catch (Exception IllegalArgumentException){
      System.out.println();
      System.out.println("This index is out of range");
    }
  }
}
