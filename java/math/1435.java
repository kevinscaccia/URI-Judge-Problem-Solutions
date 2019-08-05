package matrix;

import java.util.*;

public class MatrizQuadrada_1435 {
    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while(n > 0){
            calc_matrix(n);
            n = in.nextInt();
        }
    }
    static void calc_matrix(int order){
        int m[][] = new int[order][order];
        int limite = 0;
        int value = 1;
        //
        while(limite < (int) Math.ceil(order/2.0)){// Total Division range of matrix
            for(int i = limite; i < (order-limite); i++){// for each row of new matrix limits
                for(int j = limite; j < (order-limite); j++) {//for each col
                    m[i][j] = value;// Change Value
                }
            }
            value++;
            limite++;// Resize the next matrix range
        }
        print(m);
    }
    static void print(int[][] m){
        int order = m.length;
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
