package matrix;

import java.util.Scanner;

public class MatrizQuadrada_1557 {
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
        int value = 1;
        //
        int line = 1;
        for(int i = 0; i < order; i++){
            m[i][0]= line;
            int col = line;
            for(int j = 1; j < order; j++) {
                m[i][j] = col = col*2;
            }
            line *= 2;
        }
        // Most right/botton number
        int max_number = m[order-1][order-1];
        int digits = Integer.toString(max_number).length();
        // Print Matrix
        print(m, digits);
    }
    static void print(int[][] m, int digits){
        int order = m.length;
        // Print matrix
        for(int i = 0; i < order; i++){
            for(int j = 0; j < order; j++) {
                if(j == (order-1))
                    System.out.printf("%"+digits+"d",m[i][j]);
                else
                    System.out.printf("%"+digits+"d ",m[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}

