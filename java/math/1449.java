package structures;

import java.util.*;

public class Jaspion_1449 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();in.nextLine();
        Map<String, String> dictionary;
        for(int i =0; i < n; i++){// Test cases
            int words = in.nextInt();
            int phrase_lines = in.nextInt();in.nextLine();
            dictionary = new HashMap<>();
            // Get Dictionary
            for(int j = 0; j < words; j++){
                String word = in.next();in.nextLine();
                String translation = in.nextLine();
                dictionary.put(word, translation);
            }
            // Get Phrases
            for(int j = 0; j < phrase_lines; j++){
                String phrase = in.nextLine();
                String[] word_array = phrase.split(" ");
                // Print
                for(int s=0; s < word_array.length; s++){
                    if(dictionary.containsKey(word_array[s]))
                        System.out.print(dictionary.get(word_array[s]));
                    else
                        System.out.print(word_array[s]);
                    //
                    if(s != word_array.length-1)
                        System.out.print(" ");
                }
                System.out.println();
            }
            System.out.println();

        }


    }
}

