import java.util.TreeSet;

public class Main {
    public static void main(String[] args){
      
        TreeSet<Integer> treeSet = new TreeSet<>(new Custom());
        treeSet.add(22);
        treeSet.add(33);
        treeSet.add(44);
        treeSet.add(55);

        for(Integer g: treeSet){
            System.out.println(g);
        }
        System.out.println("-----------------------");
        System.out.println("Ceiling value for 23: " + treeSet.ceiling(23));
        System.out.println("Higher value of 53: " + treeSet.higher(53));
        System.out.println("Greatest element less than 50 is: " + treeSet.lower(50));
        System.out.println("Is the tree set empty: " + treeSet.isEmpty());

    }
}


