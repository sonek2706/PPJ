public class Task0806 {
    public static void main (String[] args){

        int[] arr = {2,3,4,3,6,7,6,8,2,9};
        int[] brr = {2,3,6,8,5,1};

        for (int i = 0; i < arr.length; i++){
            boolean wasPrinted = false;
            for (int j = 0; j < i && !wasPrinted; j++){
                if (arr[i] == arr[j]){
                    wasPrinted = true;
                }
            }

            if(!wasPrinted){
                for (int j = 0; j < brr.length; j++){
                    if (arr[i] == brr[j]) System.out.print(" " + arr[i]);
                }
            }

        }

//        int maxVal = arr[0];
//        int minVal = arr[0];
//        for (int i = 1; i < arr.length; i++){
//            if (maxVal < arr[i]) maxVal = arr[i];
//            if (minVal > arr[i]) minVal = arr[i];
//        }
//
//        for (int i = 1; i < brr.length; i++){
//            if (maxVal < arr[i]) maxVal = brr[i];
//            if (minVal > arr[i]) minVal = brr[i];
//        }
//
//        for (int i = minVal; i < maxVal; i++){
//            boolean existInArr = false;
//            boolean existInBrr = false;
//
//            for (int j = 0; j < arr.length; j++){
//                if (arr[j] == i){
//                    existInArr = true;
//                    break;
//                }
//            }
//
//            for (int j = 0; j < brr.length; j++){
//                if (brr[j] == i){
//                    existInBrr = true;
//                    break;
//                }
//            }
//
//            if (existInArr && existInBrr) System.out.print(i + " ");
//        }
    }
}
