package workspace.collection;

import java.util.*;

public class ArrayListDemo {
    public static void main(String[] args) {
//        List  list = new ArrayList();
//        ArrayList list1 = new ArrayList<>();
//        ArrayList li = new ArrayList();
        List<String> list = new ArrayList();
        list.add("Prachi");
        list.add("Raja");
        list.add("Vaishnvi");
        list.add("Roshan");
        List<String> list1 = new ArrayList<>();
        list1.add("Rramesh");
        list1.add(" rama");
        list.addAll(list1);
        System.out.println(list);
        System.out.println(list1);
        list.contains("prachi");
        //list.remove(0);
       // list.removeAll(list1);
        list.set(0, "Prajwal");
        System.out.println(list);
        System.out.println(list.size());
//list.add('P');
//list.add(3);
//list.add(true);
//list.add(2.3);

    }
}
