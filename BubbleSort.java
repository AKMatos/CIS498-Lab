//A simple algorithm for bubble sorting an array.
//this is Daniel Kinsella hi how are u
//top text
public class BubbleSort {

    public static void main(String[] args) {
            
        int arr[] = { 6, 4, 1, 10, 2, 5, 3, 8, 7, 9};
        int temp = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length-1; j++) {
                
                if (arr[j] < arr[j+1]) {

                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for (int i = arr.length-1; i > -1; i--) {

            System.out.println(arr[i]);
        }
    }
}
