import java.util.Scanner;

public class Task0803 {

    public static boolean checkIfItWasPrinted(int[] arr, int index){
        if (index == 0){
            return false;
        }
        for (int i = index-1; i >= 0; i--){
            if (arr[i] == arr[index]){
                return true;
            }
        }

        return false;
    }

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

        for (int i = 0; i < size; i++){
            if (!checkIfItWasPrinted(arr,i)){
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
    }
}
