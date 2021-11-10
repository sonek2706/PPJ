import java.util.Arrays;

public class Task0804 {

    public static boolean checkIfItExists(int[] arr, int index, int value){
        if (index == 0){
            return false;
        }
        for (int i = index-1; i >= 0; i--){
            if (arr[i] == value){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        final int SIZE = 10;
        final int NUMS = 13;
        int[] arr = new int[SIZE];
        int counter = 0;

        // your code here
        for (int i = 0; i < SIZE; i++){
            int tmp;
            do {
                tmp = (int)(Math.random()*NUMS) + 1;
                counter++;
            }while(checkIfItExists(arr, i, tmp));

            arr[i] = tmp;
        }

        System.out.println("With SIZE=" + SIZE + " and " +
                "NUMS=" + NUMS + " the array\nhas been " +
                "filled after " + counter + " trials");
        System.out.println("Array: " + Arrays.toString(arr));
    }
}
