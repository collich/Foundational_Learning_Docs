import java.util.HashMap;
import java.util.Map;


public class StringMagic {
    public String findLongestWord(String sentence){
        sentence = sentence.trim();
        if (sentence.isEmpty()){
            return "";
        }

        String longestWord = "";
        String[] listSent = sentence.split(" ");
        HashMap<String, Integer> hashSent = new HashMap<String, Integer>();
        for (String word : listSent) {
            hashSent.put(word, word.length());
        }

        for (Map.Entry<String, Integer> entry : hashSent.entrySet()) {
            
            if (entry.getValue() > longestWord.length()){
                longestWord = entry.getKey();
            }
        }
        return longestWord;
    }

    public boolean duplicateLetters(String str){
        // String str = String.valueOf("Hello World");

        if (str.isEmpty()){
            return false;
        }

        str = str.toLowerCase();
        boolean moreThanOnce = false;
        HashMap<String, Integer> hashStr = new HashMap<String, Integer>();
        String[] listStr = str.split("");

        for (String string : listStr) {
            if (hashStr.get(string) == null){
                hashStr.put(string, 1);
            } else {
                hashStr.put(string, hashStr.get(string) + 1);
            }
        }

        for ( Map.Entry<String, Integer> entry : hashStr.entrySet()) {
            if (entry.getValue() > 1){
                moreThanOnce = true;
            }
        }

        return moreThanOnce;
    }

    public int getRightmostDigit(String str){       
        int gotNumbers = -1;
        
        if (str.isEmpty()){
            return gotNumbers;
        }
        
        for (int i = str.length() - 1; i >= 0; i--){
            Character temp = str.charAt(i);
            if (Character.isDigit(temp)){
                gotNumbers = Character.getNumericValue(temp);
                break;
            }
        }

        return gotNumbers;
    }
}
