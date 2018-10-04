package kata2;

import java.util.HashMap;
import java.util.Map;

public class Histogram {
    private final int[] data;

    public Histogram(int[] data) {
        this.data = data;
    }

    public int[] getData() {
        return data;
    }
    
    public Map getHistogram(){
        Map<Integer, Integer> histogram = new HashMap<Integer, Integer>();
        for(int i : data){
            try{
                histogram.put(data[i], histogram.get(data[i])+1);
            } catch(Exception e){
                System.out.println("Clave \"" + data[i] + "\" no encontrada.... Añadiendo nueva clave");
                histogram.put(data[i], 1);
            }
        }
        return histogram;
    }
    
}
