public class    Task0805 {

    public static void main(String[] args){

        int size = 5;
        int[] arr = {1, 5, 8, 2, 6};
        // Before
        for (int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int height = 0;
        for (int i=0; i < size; i++){
            if (height < arr[i]){
                height = arr[i];
            }
        }

        for (int i = height; i > 0 ; i--){
            for (int j = 0; j < size; j++){
                System.out.print((i <= arr[j])?"*":" ");
            }
            System.out.println();
        }

    }
}
