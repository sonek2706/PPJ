public class Task0902 {

    public static void printArray(int[][] arr){
        for (int[] row: arr){
            for (int e: row){
                System.out.print(e + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){

        int[][] arr = { {1,3,2,5},
                        {3,4,8,2},
                        {2,6,8,1},
                        {1,8,5,9} };

        for (int i = 0; i < arr[0].length; i++){

            System.out.println("Before: ");
            printArray(arr);

            int sum = 0;
            for (int j = 0; j < arr.length; j++){
                sum += arr[j][i];
            }

            int oldval = arr[i][i];
            arr[i][i] = sum - arr[i][i];

            System.out.println("After: ");
            printArray(arr);

            System.out.println("Row: " + i + " Column: " + i + "\nChanged from " + oldval + " to -> " + arr[i][i]);
        }
    }
}
