/**
 *
 * @author xekid78
 *
 */
public class Length {

	public static void main(String[] args) {
		// 文字列
		String text = new String("あいうえお");
		System.out.println(text);
		System.out.println(text.length());

		// 配列
		int numbers[] = new int[5];
		for (int num : numbers) {
			System.out.print(num + ",");
		}
		System.out.println("");
		System.out.println(numbers.length);

	}

}
