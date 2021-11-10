import java.util.Scanner;

public class Task0707 {

    public static int max(int a, int b, int c){
        int res;
        if (a > b){
            if (a > c)
                res = a;
            else
                res = c;
        }
        else{
            if (b > c)
                res = b;
            else
                res = c;
        }

        return res;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        System.out.println("Please enter three non negative integers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if ((a < 0) || (b < 0) || (c < 0)){
            System.out.println("Wrong input: ");
        }
        else{
            int height = max(a,b,c);
            System.out.println(height);

//            for (int i = 0; i < height; i++){
//                if (a <= height - i - 1)
//                    System.out.print(" ");
//                else
//                    System.out.print("*");
//
//                if (b <= height - i - 1)
//                    System.out.print(" ");
//                else
//                    System.out.print("*");
//
//                if (c <= height - i - 1)
//                    System.out.print(" ");
//                else
//                    System.out.print("*");
//
//
//                System.out.println();
//            }

            for (int i = height; i > 0 ; i--){
                System.out.print((i <= a)?"*":" ");
                System.out.print((i <= b)?"*":" ");
                System.out.println((i <= c)?"*":" ");
            }
        }
    }
}
