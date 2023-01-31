public class Nr9_PalindromeNumber {
    public boolean isPalindrome(int x) {
        int length = length(x);
        if (x < 0) {
            return false;
        } else if (length == 1) {
            return true;
        } else {
            int[] comp = new int[length];
            int temp = x;
            for (int i = length; i > 0; i--) {
                comp[i - 1] = temp % 10;
                temp -= temp % 10;
                temp /= 10;
            }
            boolean hmm = true;
            for (int i = 0, j = comp.length - 1; i <= j; i++, j--) {
                if (comp[i] != comp[j]) {
                    hmm = false;
                    break;
                }
            }
            return hmm;
        }
    }
    private int length(int x) {
        int length = 1;
        while(x / 10 > 0) {
            x /= 10;
            length++;
        }
        return length;
    }
}
