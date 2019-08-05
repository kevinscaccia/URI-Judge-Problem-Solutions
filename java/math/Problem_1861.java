package structures;

import java.util.*;
public class Problem_1861 {
    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(System.in);
        Map<String, Integer> killers = new TreeMap<>(), murders = new HashMap<>();
        while(in.hasNext()){
            String killer = in.next();
            String murdered = in.next();
            if(killers.containsKey(killer))// One more murder
                killers.put(killer, killers.get(killer)+1);
            else
                killers.put(killer, 1);// First murder
            murders.put(murdered, 0);
        }

        System.out.println("HALL OF MURDERERS");
        for(String killer : killers.keySet())
            if(!murders.containsKey(killer))// Verify if a killer hasn't murdered
                System.out.println(killer+" "+killers.get(killer));
    }
}
