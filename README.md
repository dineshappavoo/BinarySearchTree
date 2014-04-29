Binary Search Tree
================

   A binary search tree (BST), sometimes also called an ordered or sorted binary tree, is a node-based binary tree data structure where each node has a comparable key (and an associated value) and satisfies the restriction that the key in any node is larger than the keys in all nodes in that node's left subtree and smaller than the keys in all nodes in that node's right sub-tree. Each node has no more than two child nodes. Each child must either be a leaf node or the root of another binary search tree. The left sub-tree contains only nodes with keys less than the parent node; the right sub-tree contains only nodes with keys greater than the parent node. 

##Functionalitites

Implementation of Binary Search Tree without recursion in java.This project implemented in java without using recursion to improve the performance of the BST. BST does the following operations,
    
    
    insert(key)
    delete(key)
    lookup(key)
    

Original release notes from 2014
================================
It’s a simple enough data structure. It takes comparable object(Long) as input.The following code snippet shows how to run the library,


        BST<Long> bst=new BST<Long>();
        
		bst.insert(10L);
		bst.insert(5L);
		bst.insert(15L);
		bst.insert(3L);
		bst.insert(8L);
		bst.insert(2L);
		bst.insert(10L);
		
		boolean isTrue=bst.delete(3L);
		System.out.println("Deleted?"+isTrue);
		
		boolean isAvail=bst.lookUp(5L);
		System.out.println("Available: "+isAvail);
		bst.inOrderTraversal();
		
##Project Lead

* Dinesh Appavoo ([@DineshAppavoo](https://twitter.com/DineshAppavoo))
