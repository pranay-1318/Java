public class VowelConsonant {
    public static void main(String[] args) {
        char ch = 'm';
        if ("aeiouAEIOU".indexOf(ch) != -1)
            System.out.println(ch + " is a vowel");
        else
            System.out.println(ch + " is a consonant");
    }
}

// "aeiouAEIOU" is a string containing all vowels (both lowercase and uppercase).
// .indexOf(ch) checks if the character ch exists in this string.
// If ch is found, indexOf() returns its position (like 0, 1, 2...).
// If not found, it returns -1.