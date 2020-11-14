package algorithms;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

public class ReplaceSubstringWithAnotherString {

    public static void main(String[] args){
        String str = "I use selenium webdriver. selenium is a tool for web applications automation";
        String toBeReplaced = "selenium";
        String toReplacedWith = "Firefox";
        String[] words = str.split(" ");
        StringBuilder strb = new StringBuilder();

        for(String word : words){
            if(word.equals(toBeReplaced)){
                strb.append(" ");
                strb.append(toReplacedWith);
            } else {
                strb.append(" ");
                strb = strb.append(word);
            }
        }
        System.out.println(strb);
    }
}
