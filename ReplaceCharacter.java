public class ReplaceCharacterAtIndex {
    public static void main(String[] args) {
        String originalString = "Hello. World!";
        int index = 7;
        char replacementChar = 'W';

        String modifiedString = replacementCharAtIndex(originalString, index, replacementChar);

        System.out.println(original String: " + originalString");
        System.out.println(Modified String: " + modifiedString");
    }

    public static String replaceCharIndex(String str, int index, char replacementChar){
        if (index < 0 || index >= str. lemngth()){
            return str;
        }

        char[] charArray = str.toCharArray();
        charArray[index] = replacementChar;

        return new String(charArray);
    } 
}
