public class Task0901 {
    public static void main(String[] args){
        int[][] arr = { {1,3,2}, {3,4,8}, {2,6,8}, {1,8,5} };

        int maxRowSum = 0;
        int maxRowSumIndex = 0;
        int maxColSum = 0;
        int maxColSumIndex = 0;
        for (int i = 0; i < arr.length; i++){
            int rowSum = 0;
            for (int j = 0; j < arr[i].length; j++){
                rowSum += arr[i][j];
            }

            if (rowSum > maxRowSum){
                maxRowSum = rowSum;
                maxRowSumIndex = i;
            }
        }

        System.out.println("Sum " + maxRowSum + " Row index: " + maxRowSumIndex);

        for (int i = 0; i < arr[i].length; i++){
            int colSum = 0;
            for (int j = 0; j < arr.length; j++){
                colSum += arr[j][i];
            }

            if (colSum > maxColSum){
                maxColSum = colSum;
                maxColSumIndex = i;
            }
        }
        System.out.println("Sum " + maxColSum + " Col index: " + maxColSumIndex);

    }
}
