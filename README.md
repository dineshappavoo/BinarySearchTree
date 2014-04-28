BinarySearchTree
================

Implementation of Binary Search Tree without recursion in java

This project implemented in java without using recursion to improve the performance of the BST. BST does the following operations,
    
    
    insert(key)
    delete(key)
    lookup(key)

Original release notes from 2014
================================
It’s a simple enough data structure. It takes any comparable object as input.

The following code snippet shows how to run the library,


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
