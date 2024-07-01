package lab.conditional_satament.lab41.lab43;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSorted {
    public static void main(String[] args) {
        // creatring an arraylist and adding elemeny
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(3);
        arrayList.add(8);
        arrayList.add(2);
        arrayList.add(1);
        arrayList.add(6);
        // print the original arraylist
        System.out.println(arrayList);

        // sorting the arraylist
        Collections.sort(arrayList);
        System.out.println("Sorted List"+ arrayList);
    }
}
