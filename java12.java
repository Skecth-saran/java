import java.util.*;

class main {
    static void findLongestPalindromicString(String text) {
        int p = text.length();
        if (p == 0)
            return;
        p = 2 * p + 1;
        int[] L = new int[p + 1];
        L[0] = 0;
        L[1] = 1;
        int q = 1;
        int R = 2;
        int i = 0;
        int iMirror;
        int maxLPSLength = 0;
        int maxLPSCenterPosition = 0;
        int start = -1;
        int end = -1;
        int diff = -1;
        for (i = 2; i < p; i++) {
            iMirror = 2 * q - i;
            L[i] = 0;
            diff = R - i;
            if (diff > 0)
                L[i] = Math.min(L[iMirror], diff);

            while (((i + L[i]) + 1 < p && (i - L[i]) > 0) && (((i + L[i] + 1) % 2 == 0)
                    || (text.charAt((i + L[i] + 1) / 2) == text.charAt((i - L[i] - 1) / 2)))) {
                L[i]++;
            }

            if (L[i] > maxLPSLength) {
                maxLPSLength = L[i];
                maxLPSCenterPosition = i;
            }
            if (i + L[i] > R) {
                q = i;
                R = i + L[i];
            }
        }

        start = (maxLPSCenterPosition - maxLPSLength) / 2;
        end = start + maxLPSLength - 1;
        System.out.printf("LPS of string is %s : ", text);
        for (i = start; i <= end; i++)
            System.out.print(text.charAt(i));
        System.out.println();
    }

    public static void main(String[] args) {
        String text = "123123123123";
        findLongestPalindromicString(text);

        text = "121212";
        findLongestPalindromicString(text);

        text = "12121212";
        findLongestPalindromicString(text);

        text = "123123123123";
        findLongestPalindromicString(text);

        text = "123765123765123765";
        findLongestPalindromicString(text);

        text = "32132";
        findLongestPalindromicString(text);

        text = "12467321567213";
        findLongestPalindromicString(text);

        text = "123567765321";
        findLongestPalindromicString(text);

        text = "12376543242312";
        findLongestPalindromicString(text);
    }
}
