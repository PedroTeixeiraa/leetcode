package binarytree;

public class RootEqualsSumOfChildren {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(5);
		root.right = new TreeNode(15);

		System.out.println(rootEqualsSumOfChildren(root));
	}

	public static boolean rootEqualsSumOfChildren(TreeNode root) {
		if (root == null || root.left == null || root.right == null) {
			return false;
		}

		int leftSum = sumChildren(root.left);
		int rightSum = sumChildren(root.right);

		return root.val == leftSum + rightSum;
	}

	public static int sumChildren(TreeNode node) {
		if (node == null) return 0;
		return node.val + sumChildren(node.left) + sumChildren(node.right);
	}
}
