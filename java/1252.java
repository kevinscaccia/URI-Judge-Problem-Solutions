package sort;

import java.util.*;

public class Sort_1252 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();

        while( n != 0 && m != 0){
            List<Integer> list = new ArrayList<>(n);
            // Populate List
            for(int i = 0; i < n; i++){
                list.add(in.nextInt());
                in.nextLine();
            }
            final int mod = m;
            // Order
            list.sort((a, b) -> {
                int dif = (a % mod) - (b % mod);
                if(dif == 0){// Same module
                    if( (a%2==0 && b%2==0) || (a%2!=0 && b%2!=0) )
                        if(a%2 ==0)// both even
                            return a-b;
                        else
                            return b-a;
                    else{// odd in first(<)
                        if( a%2 == 0) return 1;
                        else return -1;
                    }

                }
                return dif;
            });
            // Print result
            System.out.println(n+" "+m);
            list.forEach(e -> System.out.println(e));
            //
            n = in.nextInt();
            m = in.nextInt();
        }
        System.out.println("0 0");
    }
}
