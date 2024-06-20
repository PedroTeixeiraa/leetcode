package twopointer;

public class SquaresOfASortedArray {

	public static void main(String[] args) {
//		sortedSquares(sortedSquares(new int[] {-4,-1,0,3,10}));
		sortedSquares(sortedSquares(new int[] {-7,-3,2,3,11}));
	}

	public static int[] sortedSquares(int[] nums) {
		if (nums.length == 0) return new int[] {};

		int left = 0;
		int right = nums.length - 1;
		int[] result = new int[nums.length];
		int indexResult = nums.length - 1;

		while (indexResult != -1) {
			int squareLeft = nums[left] * nums[left];
			int squareRight = nums[right] * nums[right];
			if (left == right) {
				result[indexResult] = squareLeft;
			} else if (squareLeft > squareRight) {
				result[indexResult] = squareLeft;
				left++;
			} else {
				result[indexResult] = squareRight;
				right--;
			}

			indexResult--;
		}


		return result;
	}
}
