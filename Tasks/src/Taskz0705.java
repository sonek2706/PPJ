public class Taskz0705 {

    public static int maxValueInArray(int[] arr) {
        int max = 0;
        for (int e : arr) {
            if (e > max) max = e;
        }

        return max;
    }

    public static void printArray(int[] arr){
        for (int e: arr)
            System.out.print(e + " ");

        System.out.println();
    }

    public static int[] func(int[][] arr) {
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = maxValueInArray(arr[i]);
        }


        return result;
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 3},
                {3, 4, 5, 8},
                {6, 8},
                {1, 9, 6}};

        printArray(func(arr));
    }
}
