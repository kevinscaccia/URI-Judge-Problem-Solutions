import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double n1 = in.nextDouble();
        double n2 = in.nextDouble();
        double n3 = in.nextDouble();
        double media = (n1*2+n2*3+n3*5)/10;
        System.out.format("MEDIA = %.1f\n", media);
    }
}
