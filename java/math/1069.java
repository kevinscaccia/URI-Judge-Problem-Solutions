package uri_resolutions.structures;

import java.util.*;

public class Diamantes_e_areia_1069 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String str;
        for(int i =0; i < n; i++) {
            int diamantes = 0;
            str = in.next();
            Stack<Character> stack = new Stack<>();
            for (char c : str.toCharArray()) {
                if (c == '<')// abre
                    stack.push(c);
                else if (c == '>') {// fecha se possivel
                    if (!stack.isEmpty()) {// tem correspondente '<'
                        stack.pop();
                        diamantes++;
                    }
                }
            }
            System.out.println(diamantes);
        }
    }
}