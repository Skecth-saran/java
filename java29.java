import java.util.*;

public class Tree_set6 {
    public static void main(String[] args) {
        TreeSet<Integer> tree_num = new TreeSet<Integer>();
        TreeSet<Integer> treeheadset = new TreeSet<Integer>();
        tree_num.add(11);
        tree_num.add(12);
        tree_num.add(13);
        tree_num.add(14);
        tree_num.add(15);
        tree_num.add(16);
        tree_num.add(17);
        tree_num.add(18);
        tree_num.add(19);
        treeheadset = (TreeSet) tree_num.headSet(7);
        Iterator iterator;
        iterator = treeheadset.iterator();
        System.out.println("Tree set data: ");
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " ");
        }
    }
}
