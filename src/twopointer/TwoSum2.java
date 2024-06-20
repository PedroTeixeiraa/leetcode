package twopointer;

public class TwoSum2 {

	public static void main(String[] args) {
		System.out.println(twoSum(new int[] {2, 7, 11, 15}, 9));
	}

	public static int[] twoSum(int[] numbers, int target) {

		int begin = 0;
		int end = numbers.length - 1;

		while (true) {
			int sum = numbers[begin] + numbers[end];

			if (sum > target) {
				end--;
			} else if (sum < target) {
				begin++;
			} else {
				return new int[] { begin + 1, end + 1 };
			}
		}

	}
}
