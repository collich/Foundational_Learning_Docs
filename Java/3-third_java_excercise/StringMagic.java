import java.util.HashMap;
import java.util.Map;


public class StringMagic {
    public static boolean main(String[] args) {
        // String str = String.valueOf("Hello World");
        String str = String.valueOf("");

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
}
