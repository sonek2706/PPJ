import java.util.Scanner;

public class Taskz0603 {
    public static void main(String[] args) {
        String[][] arr = {
                {"Kenya", "Nairobi"},
                {"Rwanda", "Kigali"},
                {"Gambia", "Banjul"},
                {"Ghana", "Accra"},
                {"Niger", "Niamey"},
                {"Zambia", "Lusaka"}
        };

        Scanner sc = new Scanner(System.in);
        String country = sc.nextLine();
        while(!(country.equals(""))){
            for (int i = 0; i < arr.length; i++) {
                if (country.equals(arr[i][0])) System.out.println(arr[i][1]);
                else System.out.println(country + "There's no such country in our db, please try again!");

                country = sc.nextLine();
            }
        }

        sc.close();
    }
}
