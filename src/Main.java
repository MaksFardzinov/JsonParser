import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        JsonParser parser = new JsonParser();
        Time time = new Time();
        Output output = new Output();
        Price price = new Price();
        JsonStruct tickets = parser.parse();
        List<Ticket> list = tickets.getList();
        Map<String, Integer> solveMap = time.getMinTime(list);
        output.printlnTime(solveMap);
        output.printlnMedianAndAverageValue(price.getAverageValue(list), price.getMedian(list) );
    }

}