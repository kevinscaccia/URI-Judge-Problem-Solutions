package uri_resolutions.strings;

import java.io.*;
import java.util.*;

public class ConcatenaAlternado_1238 {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String a = in.next();
            String b = in.next();
            String result;
            result = concatena(a,b);
            System.out.println(result);
        }
    }
    static String concatena(String a, String b){
        // a > b
        char[] result= new char[a.length()+b.length()];
        char[] ca = a.toCharArray();
        char[] cb = b.toCharArray();
        int j =0;// result char index
        boolean a_max = (ca.length > cb.length) ? true : false;
        // if a > b , move b to result
        for(int i = 0; i < (a_max ? cb.length : ca.length); i++){// copy <
            result[j] = ca[i];
            result[j+1] = cb[i];
            j+=2;
        }
        //System.out.println("result index:"+j);
        // Copy the remainder of string
        for(int i = (a_max ? cb.length : ca.length); i < (a_max ? ca.length : cb.length); i++) {
            result[j++] = (a_max ? ca[i] : cb[i]);
        }
        return new String(result);
    }
}