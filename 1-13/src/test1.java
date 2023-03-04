import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test1 {

	public static void main(String[] args) {
		//改行
		System.out.println("問１");
		//問題1:下記の条件を使ってfor文と条件文を組み合わせ結果が同じになるよう出力しなさい。for文ネスト3回（3回forを書くこと）
		//strArray1でfor文を回し3文字目(k)以降のものをstrArray2に格納する(1個目のfor文)
		//strArray2でfor文を回しkとaとoの物だけでstrArray3に格納する(2個目のfor文)
		//strArray3でfor文を回し「kakao」となるようにstrArray4に格納しstrArray4を出力する。(3個目のfor文)
		List<String> strArray1 = new ArrayList(Arrays.asList("f", "u", "k", "u", "d", "a", "k" , "a" , "n" , "e" , "k" , "o" ));
		List<String> strArray2 = new ArrayList<String>();
		List<String> strArray3 = new ArrayList<String>();
		List<String> strArray4 = new ArrayList<String>();
		
		for(int i = 0; i < strArray1.size(); i++) {
			
			if(i>1) {
				strArray2.add(strArray1.get(i));
				if(i==strArray1.size()-1) {
					for(int y = 0; y < strArray2.size(); y++) {
						boolean k = false;
						k = strArray2.get(y).equals("k")||strArray2.get(y).equals("a")||strArray2.get(y).equals("o")?true:false;
						if(k) {
							strArray3.add(strArray2.get(y));
						}
						if(y==strArray2.size()-1) {
							for(int z = 0; z < strArray3.size(); z++) {
								if(z!=4) {
									strArray4.add(strArray3.get(z));
								}
							}
						}
					}
				}
			}
		}
		System.out.println(strArray4);
	}
}
