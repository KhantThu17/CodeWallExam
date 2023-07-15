import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please Ender Number: ");
        int number1 = scan.nextInt();

        Scanner scan2 = new Scanner(System.in);
        System.out.print("Please Ender Opt: ");
        String opt = scan2.next();

        Scanner scan3 = new Scanner(System.in);
        System.out.print("Please Ender Number: ");
        int number2 = scan3.nextInt();

        int Result;
        if (opt.equals("+")) {
            Result = number1 + number2;
            System.out.print("Your Answer is= "+Result);
        } else if (opt.equals("-")) {
            Result = number1 - number2;
            System.out.print("You are Answer is= "+Result);
        } else if (opt.equals("*")) {
            Result = number1 * number2;
            System.out.print("You are Answer is= "+Result);
        } else if (opt.equals("/")) {
            Result = number1 / number2;
            System.out.print("You are Answer is= "+Result);
        } else if (opt.equals("%")) {
            Result = number1 % number2;
            System.out.print("You are answer is= "+Result);
        } else {
            System.out.println("out of line");
        }
    }
}
