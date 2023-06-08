class main {
    static boolean SieveOfEratosthenes(int s, boolean isPrime[]) {
        isPrime[0] = isPrime[1] = false;
        for (int i = 2; i <= s; i++)
            isPrime[i] = true;
        for (int p = 2; p * p <= s; p++) {
            if (isPrime[p] == true) {
                for (int i = p * p; i <= s; i += p)
                    isPrime[i] = false;
            }
        }
        return false;
    }

    static void findPrimePair(int s) {
        boolean isPrime[] = new boolean[s + 1];
        SieveOfEratosthenes(s, isPrime);
        for (int i = 0; i < s; i++) {
            if (isPrime[i] && isPrime[s - i]) {
                System.out.print(i + " " + (s - i));
                return;
            }
        }
    }

    public static void main(String[] args) {
        int s = 94;
        findPrimePair(s);
    }
}
