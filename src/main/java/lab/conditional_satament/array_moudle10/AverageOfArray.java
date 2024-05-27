package lab.conditional_satament.array_moudle10;

public class AverageOfArray {
    public static void main(String[] args) {
        //initializes an arr
        int arr[] ={20,23,45,46};
        int sum=0;// sum variable for store the array elements
        // avg for average
        double avg;
        // calculate the sum of array
        for(int i=0;i< arr.length;i++){
            sum=sum+arr[i];
        }
        // calculate the average
        avg=(double)sum/ arr.length;// casting the  widening casting
      // print the average
        System.out.println("Average of the array element: "+ avg);


    }
}


//        * Initialization:
//
//        int arr[] = {20, 23, 45, 46}: This initializes the array arr with elements 20, 23, 45, 46.
//        int sum = 0: This initializes the variable sum to 0, which will hold the sum of the array elements.
//        double avg: This declares the variable avg to hold the average of the array elements.
//        Calculating the Sum:
//
//        The for loop iterates over the array arr and adds each element to sum.
//        First Iteration (i = 0):
//
//        sum = sum + arr[i]: sum = 0 + arr[0] → sum = 0 + 20 → sum = 20
//        Current values:
//        sum = 20
//        i = 0
//        Second Iteration (i = 1):
//
//        sum = sum + arr[i]: sum = 20 + arr[1] → sum = 20 + 23 → sum = 43
//        Current values:
//        sum = 43
//        i = 1
//        Third Iteration (i = 2):
//
//        sum = sum + arr[i]: sum = 43 + arr[2] → sum = 43 + 45 → sum = 88
//        Current values:
//        sum = 88
//        i = 2
//        Fourth Iteration (i = 3):
//
//        sum = sum + arr[i]: sum = 88 + arr[3] → sum = 88 + 46 → sum = 134
//        Current values:
//        sum = 134
//        i = 3
//        End of Loop:
//
//        The loop terminates after the fourth iteration since i reaches the length of the array (arr.length which is 4).
//        sum now contains the total sum of the array elements, which is 134.
//        Calculating the Average:
//
//        avg = (double)sum / arr.length: This calculates the average by dividing sum by the length of the array and casts sum to double to ensure floating-point division.
//        avg = (double)134 / 4 → avg = 134.0 / 4 → avg = 33.5
//        Printing the Average:
//
//        System.out.println("Average of the array element: " + avg);: This prints the message "Average of the array element: " followed by the value of avg.*/
