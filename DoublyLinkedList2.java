// Doubly Linked List  in data insert from last

import java.io.*;
import java.util.*;

public class DoublyLinkedList2
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

     
         public void Insertlast(int value)
        {
           ListNode newNode = new ListNode(value);
           if(EmptyDLL())
            {
              head = newNode;
             }
           else
             {
               tail.next = newNode;
               newNode.previous = tail;
               tail = newNode;
             }
       }
    public static void main(String arg [])
    {
      DoublyLinkedList2 dobj = new DoublyLinkedList2();   
      
         dobj.Insertlast(12);
         dobj.Insertlast(13);
       dobj.Displayforward();







     }
















}