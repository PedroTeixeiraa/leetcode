package binarytree;

public class RangeSumOfBST {
	public static class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode() {}
		TreeNode(int val) { this.val = val; }
		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}


	public static void main(String[] args) {
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(5);
		root.right = new TreeNode(15);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(7);
		root.right.right = new TreeNode(18);

		System.out.println(rangeSumBST(root, 7, 15));
	}

	public static int rangeSumBST(TreeNode root, int low, int high) {
		if (root == null) {
			return 0;
		}

		int currentVal = (root.val >= low && root.val <= high) ? root.val : 0;

		int leftSum = rangeSumBST(root.left, low, high);
		int rightSum = rangeSumBST(root.right, low, high);

		return currentVal + leftSum + rightSum;
	}
}
