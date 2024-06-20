package slidingwindow;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;

public class SlidingWindowMaximum {

	public static void main(String[] args) {
//		System.out.println(maxSlidingWindow(new int[] {1, 3, -1, -3, 5, 3, 6, 7}, 3));
//		System.out.println(maxSlidingWindow(new int[] {1, -1}, 1));
		System.out.println(maxSlidingWindow(new int[] {7, 2, 4}, 2));
	}

	public static int[] maxSlidingWindow(int[] nums, int k) {
		if (k > nums.length) return new int[] {};
		if (nums.length == 1) return nums;

		int[] result = new int[nums.length - k + 1];

		LinkedList<Integer> queue = new LinkedList<>();
		int maxWindow = 0;

		for (int i = 0; i < k; i++) {
			queue.add(nums[i]);
			maxWindow = Math.max(maxWindow, nums[i]);
		}

		result[0] = maxWindow;


		for (int i = k; i < nums.length; i++) {
			queue.removeFirst();
			queue.add(nums[i]);

			maxWindow = Collections.max(queue);
			result[i - k + 1] = maxWindow;
		}

		return result;
	}
}
