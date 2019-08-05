package structures;

import java.util.*;

public class Problem_2729 {
    public static void main(String[] args) throws Exception{
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();in.nextLine();
        Set<String> set;
        for(int i = 0; i< n; i++) {
            set = new TreeSet<>();// Ordered Set
            for(String str : in.nextLine().split(" "))
                set.add(str);

            Iterator<String> it = set.iterator();
            StringBuilder builder = new StringBuilder();
            while(it.hasNext())
                builder.append(it.next()+" ");
            System.out.println(builder.toString().trim());
        }

    }
}
