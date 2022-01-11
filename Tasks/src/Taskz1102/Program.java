package Taskz1102; 

import java.util.Arrays;

public class Program {

    public static boolean isLess(String s1, String s2){
        return (s1.length() < s2.length())?true:(s1.length() == s2.length() && s1.compareTo(s2) < 0)?true: false;
    }

    public static void sortSel(String[] arr){

        int n = arr.length;
        for (int i = 0; i < n-1; i++)
        {
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (isLess(arr[i], arr[min_idx]))
                    min_idx = j;

            String temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        String[] arr = {"Kate", "Bea", "Mary", "Bea", "Zoe"};
        System.out.println(Arrays.toString(arr));
        sortSel(arr);
        System.out.println(Arrays.toString(arr));
    }
}
