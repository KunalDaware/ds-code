// Doubly Linked List  in data Display and prints

import java.io.*;
import java.util.*;

public class DoublyLinkedList1
{
   private ListNode head;
   private ListNode tail;  
   private int length;

   private class ListNode
   {
     private int data;
     private ListNode next;
     private ListNode previous;  

     public ListNode(int data)
     {
        this.data = data; 
     }
    }

     public void DoublyLinkedList()
     {
        this.head = null;
        this.tail = null;
        this.length = 0;
      }

      public boolean EmptyDLL()
      {
         return length == 0;
       }

       public int LengthDLL()
       {
           return length;
        }


        public void Displayforward()
        {
          ListNode temp = head;
        
          while(temp != null)
           {
             System.out.print(temp.data + "--->");
             temp = temp.next;
           }
             System.out.println("null");
        }

          public void Displaybackward()
        {
          ListNode temp = tail;
        
          while(temp != null)
           {
             System.out.print(temp.data + "--->");
             temp = temp.previous;
           }
             System.out.println("null");
        }

         public void Insert(int value)
        {
           ListNode newNode = new ListNode(value);

           if( EmptyDLL())
            {
               tail = newNode;
            }
          else
            {
              head.previous = newNode;  
            }
            newNode.next = head;
            head = newNode;
            length++;

       }
    public static void main(String arg [])
    {
      DoublyLinkedList1 dobj = new DoublyLinkedList1();   
      
       dobj.Insert(10);
     dobj.Insert(11);
    dobj.Insert(12);
   dobj.Insert(13);
   dobj.Insert(14);
   dobj.Insert(15);
   dobj.Insert(16);

  dobj.Displayforward();
  dobj.Displaybackward();
  








     }
















}