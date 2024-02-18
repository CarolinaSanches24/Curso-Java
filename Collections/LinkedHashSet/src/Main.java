import java.util.ArrayList;
        import java.util.Iterator;
        import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> numerosArrayList = new ArrayList<>();
        numerosArrayList.add(8);
        numerosArrayList.add(5);
        numerosArrayList.add(8);
        System.out.println("ArrayList: "+numerosArrayList);

        LinkedHashSet<Integer>numerosLinkedHashSet = new LinkedHashSet<>();
        numerosLinkedHashSet.addAll(numerosArrayList);
        numerosLinkedHashSet.add(4);

        System.out.println("LinkedHashSet");
        Iterator<Integer>iterator = numerosLinkedHashSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}