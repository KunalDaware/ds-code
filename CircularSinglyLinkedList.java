// Data Structure and Alogrithm Circular Singly Linked List

import java.io.*;
import java.util.*;

public class CircularSinglyLinkedList
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

  public CircularSinglyLinkedList()
  {
     last = null;
     length = 0; 
  
  }
  
  public int length()
  {
     return length;
  }
  
  public boolean ifEmpty()
  {
    return length == 0;
  }
 
  public static void main(String arg [ ])
  {
    CircularSinglyLinkedList cobj = new CircularSinglyLinkedList();
  
  }


















}