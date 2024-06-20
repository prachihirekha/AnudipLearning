package workspace.collection;

import java.util.ArrayList;

/*array-it has fixed length
 * you can not change the size of the array once it is defined
 * you must know in advance how large an array you want
 *
 *
 * Collection-
 * you may not know how large an array you want
 * to overcome this situation, collection frameworks are there
 * collection are the group of the objects stored in well defined manner
 *
 * jdk 1.2 Dictionary, Vector, Stack, Properties
 *
 * jdk 1.5
 *
 * class extends class
 * class implements interface
 * interface extends interface
 *
 * 									object
 *
 * 								Iterable(Interface)              |               Map
 * 																 |
 * 							   Collection(Interface)			 |	HashMap HashTable TreeMap
 * 																 |
 * List(Interface)          Queue(I)            Set(Interface)
 * ArrayList(class)			Dequeue(C)			HashSet(Class)
 * Vector				Priority Queue			TreeSet
 * LinkedList			LinkedList
 */
public class CollectionDemo {

    public static void main(String[] args) {
        //interface List{
        // }
        //interface clonable{
   // }
        //AarrayLIst implements List extends AbstractList
       // LIst I
        //arraylist c
        ArrayList al = new ArrayList();// object of array list

        al.add("vaibhav");
        al.add("prachi");
        al.add("prajwal");
        al.add("rani");
        al.add(1);
        al.add('A');
        al.add(2.4);
        al.add(true);
        al.add(null);
        al.add("bhushan");
        System.out.println(al);
        al.remove(2);
        System.out.println(al);
        al.add("raja");
        System.out.println(al);
        System.out.println(al.get(4));






    }
    // u can put any type of data into array object
    //it is mainting the insertion order
    // duplicate are allow
    // arraylist accepting the null value, multiple null value are allow
    // it is a dynamic array
//retrival  is easy with array list instead of insertion and delection
    // in arraylist ,elements are positioned according to zero based index
// intial capacity arraylist is 10
}
// collection -isEmpty,contains(); iterator(), toArray(),add(),remove(),addAll(),removeAll()
// list-isEmpty,contains(); iterator(), toArray(),add(),remove(),addAll(),removeAll() + list method
//

