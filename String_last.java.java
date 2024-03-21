import java.util.Scanner;
class String_last
 {
    public int lengthOfLastWord(String s) {
        int i = s.length() - 1;

        while (i >= 0 && s.charAt(i) == ' ')
            --i;
        final int lastIndex = i;
        while (i >= 0 && s.charAt(i) != ' ')
            --i;

        return lastIndex - i;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "Hello World";
        int result = solution.lengthOfLastWord(s);
        System.out.println("Output: " + result);
    }
}
