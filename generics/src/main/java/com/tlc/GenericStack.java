package com.tlc;

import java.util.ArrayList;

public class GenericStack<T> {
   // stores elements in the stack
   ArrayList<T> store = new ArrayList<>(); 

   // keeps track of the last element in stack
   T lastElement;

   // adds element onto stack
   void push(T elem) {
       store.add(elem);
       lastElement = elem;
   }

   // returns the element at top of stack
   T top() {
       return lastElement;
   }

   // returns and discard element from top of stack
   void pop() {
       store.remove(lastElement);
   }

   // returns the total elems in stack
   int size() {
       return store.size();
   }

   // checks if the element exists in the stack
   boolean isPresent(T elem) {
     int index = store.indexOf(elem);
     if (index < -1) {
         return false;
     }
     return true;
   }
}
