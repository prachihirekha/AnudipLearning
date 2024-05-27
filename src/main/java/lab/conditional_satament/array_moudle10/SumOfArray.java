package lab.conditional_satament.array_moudle10;

public class SumOfArray {
    // crating main class
    public static void main(String[] args) {
        // num use for a number to store in array element
        int [] num={1,2,3,4,5};
         int sum=0;// store a sum of array elemets
        // using loop for loop
        for(int i=0; i< num.length;i++){
            sum=sum+num[i];
        }

        System.out.println("sum of array element"+ sum);
    }
}
/*
Initialization:

int [] num = {1, 2, 3, 4, 5}: This initializes the array num with elements 1, 2, 3, 4, 5.
int sum = 0: This initializes the variable sum to 0, which will hold the sum of the array elements.
First Iteration (i = 0):

sum = sum + num[i]: sum = 0 + num[0] → sum = 0 + 1 → sum = 1
Current values:
sum = 1
i = 0
Second Iteration (i = 1):

sum = sum + num[i]: sum = 1 + num[1] → sum = 1 + 2 → sum = 3
Current values:
sum = 3
i = 1
End of Loop:

The loop terminates after the fifth iteration since i reaches the length of the array (num.length which is 5).
sum now contains the total sum of the array elements, which is 15.
Output:

System.out.println("sum of array element" + sum): This prints sum of array element 15.

 */
