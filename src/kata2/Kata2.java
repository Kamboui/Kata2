package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {
    public static void main(String[] args) {
        // TODO code application logic here
        String[] data = {"salmon", "papas", "aguacate", "papas", "microondas", "salmon", "aguacate", "aguacate", "salmon"};
        Histogram histo = new Histogram(data);
        Map<String,Integer> histogr = histo.getHistogram();
        System.out.println("\nContenido del mapa (Clave ==> Valor)");
        for (Map.Entry<String, Integer> entry : histogr.entrySet()) {
            System.out.println( entry.getKey() + " ===> " + entry.getValue());
        } 
    }
    
}
