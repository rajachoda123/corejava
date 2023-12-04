package java17;




public class MostContigousRepeated {
    public static void main(String[] args) {
        String str = "aabbbbbbbbbbbbcccdddddddeeff";
        System.out.println(mostRepeatedCharOfString(str));
    }

    private static char mostRepeatedCharOfString(String str) {
        char currentChar = str.charAt(0);
        char mostRepeatedChar =  currentChar;
        int currentCount = 1;
        int maxCount =1;
        for (int i =1; i< str.length() ; i++ ) {
            char c = str.charAt(i);
            if(currentChar == c) {
                currentCount ++;
            } else {
                currentChar = c;
                currentCount = 1;
            }
            if( currentCount > maxCount) {
                maxCount = currentCount;
                mostRepeatedChar = currentChar;
            }
        }

        return mostRepeatedChar;
    }
}
