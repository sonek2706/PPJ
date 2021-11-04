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
            int x = height - a, y = height - b, z = height - c;

            for (int j = height; j > 0; j--){
                String line = "";
                if (x > 0) {
                    line += " ";
                    x -= 1;
                }
                else
                    line += "*";

                if (y > 0) {
                    line += " ";
                    y -= 1;
                }
                else
                    line += "*";

                if (z > 0) {
                    line += " ";
                    z -= 1;
                }
                else
                    line += "*";


                System.out.println(line);
            }

        }
    }
}
