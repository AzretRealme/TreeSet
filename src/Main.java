
import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args){
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        };
        TreeSet<Integer> treeSet = new TreeSet<>(new Custom());
        treeSet.add(22);
        treeSet.add(33);
        treeSet.add(44);
        treeSet.add(55);

        for(Integer g: treeSet){
            System.out.println(g);
        }
        System.out.println("---------------");
        System.out.println(treeSet.ceiling(23) + " ceiling");
        System.out.println(treeSet.higher(53) + " higher");
        System.out.println(treeSet.lower(50) + " lower");

    }
}

