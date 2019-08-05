package uri_resolutions.strings;

import java.io.*;
import java.util.*;

public class Judge_1367 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int n;
        Map<Character, Integer> correct_map, incorrect_map;
        while ((n = in.nextInt()) != 0) {
            // Incorrect submissions count map
            incorrect_map = new HashMap<>();
            // correct submissions time count map
            correct_map = new HashMap<>();
            for (int i = 0; i < n; i++) {
                char id = in.next().charAt(0);
                int time = in.nextInt();
                boolean correct = in.next().charAt(0) == 'c';
                // Insert in map
                if(correct){
                    correct_map.put(id, time);
                }else{
                    if(incorrect_map.containsKey(id))// already in map
                        incorrect_map.put(id, incorrect_map.get(id)+1);
                    else// not in mapincorrect_map
                        incorrect_map.put(id, 1);
                }
            }
            // Counting time
            int final_time = 0;
            int correct = correct_map.size();
            for(char c : correct_map.keySet()){
                // initial correct submission time
                int aux_time = correct_map.get(c);
                //System.out.print("Problem "+c+" time:"+correct_map.get(c));
                // count each incorrect subExemplo de Entrada	Exemplo de Saída
                if(incorrect_map.get(c) != null)
                    aux_time += 20 * incorrect_map.get(c);
                //System.out.println(" with "+incorrect_map.get(c)+" submissions");
                final_time += aux_time;
            }
            System.out.println(correct+" "+final_time);
        }

    }
}