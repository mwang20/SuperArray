import java.util.ArrayList;
public class SuperArray{
  private String[] data;
  private int size;
  public SuperArray(){
    data = new String[10];
    size = 0;
  }
  public int size(){
    return size;
  }
  public boolean add(String element){
    if (size < 10){
      data[size] = element;
      size += 1;
      return true;
    }
    return false;
  }
  public String get(int index){
    return data[index];
  }
  public String set(int index, String element){
    String a = data[index];
    data[index] = element;
    return a;
  }
  private void resize(){
    int newCapacity = 15;
    String[] copy = new String[newCapacity];
    for (int i = 0; i < data.length; i++){
      copy[i] = data[i];
    }
    data = new String[newCapacity];
    for (int i = 0; i < data.length; i++){
      data[i] = copy[i];
    }
  }
  public void resizeTest(){
    resize();
  }
}
