
public class Palin {
    public static void main(String[] args) {
        String str = "abcba";
        System.out.println(isPalindrome(str));
    }

    static boolean isPalindrome(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        
        str = str.toLowerCase();
        int start = 0;
        int end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}