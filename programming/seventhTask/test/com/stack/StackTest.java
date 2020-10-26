package com.stack;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertThrows;
import org.junit.Test;
import java.util.NoSuchElementException;

 public class StackTest {
   @Test 
   public void emptyTest() {
    IntegerStack stack = new IntegerStack();
    assertEquals("Stack should be empty in initializing",  stack.isEmpty(), true);
   }

   @Test 
   public void pushPullTest() {
    IntegerStack pullStack = new IntegerStack();
    pullStack.push(10);
    pullStack.push(11);
    pullStack.pull();
    assertEquals("After pull() last element should be deleted", "10, ", pullStack.getStack());
   }

   @Test 
   public void oneElementNotEmptyStack() {
     IntegerStack stack = new IntegerStack();
     stack.push(10);
     assertEquals("Stack size should equal one in this case",stack.size(), 1);
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

      assertEquals("Size should equal one",oneStack.size(), 1);
      
      IntegerStack zeroStack = new IntegerStack();
      assertEquals("Size should be zero", zeroStack.size(), 0);
   }

   @Test
   public void checkMultipleMethods() {
     IntegerStack stack = new IntegerStack();
     final int stackSize = 10;
     for(int i = 0; i < stackSize; i++) {
       stack.push(i);
     }

    assertEquals("Stack size should be ten", stack.size(), 10);
    assertEquals("Expected stack content", stack.getStack(), "1, 2, 3, 4, 5, 6, 7, 8, 9, ");
    
    for(int i = stackSize; i >= stackSize; i--) {
      stack.pull();
    }
    assertEquals("Empty stack test", stack.isEmpty(), true);
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
    assertEquals("Empty stack after all elements deletion", stack.isEmpty(), true);
   }
 }
