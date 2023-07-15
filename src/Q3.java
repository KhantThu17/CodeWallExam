import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("please ender length of array: ");
        int arr1 = scan.nextInt();

        int numarray[] = new int[arr1];
        for (int i = 0; i < numarray.length; i++) {
            Scanner scan1 = new Scanner(System.in);
            System.out.print("Ender number: ");
            numarray[i] = scan1.nextInt();

        }
    }
}
