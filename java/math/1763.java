package structures;

import java.io.FileReader;
import java.util.*;

public class Natal_1763 {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(new FileReader("in.txt"));

        String[] countries = {"brasil", "alemanha", "austria", "coreia", "espanha",
                "grecia", "estados-unidos", "inglaterra", "australia", "portugal",
                "suecia", "turquia", "argentina", "chile", "mexico", "antardida",
                "canada", "irlanda", "belgica", "italia", "libia", "siria",
                "marrocos", "japao"};
        String[] christimas = {"Feliz Natal!", "Frohliche Weihnachten!", "Frohe Weihnacht!", "Chuk Sung Tan!", "Feliz Navidad!",
                "Kala Christougena!", "Merry Christmas!", "Merry Christmas!", "Merry Christmas!", "Feliz Natal!",
                "God Jul!", "Mutlu Noeller", "Feliz Navidad!", "Feliz Navidad!", "Feliz Navidad!", "Merry Christmas!",
                "Merry Christmas!", "Nollaig Shona Dhuit!", "Zalig Kerstfeest!", "Buon Natale!", "Buon Natale!", "Milad Mubarak!",
                "Milad Mubarak!", "Merii Kurisumasu!"};
        //
        Map<String, String> dictionary = new HashMap<>(countries.length);
        for (int i = 0; i < countries.length; i++)
            dictionary.put(countries[i], christimas[i]);
        //
        while (in.hasNext()) {
            String country = in.nextLine();
            if (dictionary.containsKey(country))
                System.out.println(dictionary.get(country));
            else
                System.out.println("--- NOT FOUND ---");
        }
    }
}
