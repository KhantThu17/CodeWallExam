import java.util.Arrays;

public class Q4 {
    public static void main(String[] args) {
        int input[]= new int[7];
        input[0]=1;input[1]=2;
        input[2]=3;input[3]=4;input[4]=5;
        input[5]=6;input[6]=7;
        System.out.println(Arrays.toString(input));
        input[0]=2;input[1]=4;
        input[2]=6;input[3]=8;
        input[4]=10;input[5]=12;
        input[6]=14;
        System.out.println("Output="+Arrays.toString(input));
    }
}
