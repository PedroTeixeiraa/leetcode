package twopointer;

public class MiddleOfTheLinkedList {

	public static void main(String[] args) {
		ListNode node = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
		ListNode result = middleNode(node);
		System.out.println(result);
	}

	public static ListNode middleNode(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		return slow;
	}
}
