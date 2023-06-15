import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
//        System.out.println(getSumm(a, b));
//        System.out.println(getSub(a, b));
//        System.out.println(getMul(a, b));
//        System.out.println(getDiv(a, b));
//        System.out.println(cube(a));





    }


//    2nd task Overloading
    public static int getSum(int a) {
        return a;
    }
    public static int getSum(int a, int c) {
        return a + c;
    }
    public static float getSum(float a, float c, float d) {
        return a + c + d;
    }
    public static long getSum() {
        return 3L;
    }
    public static int[] getSum(int ...x) {
        int [] xz = new int [x.length];
        for (int i=0; i < x.length; i++) {
            xz[i] = x[i];
        }
        return xz;
    }
    private final int getSum(int a, int g, int l) {
        return (a - g) * l;
    }
    protected final String getSum(String name) {
        return "Test";
    }
    public static boolean getSum(double number) {
        return number > 3.14;
    }
    // 3rd task
    public static double cube (double a) {
        return a * a * a;
    }
    // 4th task
    public static double getSumm (double a, double b) {
        return a + b;
    }
    public static double getSub (double a, double b) {
        return a - b;
    }
    public static double getMul (double a, double b) {
        return a * b;
    }
    public static double getDiv (double a, double b) {
        return a / b;
    }


}
