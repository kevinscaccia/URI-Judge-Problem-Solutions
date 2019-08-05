package uri_resolutions.structures;

import java.io.*;
import java.util.*;

public class Composicao_de_Jingles_1430 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        String str;
        Map<Character, Float> map = new HashMap<>();
        map.put('W', 1F);
        map.put('H', 1/2F);
        map.put('Q', 1/4F);
        map.put('E', 1/8F);
        map.put('S', 1/16F);
        map.put('T', 1/32F);
        map.put('X', 1/64F);
        while (in.hasNextLine() && !(str = in.nextLine()).equals("*")) {
            float count_compasso = 0;
            int compassos_corretos = 0;
            for(int i =1; i < str.length(); i++){
                char c = str.charAt(i);
                if(c == '/'){// fim do compasso
                    if(count_compasso == 1F)// Correto
                        compassos_corretos++;
                    count_compasso = 0;
                }else
                    count_compasso += map.get(c);
            }
            System.out.println(compassos_corretos);
        }

    }
}