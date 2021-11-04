import java.util.Scanner;

public class Task0706 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Please enter your input: ");
        n = sc.nextInt();
        sc.close();
        if (n <= 0){
            System.out.println("Wrong input! Error");
        }
        else {
            for (int i = 1; i <= n; i++){
                for (int j = 1; j <= n; j++) {
                    System.out.printf("%4d",i*j);
                }
                System.out.print("\n");
            }
        }
    }
}
