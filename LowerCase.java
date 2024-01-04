/** String processing exercise 1. */
public class LowerCase {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(lowerCase(str));
    }

   /**
    * Returns a string which is identical to the original string, 
    * except that all the upper-case letters are converted to lower-case letters.
    * Non-letter characters are left as is.
    */
    public static String lowerCase(String s) {
        String newStr = "";
        for (int i = 0; i < s.length(); i++) {
            char letter =s.charAt(i);
            int letterInt = s.charAt(i);
            if(letterInt>=65 && letterInt<=90){
                //System.out.println(letterInt);
                letter = (char)(letterInt-65+97);
                //System.out.println(letter);
            }
            newStr += letter;
        }
        return newStr;
    }
}
