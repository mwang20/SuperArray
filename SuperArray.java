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
    String a = "[";
    for (int i = 0; i < size; i++){
      if (data[i] != null && i != size - 1){
        a += data[i] + ", ";
      }
      else if (data[i] != null){
        a += data[i];
      }
      continue;
    }
    a += "]";
    return a;
  }
  public boolean contains(String s){
    for (int i = 0; i < size; i++){
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
    String a = data[size - 1];
    if ( size < data.length ){
      for (int i = size; i > index; i--){
        data[i] = data[i-1];
      }
    }
    if (size >= data.length){
      resize();
      data[size] = data[size-1];
    }
    data[index] = element;
    data[size] = a;
    size += 1;
  }
  public String remove(int index) throws Exception{
    if (index < size && index >= 0 ){
      String a = data[index];
      for (int i = index; i < size-1; i++){
        data[i] = data[i + 1];
      }
      size -= 1;
      return a;
    }
    throw new Exception("Invalid index"); //I can't do return null since Philip's tester file uses catch exception when testing for negative indexes
  }
  public int indexOf(String s){
    if (size == 0){
      return -1;
    }
    for (int i = 0; i < size; i++){
      if (data[i].equals(s)){
        return i;
      }
    }
    return -1;
  }
  public String[] toArray(){
    String[] a = new String[size];
    for ( int i = 0; i < size; i++){
      a[i] = data[i];
    }
    return a;
  }
  //My code for removeDuplicates
  /*public static void removeDuplicates(SuperArray s)throws Exception{
    for (int i = 0; i < s.size(); i++){
      for (int j = 0; j < s.size(); j ++){
        if (s.get(i).equals(s.get(j))){
          s.remove(j);
          i--;
          break;
        }
      }
    }
  }
  */
  //My code for findOverlap
  /*
  public static SuperArray findOverlap(SuperArray a, SuperArray b){
    SuperArray c = new SuperArray();
    for (int i = 0; i < a.size(); i++){
      if (a.get(i).equals(b.get(i))){
        c.add(a.get(i));
      }
    }
    return c;
  }
  */
  public int lastIndexOf(String value){
    if (indexOf(value) == size - 1){
      return indexOf(value);
    }
    int greater = indexOf(value);
    for (int i = indexOf(value) + 1; i < size; i++){
      if (value.equals(data[i])){
        greater = i;
      }
    }
    return greater;
  }
}
