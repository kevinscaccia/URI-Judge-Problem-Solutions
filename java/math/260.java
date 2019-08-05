package uri_resolutions.structures;

import java.io.*;
import java.util.*;

public class Especies_de_madeira_1260 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();// get n
        in.nextLine();in.nextLine();// proxima linha e pula uma
        Map<String, Integer> map;
        for (int i = 0; i < n; i++) {// each test case
            map = new TreeMap<>();
            int total_especies = 0;
            String name;
            while(in.hasNextLine() && !(name = in.nextLine()).isEmpty()){
                total_especies++;
                if(map.containsKey(name))// increment
                    map.put(name, map.get(name)+1);
                else
                    map.put(name, 1);
            }
            for(String str : map.keySet())
                System.out.printf("%s %.4f\n", str, (map.get(str)/(float)total_especies)*100.0);
            if(i != (n-1))
                System.out.println();
        }
    }
}