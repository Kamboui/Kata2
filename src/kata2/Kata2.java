package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {
    public static void main(String[] args) {
        // TODO code application logic here
        int[] data = {4,5,6,2,3,5,4,6,2,3,5,4,6,6,6};
        Histogram histo = new Histogram(data);
        Map<Integer,Integer> histogr = histo.getHistogram();
        System.out.println("\nContenido del mapa (Clave ==> Valor)");
        for (Map.Entry<Integer, Integer> entry : histogr.entrySet()) {
            System.out.println( entry.getKey() + " ===> " + entry.getValue());
        } 
    }
    
}
