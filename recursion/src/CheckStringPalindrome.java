public class CheckStringPalindrome {
    public static void main(String[] args) {
        String str = "mom";
        System.out.println(isPalindrome(str));
    }
    static boolean isPalindrome(String s) {
        String cleanString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder reverse = new StringBuilder();
        for (int i = cleanString.length() - 1; i >= 0; i--) {
            reverse.append(cleanString.charAt(i));
        }

        return reverse.toString().equals(cleanString);
    }
}
