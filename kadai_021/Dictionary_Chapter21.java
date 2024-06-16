package kadai_021;

import java.util.HashMap;
public class Dictionary_Chapter21 {

  public void search(String[]english) {

    HashMap<String,String> dictionary = new HashMap<String,String>();

    String result = "";

    dictionary.put("apple","りんご");
    dictionary.put("peach", "桃");
    dictionary.put("banana", "バナナ");
    dictionary.put("lemon", "レモン");
    dictionary.put("pear", "梨");
    dictionary.put("kiwi", "キウイ");
    dictionary.put("strawberry", "いちご");
    dictionary.put("grape", "ぶどう"); 
    dictionary.put("muscat", "マスカット"); 
    dictionary.put("cherry", "さくらんぼ");

    for (int i = 0; i < english.length; i++) {
      result = dictionary.get(english[i]);

      if (result == null) {
        result = english[i] + "は辞書にはありません";
      } else {
        result = english[i] + "の意味は" + result + "です";
      }
      System.out.println(result);
    
    }
  }
}   
    
    
    
      

  

 



  

  

