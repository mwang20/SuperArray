import java.util.Arrays;
public class SuperArray{
  private String[] data;
  private int size;
  public int length;
  public SuperArray(){
    data = new String[10];
    size = 0;
    length = data.length;
  }
  public int size(){
    return size;
  }
  public boolean add(String element){
    if (size < data.length){
      data[size] = element;
      size += 1;
      return true;
    }
    else if (size >= data.length){
      resize();
      data[size] = element;
      size += 1;
      return true;
    }
    return true;
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
    data = Arrays.copyOf(data, data.length + 1);
  }
  public void resizeTest(){
    resize();
  }
  public int arrayLength(){
    return length;
  }
}
