package uri_resolutions.math;

import java.util.Scanner;

public class VoltaAFaculdade {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double graos;
        while(in.hasNext()){
            int qtd = Integer.parseInt(in.next());
            graos = 1;
            for(int j = 0; j < qtd; j++)
                graos *= 2;
            //System.out.println(graos);
            graos = graos/(12*1000);

            System.out.println((long)graos+" kg");
        }
    }
}