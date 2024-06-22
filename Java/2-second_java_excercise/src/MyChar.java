public class MyChar {
    private char character;

    public MyChar(char character){
        this.character = character;
    }

    public boolean isVowel(){
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        for (int i = 0; i < vowels.length; i++) {
            if (this.character == vowels[i]){
                return true;
            }
        }
        return false;
    }
    
    public boolean isNumber(){
        if (this.character >= 48 && this.character <= 57){
            return true;
        }
        return false;
    }
    
    public boolean isAlphabet(){
        if (this.character >= 65 && this.character <= 90){
            return true;
        }
        if (this.character >= 97 && this.character <= 122){
            return true;
        }
        return false;
    }

    public boolean isConsonant(){
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        for (int i = 0; i < vowels.length; i++) {
            if (isAlphabet() && !isVowel()){
                return true;
            }
        }
        return false;
    }

    public void printAllLowerChar(){
        for (char ch = 'a'; ch <= 'z'; ch++) {
            System.out.println(ch);
        }
    }

    public void printAllUpperChar(){
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.println(ch);
        }
    }
}
