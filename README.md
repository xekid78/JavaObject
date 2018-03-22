# JavaObject
文字列も配列もオブジェクト

## 処理
String型と配列でオブジェクトを生成し、length()メソッドで個数を調べる。

## コード
```
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
```

## 出力結果  
```
あいうえお
5
0,0,0,0,0,
5
```
  
## 開発環境
| 開発ツール |  |
|:-|:-|
| OS | Windows10 |
| 統合開発環境(IDE) | Eclipse 4.7.0 Oxygen |
| 開発言語 | Java8 |
