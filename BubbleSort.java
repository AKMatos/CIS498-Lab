// A simple algorithm for bubble sorting an array.

public class BubbleSort {

    public static void main(String[] args) {
        
        int arr[] = { 6, 4, 1, 10, 2, 5, 3, 8, 7, 9 }; // add semicolon

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                
                if (arr[j] > arr[j + 1]) {  // use > instead of <
                    int temp = arr[j];      // declare temp
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;      // complete swap
                }
            }
        }

        // Print sorted array
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]); // Change index
        }
    }
}


