package workspace.collection;

import java.util.ArrayList;
import java.util.Iterator;

//different ways to iterating an arraylist in java
//interation using normal for loop
// interation using iterator object
// iteration using ListIteratro object
// iteratiom using enchanced for loop
public class IteratingArrayList {
    public static void main(String[] args) {
        ArrayList <String>list = new ArrayList();
        list.add("prachi");
       // list.add(1);
        list.add("A");
        list.add("prajwal");
        for(int i =0; i<list.size();i++){
            System.out.println(list.get(i));
        }
        // 2 iteration using iterator object
        Iterator in = list.iterator();
        while (in.hasNext()){
            System.out.println(in.next());
        }
        // 3 iteration using listiterator object
        Iterator li =list.iterator();
        while (li.hasNext()){
            System.out.println(li.next());
        }
        for (String element:list){
            System.out.println(
                    element
            );
        }

    }
}
