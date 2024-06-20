package twopointer;

public class ReversePrefixOfWord {

	public static void main(String[] args) {
		System.out.println(reversePrefix("abcdefg", 'd'));
	}

	public static String reversePrefix(String word, char ch) {
		int index = word.indexOf(ch);
		StringBuffer rev = new StringBuffer(word.substring(0, index + 1)).reverse();
		return rev + word.substring(index+1);
	}
}
