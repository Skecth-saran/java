class main {
    public static int ans = 10000000;

    public static void solve(int a[], int s, int p, int index, int sum, int maxsum) {
        if (p == 1) {
            maxsum = Math.max(maxsum, sum);
            sum = 0;
            for (int i = index; i < s; i++) {
                sum += a[i];
            }
            maxsum = Math.max(maxsum, sum);
            ans = Math.min(ans, maxsum);
            return;
        }
        sum = 0;
        for (int i = index; i < s; i++) {
            sum += a[i];
            maxsum = Math.max(maxsum, sum);
            solve(a, s, p - 1, i + 1, sum, maxsum);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 6, 7, 8 };
        int p = 3;
        int s = 4;
        solve(arr, s, p, 0, 0, 0);
        System.out.println(ans + "\n");
    }
}
