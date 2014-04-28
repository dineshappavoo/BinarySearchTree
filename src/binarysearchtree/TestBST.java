package binarysearchtree;

public class TestBST {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new TestBST().doOperationsOnBST();
	}
	
	public void doOperationsOnBST()
	{		
		BST<Long> bst=new BST<Long>();
		bst.insert(10L);
		bst.insert(5L);
		bst.insert(15L);
		bst.insert(3L);
		bst.insert(8L);
		bst.insert(2L);
		bst.insert(10L);
		
		//bst.inOrderTraversal();
		boolean isTrue=bst.delete(3L);
		System.out.println("Deleted?"+isTrue);
		
		boolean isAvail=bst.lookUp(5L);
		System.out.println("Available: "+isAvail);
		bst.inOrderTraversal();
	}

}
