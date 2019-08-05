import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        int j = in.nextInt();
        // preta (i par e j impar  ou  i impar e j par)
        if((i % 2 == 0) && (j % 2 != 0) || (i % 2 != 0) && (j % 2 == 0))
            System.out.println("0");
        else
            System.out.println("1");
    }
}