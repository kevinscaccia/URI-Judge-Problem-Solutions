package uri_resolutions.strings;
import java.io.StreamTokenizer;
import java.util.Scanner;

public class Criptografia {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int i = 0;
        while(in.hasNextLine() && i <= n) {
            String str = in.nextLine();
            if(str.length() > 0)
                System.out.println(encodeString(str));
            i++;
        }
    }
    static String encodeString(String str){
        char[] char_array_aux = new char[str.length()];
        char c;
        // Primeira codificação
        for(int i =0; i < str.length(); i++){
            c = str.charAt(i);
            if(Character.isAlphabetic(c))
                char_array_aux[i] = (char) (c + 3);
            else
                char_array_aux[i] = c;
        }
        //System.out.println(char_array_aux);
        // Segunda codificação (revertendo um array)
        for(int i =0; i < char_array_aux.length/2; i++){
            char aux = char_array_aux[i];
            char_array_aux[i] = char_array_aux[char_array_aux.length-i-1];
            char_array_aux[char_array_aux.length-i-1] = aux;
        }
        //System.out.println(char_array_aux);
        // Terceira codificação
        for(int i =char_array_aux.length/2; i < char_array_aux.length; i++){
            char_array_aux[i] = (char) (char_array_aux[i] - 1);
        }
        //System.out.println(char_array_aux);
        return new String(char_array_aux);
    }
}
