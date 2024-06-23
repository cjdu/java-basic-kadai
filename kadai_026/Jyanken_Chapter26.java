package kadai_026;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter26 {
	
	// メソッド
	public String getMyChoice() {
		
		// 自分の手を入力
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("自分のじゃんけんの手を入力しましょう");
			System.out.println("グーはrockのrを入力しましょう");
			System.out.println("チョキはscissorsのsを入力しましょう");
			System.out.println("パーはpaperのpを入力しましょう");
			
			String myChoice = scanner.next();
			
			// 正しいじゃんけんの手かを判定
			if(!(myChoice.equals("r") || myChoice.equals("s") || myChoice.equals("p"))) {
				System.out.println("グーのr、チョキのs、パーのpのいずれかを入力してください");
				continue;
			} else {
				scanner.close();
				return myChoice;  // じゃんけんクラスを実行するクラスに、自分の手を返す
			}
		}
	}
		
		
	public String getRandom() {
		String[] rsp = {"r", "s", "p"};  // 配列にじゃんけんの手をセットする
		String choice = rsp [(int)(Math.floor(Math.random()*3))];// 乱数で対戦相手のじゃんけんの手を選ぶ 
		return choice;// じゃんけんクラスを実行するクラスに、相手のじゃんけんの手を返す	
	}
	
	
	public void playGame(String myChoice, String random) {
		String result = "";
		
		HashMap<String,String> rsp = new HashMap<>(); // 自分と対戦相手のじゃんけんの手を出力する
		 rsp.put("r","グー");
		 rsp.put("s","チョキ");
		 rsp.put("p","パー");
		 
		 System.out.println("自分の手は" + rsp.get(myChoice) + "です");
		 System.out.println("対戦相手の手は" + rsp.get(random) + "です");
		 
		 // 自分と相手の手を比較                                                                        
		 if   (myChoice.equals("r")&&random.equals("s") || myChoice.equals("s")&&random.equals("p") || myChoice.equals("p")&&random.equals("r"))  { 
			 result = "自分の勝ちです";
		 } else if (myChoice.equals("r")&&random.equals("p") || myChoice.equals("s")&&random.equals("r") || myChoice.equals("p")&&random.equals("s")) {
			 result = "自分のまけです";   
		 }  else {
			 result = "あいこです";
		 }
			
			System.out.println(result);
		  
		
	}
		 
	}
	
