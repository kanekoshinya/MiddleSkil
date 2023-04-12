
public class test1 {

	public static void main(String[] args) {
		
		 String a = "";
		 int x = -1;
         int y = 80;
         int z = 15;
         
         a = (x < 0 && y < 0 && z < 0) ? (x % 10 == 0 && y % 10== 0 && z % 10== 0)? 
          		"正の整数：NG" : "10の倍数：NG" 
          		        : ( x + y + z == 100) ? 
          		        "プラス100：OK" : "プラス100：NG";
          		System.out.println(a); 
		
	}

}





