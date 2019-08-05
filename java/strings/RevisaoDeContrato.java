package uri_resolutions.strings;
import java.util.Scanner;

public class RevisaoDeContrato {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        char match = in.next().charAt(0);
        String str = in.next();

        while(match != '0' && !str.equals("0")) {

            char[] char_array_aux = new char[str.length()];// Char Array Auxiliar
            int i = 0;
            for(char c : str.toCharArray()) {
                if (c != match)
                    char_array_aux[i++] = c;// Adiciona size elementos
            }
            int size = i;
            // 'Detecta zeros a esquerda
            i = 0;
            while(char_array_aux[i] == '0'){
                i++;
            }// Printa a partir dai
            if(i == size)// Vazio
                System.out.println("0");
            else {
                for (; i < size; i++)
                    System.out.print(char_array_aux[i]);// Printa os numeros
                System.out.println();
            }
            match = in.next().charAt(0);
            str = in.next();
        }
    }
}
