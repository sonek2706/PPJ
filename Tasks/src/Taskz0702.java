public class Taskz0702 {
    static int maxOfThree(int a, int b, int c) {
        int max = 0;
        if (a > max) max = a;
        if (b > max) max = b;
        if (c > max) max = c;

        return max;
    }

    static int greatestDivisor(int n) {
        for (int i = n - 1; i > 1; i--) {
            if (n % i == 0) return i;
        }

        return 1;
    }

    static boolean areRelativelyPrime(int a, int b) {

        while (a != b) {
            if (a > b)
                a -= b;
            else
                b -= a;
        }

        if (a == 1) return true;
        else return false;
    }

    static boolean isPerfect(int n) {
        int sum = 0;
        for (int i = n - 1; i >= 1; i--) {
            if (n % i == 0) sum += i;
        }

        if (sum == n) return true;
        else return false;
    }

    public static void main(String[] args) {
        int x = 2, y = 3, z = 1;
        System.out.println("Max of " + x + ", " + y + ", " +
                z + " is " + maxOfThree(x, y, z));

        for (int a = 12; a < 16; ++a)
            System.out.println("Greatest divisor of " +
                    a + " is " + greatestDivisor(a));

        for (int m = 11, n = 5; m >= 3; m -= 2, n += 2)
            if (areRelativelyPrime(m, n))
                System.out.println(m + " and " + n +
                        " are relatively prime");

        for (int m = 2; m <= 100; ++m)
            if (isPerfect(m))
                System.out.println(m + " is perfect");

    }
}
