package uri_resolutions.structures;

import java.util.Scanner;

public class TDARacional_1022 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int j = 0; j < n; j++) {
            int N1 = input.nextInt();
            input.next();
            int D1 = input.nextInt();
            char operacao = input.next().charAt(0);
            int N2 = input.nextInt();
            input.next();
            int D2 = input.nextInt();

            int N3 = 0;
            int D3 = 1;
            switch (operacao) {
                case '+':
                    N3 = (N1 * D2 + N2 * D1);
                    D3 = (D1 * D2);
                    break;
                case '-':
                    N3 = (N1 * D2 - N2 * D1);
                    D3 = (D1 * D2);
                    break;
                case '/':
                    N3 = (N1 * D2);
                    D3 = (N2 * D1);
                    break;
                case '*':
                    N3 = (N1 * N2);
                    D3 = (D1 * D2);
                    break;
            }
            int d3 = D3;
            int n3 = N3;
            int max = Math.max(N3, D3);
            boolean irredutivel = false;
            while(!irredutivel) {
                irredutivel = true;
                for (int i = (max - 1); i > 1; i--) {
                    if ((N3 % i == 0) && (D3 % i == 0)) {// se for divisor do numerador e do denominador, divide
                        N3 = N3 / i;
                        D3 = D3 / i;
                        irredutivel = false;
                    }
                }
            }
            System.out.println(n3 + "/" + d3+" = "+N3 + "/" + D3);

        }
    }
}
