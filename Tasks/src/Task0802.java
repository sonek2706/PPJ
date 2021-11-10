import java.util.Scanner;

public class Task0802 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int size;
        System.out.println("Please enter the size of the array: ");
        size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Please enter the elements of the array: ");
        for (int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }

        // Before
        for (int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < size/2; i++){
            int tmp = arr[i];
            arr[i] = arr[size - i - 1];
            arr[size - i - 1] = tmp;
        }

        //After
        for (int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
}
