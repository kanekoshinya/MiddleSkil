package checkTest;

import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class checkTest {

	


		private static final Logger LOGGER = Logger.getLogger(checkTest.class.getName());
		
		public static void main(String[] args) {
			//改行
			System.out.println("問１");
			//問1 リソースを開く(ファイル名)ショートカットキーは何ですか？
	        //Shift + R
			//改行
			System.out.println("問２");
			//問2 リファクタリングをする時のショートカットキーは何ですか？
			//Ctrl+Shift+R
			//改行
			System.out.println("問３");
			//問3 デバッグを行う方法を簡潔に記載してください
			//ブレークポイントを置いてデバックモードを実行する
			
			//改行
			System.out.println("問４");
			//問4 eclipseのバージョン8と11の違いを簡潔に答えてください
			//ローカル変数について型推論ができるようになった
			
			//改行
			System.out.println("問５");
			//問5　Road博物館の入場料金は、一人1000円であるが、10人以上のチームなら一人820円、20人以上の団体なら一人700円である。
			//人数を入力し、入場料の合計を計算するプログラムを作成せよ。(if文で上記文章を作ってください)
			Scanner s = new Scanner(System.in);
			String sum = s.next();
			Integer i =Integer.parseInt(sum);
			if(i >= 10) {
				System.out.println("一人820円");
			}else {
				System.out.println("一人1000円");
			}
			
			//改行
			System.out.println("問６");
			//問6　コメントアウトされている箇所にどう言った処理が行われているか記載してください
			//配列の５要素分繰り返して得点を入力させる
			//配列の５要素分の合計値をsumの変数に格納する
			//合計値を５要素分で割り平均点をave変数に格納する
			//変数aveを出力する
			//改行
			System.out.println("問７");
			//問7 下記内容を正規表現を踏まえてプログラミングしてください
			//文字列 "Hello, my name is shinya. I am 25 years old and live in Miyazaki." から、年齢と居住地を取り出してください。
			//ただし、年齢は数字のみで表現され、居住地は先頭が大文字のアルファベットから始まり、最後がピリオドで終わる英単語とします。
			String str = "Hello, my name is shinya. I am 25 years old and live in Miyazaki.";
	        String intStr = str.replaceAll("[^0-9]", "");
	        String intStrs = str.replaceAll("[^A-Z\\.$]", "");
	        System.out.println("年齢は"+intStr);
	        System.out.println("居住地は"+intStrs);
			
			//改行
			System.out.println("問８");
			//問8 　ログ出力が行えるように下記コードを１箇所修正してください
	    		String message = "Hello World!";
	    		LOGGER.info("The message is: " + message);
	    		LOGGER.log(Level.INFO,"ミドルスキルログが発生しました");

			//改行
			System.out.println("問９");
			//問9　問題：
			//入力された文字列を整数に変換し、その結果を出力するプログラムを作成してください。ただし、以下の場合には例外を発生させてください。
			//1.入力された文字列がnullの場合
			//2.入力された文字列が空文字列の場合
			//3.入力された文字列が整数に変換できない場合（NumberFormatExceptionが発生する場合）
			
			Scanner k = new Scanner(System.in);
			String sumk = k.nextLine().trim();

			try {
				if(sumk.equals("")) {
					throw new Exception();
				}
				Integer ii =Integer.parseInt(sumk);
			}catch(NullPointerException e){
				System.out.println("ヌルポが発生しました");
			}catch(NumberFormatException e) {
				System.out.println("数字フォーマットエラーが発生しました");
			}catch(Exception e) {
				System.out.println("空文字エラーが発生しました");
			}
			
			
	     	//改行
			System.out.println("問１１");
			//問11 Java編終わった感想と改善点もしございましたらお願いします。
			//『ここに書いてね』
		}


	
}
