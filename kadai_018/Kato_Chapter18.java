

public abstract class Kato_Chapter18 {
  
  String familyName = "加藤";          // 姓のフィールド
  String givenName  = "";              // 名のフィールド
  String address    = "東京都中野区○×"; // 住所のフィールド

 // 共通の紹介を出力する
 public void commonIntroduce() {
  System.out.println("名前は" + this.familyName + this.givenName + "です。");
  System.out.println("住所は" + this.address + "です。");
 } 

 // 個別の紹介をする
 public abstract void eachIntroduce();

 // 紹介を実行する
 public void execIntroduce() {
  commonIntroduce();
  eachIntroduce();
 }

}
