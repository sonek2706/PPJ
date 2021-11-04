import java.util.Scanner;

public class Task0705 {

    public static int sumOfDigits(int n) {
        if (n < 0){
            System.out.println("Wrong input! Must be a natural number");
            return 0;
        }
        else {
            int sum = 0;
            while (n>0){
                sum += n%10;
                n /= 10;
            }
            return sum;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n < 0){
            System.out.println("Your input is wrong, try sth else!");
        }

        int max = 0, max_val = 0;
        while (n!=0){
            int tmp = sumOfDigits(n);
            if (tmp > max_val){
                max_val = tmp;
                max = n;
            }
            n = sc.nextInt();
        }

        System.out.println("Max sum of digits was "+ max_val +" for " + max);
    }
}
