package uri_resolutions.strings;
import java.util.Scanner;
public class Led {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n;
        n = in.nextInt();
        int count;
        for(int i=0; i <n; i++){
            String number = in.next();
            count = 0;
            for(char c : number.toCharArray())
                count += getRepresentation(c);
            System.out.println(count+" leds");
        }
    }
    static int getRepresentation(char c){
        switch(c){
            case '0':
                return 6;
            case '1':
                return 2;
            case '2':
                return 5;
            case '3':
                return 5;
            case '4':
                return 4;
            case '5':
                return 5;
            case '6':
                return 6;
            case '7':
                return 3;
            case '8':
                return 7;
            case '9':
                return 6;
        }
        return 0;
    }
}
