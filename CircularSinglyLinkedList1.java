// Data structure and Alogrithm  CircularSinglyLinkedList print

import java.io.*;
import java.util.*;

public class CircularSinglyLinkedList1
{
   private ListNode last;
   private int length;
   
   private class ListNode
   {
     private int data;
     private ListNode next;
   
     public ListNode(int data)
      {
         this.data = data;
      }
   }
   
   public CircularSinglyLinkedList1()
   {
     last = null;
     length = 0; 
   }

   public int length()
   {
      return length;
   }
    
   public boolean isEmpty()
   {
      return length == 0;
   }
   
   public void print()
   {
     ListNode first = new ListNode(11);
     ListNode second = new ListNode(12);
     ListNode third = new ListNode(13);
     ListNode fourth = new ListNode(14);
     ListNode fifth = new ListNode(15);
  
     first.next = second;
     second.next = third;
     third.next = fourth;
     fourth.next = fifth;
     fifth.next = first;

     last = fifth;
    
   }

  public static void main(String arg [ ])
  {
    CircularSinglyLinkedList1 cobj = new CircularSinglyLinkedList1();
   
  
  
  }








}