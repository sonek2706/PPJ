import java.util.Scanner;

public class Task0801 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int size, size2 = 0;
        System.out.println("Please enter the size of the array: ");
        size = sc.nextInt();

        int[] arr = new int[size];
        System.out.println("Please enter the elements of the array: ");
        for (int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
            if (arr[i]%2 == 0){
                size2++;
            }
        }

        int[] brr = new int[size2];
        int index = 0;
        for (int i = size-1; i >= 0; i--){
            if (arr[i]%2 == 0) {
                brr[index] = arr[i];
                index++;
            }
        }

        for (int i = 0; i < size2; i++){
            System.out.print(brr[i] + " ");
        }



    }
}
