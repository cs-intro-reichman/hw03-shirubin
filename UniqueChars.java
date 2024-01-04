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
        boolean add=true;
        for (int i = 0; i < s.length(); i++) {
            add=true;
            String substr = s.substring(0, i);
            char letter = s.charAt(i);
            if(substr.indexOf(letter)!=-1&& letter!=' '){
                System.out.println(i +" sub");
                add=false;
            }

            if (add==true){
                newStr +=s.charAt(i);
            }
        }
        return newStr;
    }
}
