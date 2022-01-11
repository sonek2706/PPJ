public class Taskz0704 {

    public static void printArray(int[] arr){
        for (int e: arr)
            System.out.print(e + " ");

        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};

        int tmp = arr[0];
        for (int i = 1; i < arr.length; i++){
            arr[i-1] = arr[i];
        }

        arr[arr.length-1] = tmp;

        printArray(arr);
    }
}
