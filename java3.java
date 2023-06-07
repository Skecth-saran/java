import java.io.*;
import java.util.*;

class main {

    public static int findPlatform(int arr[], int dep[], int n) {
        int plat_needed = 1, result = 1;
        for (int i = 0; i < n; i++) {
            plat_needed = 1;
            for (int j = 0; j < n; j++) {
                if (i != j)
                    if (arr[i] >= arr[j] && dep[j] >= arr[i])
                        plat_needed++;
            }
            result = Math.max(result, plat_needed);
        }

        return result;
    }

    public static void main(String[] args) {
        int arr[] = { 100, 300, 500 };
        int dep[] = { 900, 400, 600 };
        int n = 3;
        System.out.println(findPlatform(arr, dep, n));
    }
}
