// Doubly Linked List  in data Delete node from first and back

import java.io.*;
import java.util.*;

public class DoublyLinkedList3
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
 
      public ListNode DeleteFirst()
      {
        if(EmptyDLL())
        {
           throw new NoSuchElementException();
         }
        ListNode temp = head;
        if(head == tail)
        {
          head = tail;
        }
     else
        {
         head.next.previous = null;
        }
        head = head.next;
        temp.next = null;
        return temp;
     }

    public ListNode DeleteLast()
    {
       if(EmptyDLL())
        {
            throw new NoSuchElementException();
         }
       ListNode temp = tail;
       if(head == tail)
        {
            head = tail;
        }
     else
       {
         tail.previous.next = null;
       }
         tail.previous = tail;
        temp.previous = null;
        return temp;
    }
    public static void main(String arg [])
    {
      DoublyLinkedList3 dobj = new DoublyLinkedList3();   
      
       dobj.Insert(10);
      dobj.Insert(11);
     dobj.Insert(12);
     dobj.Insert(13);
    dobj.Insert(14);
    dobj.Insert(15);
    dobj.Insert(16);

   dobj.Displayforward();
   dobj.DeleteFirst(); 
   dobj.Displayforward();
   dobj.DeleteLast(); 
   dobj.Displayforward();
     }
}