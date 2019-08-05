package structures;

import java.io.FileReader;
import java.io.Reader;
import java.util.*;

public class Camisetas_1258 {
    public static void main(String[] args) throws Exception {
        //Reader file = new FileReader("in.txt");
        Scanner in = new Scanner(System.in);

        List<Record> list;
        int n = in.nextInt();
        while(n != 0){
            in.nextLine();
            list = new ArrayList<>(n);
            for(int i = 0; i < n; i++){
                String name = in.nextLine();
                String color = in.next();
                char size = in.next().charAt(0);
                in.nextLine();
                list.add(new Record(color, name, size));
            }
            Collections.sort(list, new Comparator<Record>() {
                @Override
                public int compare(Record record, Record t1) {
                    return record.name.compareTo(t1.name);
                }
            });
            Collections.sort(list, new Comparator<Record>() {
                @Override
                public int compare(Record record, Record t1) {
                    return t1.size - record.size;
                }
            });
            Collections.sort(list, new Comparator<Record>() {
                @Override
                public int compare(Record record, Record t1) {
                    return record.color.compareTo(t1.color);
                }
            });
            //
            Iterator<Record> it = list.iterator();
            while(it.hasNext()){
                it.next().print();
            }
            n = in.nextInt();
            if(n != 0)
                System.out.println();
        }
    }

    static class Record{
        String color, name;
        char size;
        Record(String color, String name, char size){
            this.name = name;
            this.color = color;
            this.size  =size;
        }
        void print(){
            System.out.println(color+" "+size+" "+name);
        }
    }
}
