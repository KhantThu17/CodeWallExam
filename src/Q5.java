public class Q5 {
    public static void main(String[] args) {
        int Out[][] = {
                {1, 2, 3, 4, 5},
                {5, 4, 3, 2, 1},
                {7, 8, 9, 1, 5, 7, 7}
        };
        for (int[] number : Out) {
            System.out.println();
            for (int i : number) {
                System.out.print(i + " ");
            }
        }
    }
}
