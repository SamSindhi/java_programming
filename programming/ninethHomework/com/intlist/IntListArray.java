import java.util.ArrayList;

public class IntListArray {
  ArrayList arrayList;

  public IntListArray(int size) {
    arrayList = new ArrayList(size);
  }

  public IntListArray(int[] arr) {
    arrayList = new ArrayList(arr[0]);
    for(int i = 1; i < arr.length; i++) {
      arrayList.add(arr[i]);
    }
  }

  public void add(int number) {
    this.arrayList.add(number);
  }

  public void concat(IntListArray intListArray) {
    this.arrayList.addAll(intListArray.arrayList);
  }

  public void removeItemsGreaterThan(int limit) {
    for(int i = 0; i < this.arrayList.size(); i++) {
      if(this.arrayList.get(i) > limit) {
        this.arrayList.remove(i);
      }
    }
  }

  @Override
  public String toString() {
    return this.arrayList.toString();
  }

}
