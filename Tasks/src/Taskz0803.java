import java.util.Arrays;

class FuncStat {
    public static int fiboR(int n) {
        if (n <= 1) return n;

        return fiboR(n - 1) + fiboR(n - 2);
    }

    public static int fibol(int n) {
        if (n == 0) return 0;
        if (n <= 2) return 1;

        int prev = 1; // 1
        int current = 1; // 2
        int result = prev + current;
        for (int i = 3; i < n; i++) {
            prev = current;
            current = result;
            result = prev + current;
        }

        return result;
    }

    public static int factR(int n) {
        if (n == 1) return 1;

        return n * factR(n - 1);
    }

    public static int factl(int n) {
        int result = n;
        for (int i = n - 1; i > 1; i--) {
            result *= i;
        }

        return result;
    }

    public static int gcdR(int a, int b) {
        if (b == 0) return a;
        return gcdR(b, a % b);
    }

    public static int gcdl(int a, int b) {
        int result = 0;
        for (int i = 2; i <= Math.sqrt(a) && i < Math.sqrt(b); i++) {
            if (a % i == 0 && b % i == 0)
                result = i;
        }
        return result;
    }

    public static int maxElem(int[] arr, int from) {
        if (from == arr.length)
            return 0;

        return arr[from] < maxElem(arr, from + 1) ? maxElem(arr, from + 1) : arr[from];
    }

    public static int numEven(int[] arr, int from) {
        if (from == arr.length)
            return 0;

        return numEven(arr, from + 1) + ((arr[from] % 2 == 0) ? 1 : 0);
    }

    public static void reverse(int[] arr, int from) {
        if (from < arr.length / 2) {
            int tmp = arr[from];
            arr[from] = arr[arr.length - 1 - from];
            arr[arr.length - 1 - from] = tmp;

            reverse(arr, from + 1);
        }
    }

    public static boolean isPalindrom(String str) {

        if (str.length() - 1 < 1) return true;

        if (str.charAt(0) != str.charAt(str.length() - 1)) return false;
        else return isPalindrom(str.substring(1, str.length() - 1));
    }
}

public class Taskz0803 {
    public static void main(String[] args) {
        System.out.println("Wait...");
        System.out.println(FuncStat.fiboR(45));
        System.out.println(FuncStat.fibol(45));
        System.out.println(FuncStat.factR(12));
        System.out.println(FuncStat.factl(12));
        System.out.println(FuncStat.gcdR(12125, 40643));
        System.out.println(FuncStat.gcdl(12125, 40643));
        int[] a = {3, 8, 2, 9, 7, 4};
        System.out.println("Max     : " + FuncStat.maxElem(a, 0));
        System.out.println("Num even: " + FuncStat.numEven(a, 0));
        System.out.println("Before:   " + Arrays.toString(a));
        FuncStat.reverse(a, 0);
        System.out.println("After :   " + Arrays.toString(a));
        System.out.println("Is 'radar' a palindrom? " +
                FuncStat.isPalindrom("radar"));
        System.out.println("Is 'abba' a palindrom?  " +
                FuncStat.isPalindrom("abba"));
        System.out.println("Is 'rover' a palindrom? " +
                FuncStat.isPalindrom("rover"));
    }
}
