//A simple algorithm for bubble sorting an array.

public class BubbleSort {

    public static void main(String[] args) {

        //1. No semicolon
        int arr[] = {6, 4, 1, 10, 2, 5, 3, 8, 7, 9};

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length-1-i; j++) {

                //5. Need to check if it's greater than and not less
                if (arr[j] > arr[j+1]) {
                    //2. Temp isn't defined
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    //4. Need to actually do something with temp
                    arr[j+1] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {

            //3. Printing wrong integer
            System.out.println(arr[i]);
        }
    }
}
