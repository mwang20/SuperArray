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
  }
}
