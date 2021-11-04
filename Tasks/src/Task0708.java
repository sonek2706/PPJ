import java.util.Scanner;

public class Task0708 {

    public static boolean inSum(int a, int b, int c, int d, int n){
        if ((n >= a && n <= b) || (n >= c && n <= d))
            return true;
        else
            return false;
    }

    public static boolean inIntersect(int a, int b, int c, int d, int n){
        if ((n >= a && n <= b) && (n >= c && c <= d))
            return true;
        else
            return false;
    }

    public static boolean inSymDiff(int a, int b, int c, int d, int n){
        if (((n >= a && n <= b) && !(n >= c && c <= d)) || (!(n >= a && n <= b) && (n >= c && n <= d)))
            return true;
        else
            return false;
    }

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int a, b, c ,d;
        System.out.println("Please enter your input, so that a < b, c < d and a,b,c,d belongs to [-5;5].");
        System.out.print("a = ");
        a = sc.nextInt();
        System.out.print("b = ");
        b = sc.nextInt();
        System.out.print("c = ");
        c = sc.nextInt();
        System.out.print("d = ");
        d = sc.nextInt();
        sc.close();

        for (int n = -5; n <= 5; n++){
            System.out.printf("%2d",n);
            System.out.print(":inSum? ");
            System.out.printf("%5b",inSum(a,b,c,d, n));
            System.out.print(";inIntersect? ");
            System.out.printf("%5b",inIntersect(a,b,c,d, n));
            System.out.print(";inSymDiff? ");
            System.out.printf("%5b",inSymDiff(a,b,c,d,n));
            System.out.println();
        }


    }
}
