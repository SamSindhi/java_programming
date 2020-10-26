package com.stack;

import java.util.Arrays;
import java.util.NoSuchElementException;

class IntegerStack {
  static final int initialLength = 100;
  static final int additionalLength = 50;
  private int[] stack;
  private int lastPosition = 0;
  
  public IntegerStack(int initialSize) {
    this.stack = new int[initialSize];
  }

  public IntegerStack() {
    this.stack = new int[initialLength];
  }

  public String getStack() {
    String stringStack = "";
    for (int i = 0; i < lastPosition; i++) {
      stringStack += stack[i] + ", ";
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

  public int size() {
    return lastPosition;
  }

  public void pull() throws NoSuchElementException {
    if(isEmpty()) {
      throw new NoSuchElementException("Stack is empty.");
    } else {
      stack[lastPosition] = 0;
      lastPosition--;
    }
  }
}
