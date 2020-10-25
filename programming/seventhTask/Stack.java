package stack;

import java.util.Arrays;

class IntegerStack {
  static final initialLength = 100;
  static final additionalLength = 50;
  private int[] stack;
  private int lastPosition = 0;
  
  public IntegerStack(int initialSize) {
    if(initialSize == null) {
      this.stack = new int[initialLength];
    } else {
      this.stack = new int[initialSize];
    }
  }

  public String getStack() {
    String stringStack;
    for (int i = 0; i < lastPosition; i++) {
      stringStack += stack[i];
    }

    return stringStack;
  }

  public boolean isEmpty() {
    return lastPosition == 0 ? true : false;
  }

  public void push(int item) {
    if(stack.length <= lastPosition){
      int[] local = new int[lastPosition + additionalLength];
      for(int i = 0; i < this.stack.length; i++) {
        local[i] = stack[i];
      }
      this.stack = new int[local.length];
      for(int i = 0; i < this.stack.length; i++) {
        stack[i] = local[i];
      }
    }
    stack[lastPosition] = item;
    lastPosition++;
  }

  public void size() {
    return lastPosition;
  }

  public void pull() {
    if(isEmpty()) {
      throw NoSuchElementException;
    } else {
      stack[lastPosition] = 0;
      lastPosition--;
    }
  }
