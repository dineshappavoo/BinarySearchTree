package binarysearchtree;

/**
 * @author Dany
 *
 */
public class TreeNode<T extends Comparable<T>>
{
	public T key;
	public TreeNode<T> left;
	public TreeNode<T> right;
	public TreeNode(T key)
	{
		this.key=key;
		this.left=null;
		this.right=null;
	}
 }