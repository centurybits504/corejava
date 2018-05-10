package Datastructures;

/* BinarySearchTree	*/
public class BinarySearchTree {

	class Node {
		int key;
		Node left, right;

		Node(int element) {
			key = element;
			left = null;
			right = null;
		}
	}

	Node root;
	BinarySearchTree() {
		root = null;
	}

	void insert(int key) {
		root = returnElement(root, key);
	}

	Node returnElement(Node root, int key) {
		if (root == null) {
			root = new Node(key);
			return root;
		}
		if (key < root.key) {
			root.left = returnElement(root.left, key);
		} else {
			root.right = returnElement(root.right, key);
		}
		return root;
	}

	void inOrder() {
		inorderTraverse(root);
	}
	void inorderTraverse(Node root) {
		if (root != null) {
			inorderTraverse(root.left);
			System.out.println(root.key);
			inorderTraverse(root.right);
		}

	}
	void preOrder() {
		preorderTraverse(root);
	}
	void preorderTraverse(Node root) {
		if (root != null) {
			inorderTraverse(root.left);
			inorderTraverse(root.right);
			System.out.println(root.key);
			
		}

	}
	
	boolean findElement(int key){
		if (root != null) {
			inorderTraverse(root.left);
			if(root.key==key){
				return true;
			}
			inorderTraverse(root.right);
		}
		return false;
	}

	public static void main(String[] args) {

		BinarySearchTree bsTree = new BinarySearchTree();
		System.out.println("Adding Element");
		bsTree.insert(1);
		bsTree.insert(4);
		bsTree.insert(2);
		bsTree.insert(3);
		bsTree.insert(5);
		System.out.println("-----------------");
		System.out.println("InOrder Traversal");
		bsTree.inOrder();
		System.out.println("-----------------");
		System.out.println("Finding Element : " +bsTree.findElement(10));
		System.out.println("-----------------");
		System.out.println("preOrder Traversal");
		bsTree.preOrder();
		
		
		

	}

}
