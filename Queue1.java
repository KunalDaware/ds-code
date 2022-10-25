//Queue in DSA in Java deletation of ListNode

import java.io.*;
import java.util.*;

public class Queue1
{
  private ListNode front;
  private ListNode rear;
  private int length;

  public Queue1()
  {
    this.front = null;
    this.rear = null;
    this.length = 0;
  }

  private class ListNode
  {
   private int data;
   private ListNode next;
  

    public ListNode(int data)
    {
      this.data = data;
      this.next = null;
   }
 }

  public boolean Empty()    
  {
     return length == 0;
  }

  public int length()
   {
      return length;
   }

   public void Insertion(int data)
   {
     ListNode temp = new ListNode(data);
      if(Empty())    
      {
         front = temp;
      }
    else
      {
        rear.next = temp;
      }
      
     rear = temp;
     length++;

   }

   public void Print()
   {
     if(Empty())
       {
          return;
       }
       ListNode current = front;
      while(current != null)
          {
            System.out.print(current.data + "---->");
             current = current.next;

         }
           System.out.print( " null");
   }

    public int Deletation()
    {
      if(Empty())
       {
          throw new NoSuchElementException();
        }
       int result = front.data;
        front = front.next;
        if(front == null)
         {
            rear = null;
         }
          length--;
          return result;
     }

   public static void main(String args [])
   {
     Queue1 qobj = new Queue1();
      System.out.println("Queue has insterted");
        qobj.Insertion(10);
        qobj.Insertion(20);
        qobj.Insertion(30);
         qobj.Insertion(40);
     System.out.println("Queue has Printed");
       qobj.Print();
        qobj.Deletation();
       System.out.println("Queue has Deleted");
        qobj.Print();
         
       System.out.println("Queue has new Printed");
   }

}