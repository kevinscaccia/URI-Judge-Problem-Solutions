package uri_resolutions.strings;
import java.util.Scanner;
public class ArrayHash {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();// A = 65
        int count;
        for(int i=0; i < n; i++){// Caso de teste
            int n2 = in.nextInt();
            int hash_result = 0;
            for(int j =0; j < n2; j++){// String para Hash
                String str = in.next();
                char c;
                for(int pos = 0; pos < str.length(); pos++){
                    c = str.charAt(pos);
                    hash_result += ((int) c) - 65;
                    hash_result += pos;
                    hash_result += j;
                }
            }
            System.out.println(hash_result);
        }


    }
}
