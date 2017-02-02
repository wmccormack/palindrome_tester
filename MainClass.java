package wmccormack.palindrome_tester;

/**
 * this programme will take a user input word and test whether 
 * it is a palindrome or not
 * @author William
 *
 */

/**
 * scanner to take user input word
 */
import java.util.Scanner;

public class MainClass {

	/**
	 * default constructor
	 */
	public MainClass() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		Scanner myScanner = new Scanner(System.in);

		String testWord;

		System.out.println("please enter a word");

		testWord = myScanner.nextLine();

		System.out.println("***testing***");
		System.out.println("***testing***");

		if (wordTest(testWord)) {
			System.out.println(testWord + " is a palindrome");

		} else {
			System.out.println(testWord + " is not a palindrome");
		}

	}

	public static boolean wordTest(String testWord) {
		char[] array = testWord.toCharArray();

		for (int loop = 0, j = array.length - 1; loop < j; loop++, j--) {
			if (array[loop] != array[j]) {
				return false;
			}
		}
		return true;
	}

}
