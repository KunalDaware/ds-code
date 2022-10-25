// Binary tree in DSA

import java.io.*;
import java.util.*;

public class BinaryTree
{
  private TreeNode root;
  
  private class TreeNode
  {
    private TreeNode left;
    private TreeNode right;
    private int data;
    
    public TreeNode(int data)
     {
         this.data = data;
      }

  }

   public void CreateTree()
   {
      TreeNode first = new TreeNode(9);     
      TreeNode second = new TreeNode(40);     
      TreeNode third = new TreeNode(95);    
      TreeNode fourth = new TreeNode(66);  
      TreeNode fifth = new TreeNode(34);     
   
     root = first;
     first.left = second;
     first.right = third;
    
    second.left = fourth;
    second.right =fifth;
       
    }

   public void preOrder(TreeNode root)
    {
     if(root == null)
      {
         return;
     }
       System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void main(String args [] )
     {
       BinaryTree bobj = new BinaryTree();
       bobj.CreateTree();
       bobj.preOrder(bobj.root);
     }

}