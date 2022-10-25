// Data Structure and Alogrithm Circulr Singly LinkedList Print 

import java.io.*;
import java.util.*;


public class CircularSinglyLinkedList2
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

   public CircularSinglyLinkedList2()
    {
       last = null;
       length = 0; 
    }

    public int length()
    {
      return length; 
    }
   
    public boolean LengthEmpty()
    {
       return length == 0; 
   }

   public void Create() 
   {
     ListNode first = new ListNode(10);
     ListNode second = new ListNode(11);
     ListNode third = new ListNode(12);
     ListNode fourth = new ListNode(13);
     ListNode fifth = new ListNode(14);
     ListNode sixth = new ListNode(15);

    first.next = second; 
    second.next = third;
    third.next = fourth;
    fourth.next = fifth;
    fifth.next = sixth;
    sixth.next = first;
     
    last = sixth;
   }
   
   public void Display()
   {
     if(last == null)
      {
         return; 
      }
       
       ListNode first = last.next;

      while(first != last)
         {
             System.out.print(first.data + " ---->");
              first = first.next;
          }
            System.out.print(first.data + " ---->");
   }

  public static void main(String arg [ ] )
  {
    CircularSinglyLinkedList2 cobj = new CircularSinglyLinkedList2();
    cobj.Create(); 
    cobj.Display();







   }

}