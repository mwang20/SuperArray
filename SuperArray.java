import java.util.Arrays;
public class SuperArray{
  private String[] data;
  private int size;
  private int capacity;
  public SuperArray(){
    capacity = 10;
    data = new String[capacity];
    size = 0;
  }
  public int size(){
    return size;
  }
  public boolean add(String element){
    if (size < capacity){
      data[size] = element;
      size += 1;
      return true;
    }
    else if (size >= capacity){
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
    data = Arrays.copyOf(data, capacity + 1);
    capacity += 1;
  }
  public int capacity(){
    return capacity;
  }
  public boolean isEmpty(){
    if (size == 0){
      return true;
    }
    return false;
  }
  public void clear(){
    size = 0;
  }
  public String toString(){
    String a = "";
    for (int i = 0; i < size; i++){
      if (i == 0){
        a += "[" + data[i] + ", ";
      }
      else if (i == size - 1){
        a += data[i] + "]";
      }
      else a += data[i] + ", ";
    }
    return a;
  }
  public boolean contains(String s){
    for (int i = 0; i < data.length; i++){
      if (data[i].equals(s)){
        return true;
      }
    }
    return false;
  }
  public SuperArray(int initialCapacity){
    data = new String[initialCapacity];
    size = 0;
    capacity = initialCapacity;
  }
  public void add(int index, String element){
    if ( data[index] != null ){
      resize();
      for (int i = index; i < data.length - 1; i++){
        data[i+1] = data[i];
      }
    }
    data[index] = element;
  }
  public String remove(int index){
    String a = data[index];
    for (int i = index; i < data.length - 1; i++){
      data[i] = data[i + 1];
    }
    return a;
  }
  public int indexOf(String s){
    for (int i = 0; i < data.length; i++){
      if (data[i].equals(s)){
        return i;
      }
    }
    return -1;
  }
}
