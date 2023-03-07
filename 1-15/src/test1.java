import java.util.Arrays;
import java.util.Collections;

public class test1 {

	public static void main(String[] args) {
		//改行
		System.out.println("問１");
		//問１のメソッドを呼び出して出力してください（引数５と１０）
		System.out.println(sum(5,10));
		//改行
		System.out.println("問２");
		//問２のメソッドを呼び出して出力してください（引数"しんぶんし"）
		System.out.println(palindrome("しんぶんし"));
		//改行
		System.out.println("問３");
		//問3のメソッドを呼び出して出力してください（引数,配列[5,3,1,9,4,8]）
		Integer [] i = {5,3,1,9,4,8};
		System.out.println(Arrays.toString(asc(i)));
		//改行
		System.out.println("問４");
		//問4のメソッドを呼び出して出力してください（引数,配列[5,3,1,9,4,8]）
		int [] k = {5,3,1,9,4,8};
		System.out.println(min(k));

	}

	//問題1:2つの整数を受け取り、それらの和を返すメソッドを作成してください。
	public static int sum(int i , int m) {
		return i+m;
	}
	//問題2:文字列を受け取り、その文字列が回文であるかどうかを返すメソッドを作成してください。
	public static boolean palindrome(String i) {
		String result = "";
		for (int n = 0; n < i.length(); n++) {
			result = i.charAt(n) + result;
		}
		if(i.equals(result)){
			return true;
		}
		return false;
	}
	//問題3:整数の配列を受け取り、その配列の要素を降順にソートするメソッドを作成してください。(for文は利用しないこと)
	public static Integer[] asc(Integer[] i) {
		Arrays.sort(i,Collections.reverseOrder());
		return i;
	}
	//問題4:整数の配列を受け取り、その配列の中で最小値を持つ要素のインデックスを返すメソッドを作成してください。
	public static int min(int[] i) {
		int n = 0;
		int f = 0;
		for(int y=0;y < i.length;y++ ) {
			if(y==0) {
				n= i[y];
				f= y;
			}
			if(n>i[y]) {
				n= i[y];
				f= y;
			}
		}
		return f;
	}
}
