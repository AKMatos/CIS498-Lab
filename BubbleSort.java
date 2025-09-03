//A simple algorithm for bubble sorting an array.

public class BubbleSort {

    public static void main(String[] args) {   
        int temp ; // err 1 = declare temp
        int arr[] = { 6, 4, 1, 10, 2, 5, 3, 8, 7, 9} ;  //err 2 = missing semi
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]) { // err 3 = sorted incrementing, instead of decrementing
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp ;   // err 4 = added to filter all values
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]); //err 5 = passing through wrong var
        }                 
    }
    // The sixth error is that there is not six errors, there are five. :)))
}
