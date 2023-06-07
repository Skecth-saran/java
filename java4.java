
class Main {
    static int longestPalSubstr(String str) {
        String longest = "";
        int n = str.length();
        int j;
        String subs = "";
        String subsrev = "";
        for (int i = 0; i < n; i++) {
            j = n - 1;
            while (i < j) {
                if (str.charAt(i) == str.charAt(j) && longest.length() < (j - i + 1)) {
                    subs = str.substring(i, j + 1);
                    subsrev = new StringBuilder(subs)
                            .reverse()
                            .toString();
                    if (subs.equals(subsrev)) {
                        longest = subs;
                    }
                }
                j--;
            }
        }
        if (longest.length() == 0) {
            longest = str.substring(0, 1);
        }
        System.out.println("Longest palindrome substring is: " + longest);
        return longest.length();
    }

    public static void main(String[] args) {
        String str = "sarannaras";
        System.out.println("Length is: " + longestPalSubstr(str));
    }
}
