import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Output {
    public void printlnTime (Map<String,Integer> map) {
        Set<String> setKeys = map.keySet();
        Iterator<String> iterator = setKeys.iterator();
        while (iterator.hasNext()) {
            String company = iterator.next();
            System.out.println("Минимальное время для компании " + company + " = " +( map.get(company)/60 +
                    7) + " часов "+map.get(company)%60+ " минут " );
        }
    }
    public void printlnMedianAndAverageValue (int value, int median){
        System.out.println("Среднее значение цены: " + value + "\nЗначение медианы: " + median
                + "\nРазница между средним значением и медианой: " + Math.abs(value-median));
    }
}
