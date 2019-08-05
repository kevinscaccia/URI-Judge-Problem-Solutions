import java.io.IOException;
import java.util.Scanner;
public class DecriptaCifraCesar {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();// Distancia deslocada
        for(int i =0; i < n; i++) {
            String str = in.next();
            int d = in.nextInt();
            String result = "";
            for (int j = 0; j < str.length(); j++) {
                int pos = (int) str.charAt(j);
                if ((pos - d) < (int) 'A') {// Caso for proximo ao inicio
                    int dif = pos - (int) 'A';
                    result += (char) ((int) 'Z' - (d-dif-1));
                } else
                    result += (char) (pos - d);
            }
            System.out.println(result);// resultado
        }
    }

}