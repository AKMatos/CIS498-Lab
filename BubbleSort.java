//A simple algorithm for bubble sorting an array.

public class BubbleSort {

    public static void main(String[] args) {
        
        //init our arr to be sorted
        int arr[] = { 6, 4, 1, 10, 2, 5, 3, 8, 7, 9};

        //for each item in the list to be sorted
        for (int i = 0; i < arr.length; i++) {

            //for each item before this current item
            for (int j = 0; j < arr.length-1-i; j++) {
                //if the current value is less than the next value
                if (arr[j] > arr[j+1]) {
                    //save the current value in temp
                    int temp = arr[j];
                    //set the current value to the next value
                    arr[j] = arr[j+1];
                    //move the previously current item over
                    arr[j+1] = temp;
                }
            }
        }
        
        //print out the final resulting array after sorting
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
