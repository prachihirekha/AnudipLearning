package lab.conditional_satament.array_moudle10;

public class CopyTheArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        // create a new array to store the copy
        int[] copyArray = new int[array.length];
        // using the for loop to iterate the array and copy each element to the copyArray one by one
        for (int i = 0; i < array.length; i++) {
            copyArray[i] = array[i];


        }
        // print the copied array
        System.out.println("copy array element :");
        // using for each loop to store the copy element use num
        for (int num : copyArray) {
            System.out.print(num);// print method use  num  variable in one line
        }
    }
}
/*
Initialization:

int[] array = {1, 2, 3, 4, 5}: This initializes the array array with elements 1, 2, 3, 4, 5.
int[] copyArray = new int[array.length]: This creates a new array copyArray with the same length as array (5 elements), initialized with default values (0s).
Copying Elements:

The for loop iterates over the array and copies each element to copyArray.
First Iteration (i = 0):

copyArray[i] = array[i]: copyArray[0] = array[0] → copyArray[0] = 1
Current values:
copyArray = {1, 0, 0, 0, 0}
i = 0
Second Iteration (i = 1):

copyArray[i] = array[i]: copyArray[1] = array[1] → copyArray[1] = 2
Current values:
copyArray = {1, 2, 0, 0, 0}
i = 1
Third Iteration (i = 2):

copyArray[i] = array[i]: copyArray[2] = array[2] → copyArray[2] = 3
Current values:
copyArray = {1, 2, 3, 0, 0}
i = 2
Fourth Iteration (i = 3):

copyArray[i] = array[i]: copyArray[3] = array[3] → copyArray[3] = 4
Current values:
copyArray = {1, 2, 3, 4, 0}
i = 3
Fifth Iteration (i = 4):

copyArray[i] = array[i]: copyArray[4] = array[4] → copyArray[4] = 5
Current values:
copyArray = {1, 2, 3, 4, 5}
i = 4
End of Loop:

The loop terminates after the fifth iteration since i reaches the length of the array (array.length which is 5).
copyArray now contains the copied elements: {1, 2, 3, 4, 5}.
Printing the Copied Array:

System.out.println("copy array element :");: This prints the message "copy array element :".
The for-each loop iterates over copyArray to print each element in a single line without spaces.
*/