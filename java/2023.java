import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>(500);
        while(in.hasNextLine()){
            list.add(in.nextLine());
        }
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                return -s.toLowerCase().compareTo(t1.toLowerCase());
            }
        });
        System.out.println(list.get(0));
    }
}