package uri_resolutions.math;

import java.util.Scanner;
public class GuardaCosteira {
    static int calls = 0;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++) {
            String token = in.next();
            int token_value = calcula_token(token);
            if (token.length() == 5)
                System.out.println("3");
            else if (Math.abs(token_value - calcula_token("one")) > Math.abs(token_value - calcula_token("two")))
                System.out.println("2");
            else
                System.out.println("1");
        }
    }

    static int calcula_token(String token) {
        int token_value = 0, i = 0;
        for (char c : token.toCharArray()) {
            switch (c) {
                case 'o':
                    token_value += 1 * i;
                    break;
                case 'n':
                    token_value += 2 * i;
                    break;
                case 'e':
                    token_value += 3 * i;
                    break;
                case 't':
                    token_value += 4 * i;
                    break;
                case 'w':
                    token_value += 5 * i;
                    break;
                default:
                    break;
            }
            i++;
        }
        return token_value;
    }
}
