import java.util.*;
//import java.lang.ArrayIndexOutOfBoundsException;
import java.lang.IllegalArgumentException;


class IntList {
  private int currentSize = 0;
  private int maxSize;
  public int[] array;

  public IntList(int maxSize) {
    this.maxSize = maxSize;
    this.array = new int[maxSize];
  }

  public void add(int number) throws IllegalArgumentException {
    if(maxSize > currentSize) {
      this.array[currentSize] = number;
       ++this.currentSize;
    } else {
      throw new IllegalArgumentException("This IntList is full");
    }
  }

  public void concat(IntList arr) throws IllegalArgumentException {
    if(this.currentSize + arr.currentSize > this.maxSize) {
      throw new IllegalArgumentException("You can't add concatenate. Insuffucient capacity in current instance");
    }
    System.arraycopy(arr.array, 0, this.array, this.currentSize, arr.currentSize);
    this.currentSize += arr.currentSize;
  }

  public void removeItemsGreaterThan(int limit) {
   for(int i = 0; i < this.currentSize; i++) {
      if(this.array[i] > limit) {
        this.array[i] = Integer.MAX_VALUE;
      }
   }

   for(int i = 0; i < this.currentSize; i++) {
     if(this.array[i] == Integer.MAX_VALUE){
      int j = i;
      int counter = 0;
      while(j < this.currentSize) {
        if(this.array[j] != Integer.MAX_VALUE) {
          int temp = this.array[i];
          this.array[i] = this.array[j];
          this.array[j] = temp;
          break;
        }
        j++;
        counter++;
      }
      
      if(j == this.currentSize) {
        this.currentSize -= counter;
        break;
      }
     }
   }
  }

  @Override
  public String toString() {
    String str = "";
    for(int i = 0; i < this.currentSize; i++) {
      if(i == this.currentSize - 1) {
        str += this.array[i];
        break;
      }
      str += this.array[i] + ", ";
    }

    return str;
  }
}

