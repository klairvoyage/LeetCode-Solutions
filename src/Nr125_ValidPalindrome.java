public class Nr125_ValidPalindrome {
    public boolean isPalindrome(String s) {
        StringBuilder yo = new StringBuilder();
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) yo.append(s.charAt(i));
        }
        char[] cleanString = yo.toString().toCharArray();
        boolean hm = true;
        for (int i = 0, j = cleanString.length - 1; i < j; i++, j--) {
            if (cleanString[i] != cleanString[j]) {
                hm = false;
                break;
            }
        }
        return hm;
    }

    /**
     * Massimo's Lösung
     */
    public boolean isPalindrome_alt(String s) {
        int length = s.length();
        for (int i = 0, j = length - 1; i < length; i++, j--) {
            if (length == 1) {
                return true;
            }
            while (i < length && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }
            if (i == length) {
                return true;
            }
            while (j > 0 && !Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }
            char left = Character.isUpperCase(s.charAt(i)) ? Character.toLowerCase(s.charAt(i)) : s.charAt(i);
            char right = Character.isUpperCase(s.charAt(j)) ? Character.toLowerCase(s.charAt(j)) : s.charAt(j);
            if (left != right) {
                return false;
            }
        }
        return true;
    }
}
