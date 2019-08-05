package matrix;

import java.util.*;

public class MatrizQuadrada_1478 {
    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while(n > 0){
            print_matrix(n);
            n = in.nextInt();
        }
    }
    static void print_matrix(int order){
        int m[][] = new int[order][order];
        //
        for(int i = 0; i < order; i++){
            // center [i][i]
            m[i][i] = 1;
            for(int j = i, value = 1; j < order; j++, value++){
                // -->
                m[i][j] = value;
                m[j][i] = value;
            }
        }
        // Print matrix
        for(int i = 0; i < order; i++){
            for(int j = 0; j < order; j++) {
                if(j == (order-1))
                    System.out.printf("%3d",m[i][j]);
                else
                    System.out.printf("%3d ",m[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

}
