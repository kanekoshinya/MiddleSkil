import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Test1{
	public static void main(String[] args){

		//改行
		System.out.println("問１");
		//問題1:下記条件になるようログの出力を行いなさい。
		
		//条件１　例外でヌルポが発生させヌルポをキャッチした場合のみログ出力がされるプログラムにする事
		//条件２　"middleskill log"という名前のログのインスタンスを生成する事
		//条件３　srcディレクトリ内に"middleskill.log"としてログ出力される設定にする事
		//条件４　ログの内容はコンソールに出ている赤文字と同じ内容のものが表示される事
		//条件５　格納するログメッセージは"ミドルスキルログが発生しました。"という文言にする事
		
		// Loggerインスタンスの生成 
		Logger middleskill_logger = Logger.getLogger("middleskill log");

		// Handlerクラスのインスタンス生成のときの例外処理のためのtry-catch構文
		try{ 
			// 出力ファイルを指定する
		    FileHandler fh = new FileHandler("src/middleskill.log");
		    // 出力フォーマットを指定する
		    fh.setFormatter(new java.util.logging.SimpleFormatter());
		    middleskill_logger.addHandler(fh);
			//NullPointerExceptionを発生させる
			throw new NullPointerException();
		}catch(IOException e){
			System.out.println("入出力処理中の例外が発生しました。");
		}catch(NullPointerException e) {
			// ログの出力
			middleskill_logger.log(Level.INFO, "ミドルスキルログが発生しました。"); 
		}

	}
}
