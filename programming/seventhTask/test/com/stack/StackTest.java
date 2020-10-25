package com.stack;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

 public class StackTest {
   @Test 
   public void emptyTest() {
    IntegerStack stack = new IntegerStack();
    assertEquals(true, stack.isEmpty(), "Stack should be empty in initializing");
   }

   @Test 
   public void pushPullTest() {
    IntegerStack pullStack = new IntegerStack();
    pullStack.push(10);
    pullStack.push(11);
    pullStack.pull();
    assertEquals(pullStack.getStack(), "10, ", "Stack should have erased last element");
   }

   @Test 
   public void oneElementNotEmptyStack() {
     IntegerStack stack = new IntegerStack();
     stack.push(10);
     assertEquals(1, stack.size());
   }

   @Test
   public void noElementPullException() {
    IntegerStack stack = new IntegerStack(); 
    Exception exception = assertThrows(NoSuchElementException.class, () -> {
        stack.pull();
    });
 
    String expectedMessage = "Stack is empty.";
    String actualMessage = exception.getMessage();
 
    assertTrue(actualMessage.contains(expectedMessage));
   }

   @Test
   public void sizeMethod() {
      IntegerStack oneStack = new IntegerStack();
      oneStack.push(10);

      assertEquals(1, oneStack.size());
      
      IntegerStack zeroStack = new IntegerStack();
      assertEquals(0, zeroStack.size());
   }

   @Test
   public void checkMultipleMethods() {
     IntegerStack stack = new IntegerStack();
     final int stackSize = 10;
     for(int i = 0; i < stackSize; i++) {
       stack.push(i);
     }

    assertEquals(10, stack.size());
    assertEquals("1, 2, 3, 4, 5, 6, 7, 8, 9, ", stack.getStack());
    
    for(int i = stackSize; i >= stackSize; i--) {
      stack.pull();
    }
    assertEquals(true, stack.isEmpty());
   }

   @Test              
   public void checkEmptyPullStack() {
    IntegerStack stack = new IntegerStack();
    final int stackSize = 15;
    for(int i = 0; i < stackSize; i++) {
       stack.push(i);
    }
     
    for(int i = stackSize; i >= stackSize; i--) {
     stack.pull();
    }
    assertEquals(true, stack.isEmpty());
   }
 }
