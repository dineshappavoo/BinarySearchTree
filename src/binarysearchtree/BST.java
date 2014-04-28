/**
 * 
 */
package binarysearchtree;

import java.util.Comparator;

/**
 * @author Dinesh Appavoo
 *
 */

public class BST<T extends Comparable<T>>
{
	private TreeNode parentHead;
	//Public constructor for BST
	public <T> BST()
	{
		parentHead=new TreeNode(Long.MAX_VALUE);	
	}

	/**
	 * This method inserts the input key in the respective location in BST
	 * 
	 * @param root
	 * @param key
	 * @return
	 */
	public boolean insert(T key)
	{
		TreeNode pnode = parentHead;
		TreeNode node = pnode.left;
		while(node!=null) //left or right subtree
		{
			if(node.key.compareTo(key)>0)
			{
				pnode=node;
				node=node.left;
			}else if(node.key.compareTo(key)<0)
			{
				pnode=node;
				node=node.right;
			}else if(node.key.compareTo(key)==0)
				return false;
		}
		if(pnode.key.compareTo(key)>0)
			pnode.left=new TreeNode(key);
		else if(pnode.key.compareTo(key)<0)
			pnode.right=new TreeNode(key);
		else if(pnode.key.compareTo(key)==0) // duplicate values
		{
			return false;
		}
		return true;

	}

	/**
	 * This method deletes the given input key from the BST
	 * 
	 * @param key
	 */
	public boolean delete(T key)
	{
		TreeNode pnode=parentHead;
		TreeNode node=pnode.left;
		boolean keyFound=false;
		while(node!=null) //left or right subtree
		{
			if(node.key.compareTo(key)>0)
			{
				if(node.left!=null)
				{
					pnode=node;
					node=node.left;
				}else
					return false;
			}else if(node.key.compareTo(key)<0)
			{
				if(node.right!=null)
				{
					pnode=node;
					node=node.right;
				}else
					return false;
			}else if(node.key.compareTo(key)==0)
			{
				keyFound=true;
				break;
			}
		}	
		if(!keyFound||node==null)
		{
			return false;

		}else if(node.key.compareTo(key)==0)
		{
			if(node.left==null) //Case 1:If both the left and right sub tree is null or either of the subtree  
			{
				if(pnode.left==node)
					pnode.left=node.right;
				else
					pnode.right=node.right;
				return true;

			}else if(node.right==null)
			{
				if(pnode.left==node)
					pnode.left=node.left;
				else
					pnode.right=node.left;
				return true;
			}
			else if(node.left!=null&&node.right!=null) //Case 2: If both left and right sub tree is not empty
			{
				TreeNode rNode=node.right;
				TreeNode rlNode=rNode.left;
				if(rlNode==null)
				{
					node.key=rNode.key;
					node.right=rNode.right;
				}else
				{
					while(rlNode.left!=null)
					{
						rNode=rlNode;
						rlNode=rlNode.left;
					}
					if(rlNode.left==null)
					{
						node.key=rNode.key;
						rNode=rlNode;
					}
				}
				return true;
			}
		}

		return false;
	}

	/**
	 * This method returns true if the given input key is available in the BST
	 * 
	 * @param key
	 * @return
	 */
	public boolean lookUp(T key)
	{
		TreeNode node=parentHead.left;
		if(node==null)
			return false;
		while(node.key.compareTo(key)>0||node.key.compareTo(key)<0) //left or right subtree
		{
			if(node.key.compareTo(key)>0)
			{
				if(node.left!=null)
					node=node.left;
				else
					return false;
			}else if(node.key.compareTo(key)<0)
			{
				if(node.right!=null)
					node=node.right;
				else
					return false;
			}
		}
		if(node.key.compareTo(key)==0)
		{
			return true;
		}

		return false;
	}


	/**
	 * This method traverse the tree in IN_ORDER traversal
	 * 
	 * @param root
	 */
	public void inOrderTraversal()
	{
		inOrderTraversal(parentHead.left);
	}
	public void inOrderTraversal(TreeNode root)
	{
		if(root==null)
			return;
		inOrderTraversal(root.left);
		System.out.println(root.key);
		inOrderTraversal(root.right);
	}
}
