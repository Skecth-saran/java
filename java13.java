import java.util.*;

class main {
    public void solve(ArrayList<String> arr, HashSet<ArrayList<String>> res) {
        res.add(new ArrayList<String>(arr));
        if (arr.size() <= 1) {
            return;
        }
        for (int i = 1; i < arr.size(); i++) {
            if (arr.get(i - 1).equals(new StringBuilder(arr.get(i)).reverse().toString())) {
                ArrayList<String> brr = new ArrayList<String>();
                brr.addAll(arr.subList(0, i - 1));
                brr.add(arr.get(i - 1) + arr.get(i));
                brr.addAll(arr.subList(i + 1, arr.size()));
                solve(brr, res);
            }
            if (i + 1 < arr.size() && arr.get(i - 1).equals(new StringBuilder(arr.get(i + 1)).reverse().toString())) {
                ArrayList<String> brr = new ArrayList<String>();
                brr.addAll(arr.subList(0, i - 1));
                brr.add(arr.get(i - 1) + arr.get(i) + arr.get(i + 1));
                brr.addAll(arr.subList(i + 2, arr.size()));
                solve(brr, res);
            }
        }
    }

    public ArrayList<ArrayList<String>> getGray(String S) {
        HashSet<ArrayList<String>> res = new HashSet<ArrayList<String>>();
        ArrayList<String> arr = new ArrayList<String>(
                Arrays.asList(S.split("")));
        solve(arr, res);
        ArrayList<ArrayList<String>> sortedRes = new ArrayList<ArrayList<String>>(res);
        Collections.sort(
                sortedRes,
                new Comparator<ArrayList<String>>() {
                    public int compare(ArrayList<String> a, ArrayList<String> b) {
                        for (int i = 0; i < Math.min(a.size(), b.size()); i++) {
                            int pop = a.get(i).compareTo(b.get(i));
                            if (pop != 0) {
                                return pop;
                            }
                        }
                        return Integer.compare(a.size(), b.size());
                    }
                });
        return sortedRes;
    }

    public static void main(String[] args) {
        main ob = new main();
        ArrayList<ArrayList<String>> allPart = ob.getGray("saran");
        for (ArrayList<String> partition : allPart) {
            for (String str : partition) {
                System.out.print(str + " ");
            }
            System.out.println();
        }
    }
}
