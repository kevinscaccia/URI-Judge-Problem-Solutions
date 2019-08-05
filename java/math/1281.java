package uri_resolutions.structures;

import java.util.*;

public class IdaAFeira_1281 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Float> tabela;
        for(int i =0; i < n; i++){
            int prod = in.nextInt();
            tabela = new HashMap<>(prod);
            for(int i2 = 0; i2 < prod; i2++) {
                String nome = in.next();
                float preco = in.nextFloat();
                tabela.put(nome, preco);
            }
            int qtd_frutas = in.nextInt();
            float total_gasto = 0;
            for(int i3=0; i3 < qtd_frutas; i3++){
                String nome = in.next();
                int qtd = in.nextInt();
                total_gasto += (qtd*tabela.get(nome));
            }
            System.out.printf("R$ %.2f\n",total_gasto);

        }

    }
}