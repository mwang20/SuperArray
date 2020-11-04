public class Tester{
  public static void main(String[] args){
    SuperArray testSuper = new SuperArray();
    System.out.println(testSuper.size()); //Should return 0
    testSuper.add("hello"); //Should add "hello" to index 0
    testSuper.add("yolo"); //SHould add "yolo to index 1"
    System.out.println();
    System.out.println(testSuper.get(0)); //Should return "hello"
    System.out.println();
    System.out.println(testSuper.get(1)); //Should return "yolo"
  }
}
