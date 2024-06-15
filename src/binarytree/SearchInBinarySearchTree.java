package binarytree;

public class SearchInBinarySearchTree {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(4);
		root.left = new TreeNode(2);
		root.right = new TreeNode(7);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(3);

		System.out.println(searchBST(root, 2));
	}

	public static TreeNode searchBST(TreeNode root, int val) {
		if (root == null) return null;

		return searchBSTRec(root, val);
	}

	public static TreeNode searchBSTRec(TreeNode root, int val) {
		if (root == null) return null;
		if (root.val == val) {
			return root;
		}

		TreeNode hasLeft = searchBSTRec(root.left, val);
		if (hasLeft != null) {
			return hasLeft;
		}

		return searchBSTRec(root.right, val);
	}
}
