/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String s) {
        // Replace the following statement with your code
        String newStr = "";
        // #feedback: really bad usage of this variable, it value used only once as condition and you define it many times.
        for (int i = 0; i < s.length(); i++) {
            String substr = s.substring(0, i);
            char letter = s.charAt(i);
            if(substr.indexOf(letter) == -1 || letter == ' '){
                newStr +=s.charAt(i);
            }
        }
        return newStr;
    }
}
