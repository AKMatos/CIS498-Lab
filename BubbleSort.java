//A simple algorithm for bubble sorting an array.

public class BubbleSort {

    public static void main(String[] args) {
            
        int arr[] = { 6, 4, 1, 10, 2, 5, 3, 8, 7, 9};   // missing ;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length-1-i; j++) {
                
                if (arr[j] > arr[j+1]) {    // flipped >

                    int temp = arr[j];      //initializing temp and setting it to arr[j]
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;        // initializing temp to be arr[j+1]
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {

            System.out.println(arr[i]); //changed arr[j] to arr[j]
        }
    }
}