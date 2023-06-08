public class main {
    public static void main(String[] args) {
        long S = 63698;
        long ans = findNth(S);
        System.out.println(ans);

    }

    static long findNth(long S) {
        long count = 0;
        for (int i = 1; i > 0; i++) {
            if (isDigitNine(i) == false) {
                count++;
                if (count == S) {
                    count = i;
                    break;
                }
            }

        }
        return count;
    }

    static boolean isDigitNine(int i) {
        while (i > 0) {
            int rem = i % 10;
            if (rem == 9) {
                return true;
            }
            i = i / 10;
        }
        return false;
    }

}
