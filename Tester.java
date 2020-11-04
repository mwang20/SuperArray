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
    System.out.println();
    System.out.println(testSuper.set(0, "bye")); //Should replace "hello" with "bye" and return "hello"
    System.out.println();
    System.out.println(testSuper.set(1, "oloy")); //Should replace "yolo" with "oloy" and return "yolo"
    System.out.println();
    System.out.println(testSuper.get(0)); //Should return "bye"
    System.out.println();
    System.out.println(testSuper.get(1)); //Should return "oloy"
    System.out.println();
    for (int i = testSuper.size(); i < testSuper.capacity() ; i++){
      testSuper.add("test"); //Should add test to all the remaining indexes with no values
    }
    System.out.println();
    for (int i = 0; i < testSuper.capacity(); i++){
      System.out.println(testSuper.get(i)); //Should print out all the indexes of the array data
    }
    System.out.println();
    testSuper.add("11"); //Should resize the array to 11 and add "11" to index 12
    System.out.println(testSuper.get(10));
    System.out.println();
    System.out.println(testSuper.toString());
  }
}
