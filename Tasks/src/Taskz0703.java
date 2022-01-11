public class Taskz0703 {

    public static int func(int[] arr) {
        int min = arr[0], max = 0;
        for (int e : arr) {
            if (e < min) min = e;
            else if (e > max) max = e;
        }

        return max - min;
    }

    public static void printArray(int[] arr) {
        for (int e : arr)
            System.out.print(e + " ");

        System.out.println();
        System.out.println(func(arr));
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        printArray(arr);
    }
}
