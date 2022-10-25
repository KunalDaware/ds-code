// Stack int DSA

import java.io.*;
import java.util.*;

public Stack
{
  private ListNode top;
  private int length;
  
  private class Listnode
  {
    private int data;
    private ListNode next;
   
    public ListNode(int data)
    {
      this.data = data;
    }
  }
 
   public Stack()
   {
     top = null;
     length = 0;
  
   }
   public int length()
   {
       return length;
   }

   public boolean Empty()
   {
      return lenth == 0;
   }
   
   public void Push(int data)
   {
     ListNode temp = new ListNode(data);
     top.next = temp;
     temp = top;
     length++;
   
   }
    public void Peek()
    {
      if(Empty())
      {
        throw new EmptyStackExceptation()
         
     }
     else
     {
       return top.data;
    }

    }
  public static void main(String args [])
  {
    Stack sobj = new Stack();
    sobj.push = 20;







  }









}