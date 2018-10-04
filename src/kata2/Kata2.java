package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {
    public static void main(String[] args) {
        // TODO code application logic here
        int data[] = {4,5,6,2,3,5,4,6,2,3,5,4,6,6,6};
        Map<Integer, Integer> histogram = new HashMap<Integer, Integer>();
        
        for(int i=0; i<data.length;i++){
            try{
                histogram.put(data[i], histogram.get(data[i])+1);
            } catch(Exception e){
                System.out.println("Clave \"" + data[i] + "\" no encontrada.... Añadiendo nueva clave");
                histogram.put(data[i], 1);
            }
        }
        System.out.println("\nContenido del mapa (Clave ==> Valor)");
        for (Map.Entry<Integer, Integer> entry : histogram.entrySet()) {
            System.out.println( entry.getKey() + " ===> " + entry.getValue());
            
        } 
    }
    
}
