import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Time {
    public int parse(String time) {
        String [] masTime = time.split(":");
        int minutes = Integer.parseInt(masTime[0])*60+Integer.parseInt(masTime[1]);
        return minutes;
    }
    public int solve(int minutes1, int minutes2, String data1, String data2) {
        String [] masData1 = data1.split("\\.");
        String [] masData2 = data2.split("\\.");
        if (Integer.parseInt(masData1[0]) < Integer.parseInt(masData2[0])) {
            minutes2 = minutes2+1440;
        }
        return minutes2 - minutes1;
    }
    public Map<String,Integer> getMinTime (List<Ticket> list  ) {
        Map<String, Integer> solveMap = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            Ticket ticket = list.get(i);
            if (ticket.getOrigin_name().equals("Владивосток") && ticket.getDestination_name().equals("Тель-Авив")) {
                Time time = new Time();
                int minutes = time.solve(time.parse(ticket.getDeparture_time()), time.parse(ticket.getArrival_time()),
                        ticket.getDeparture_date(), ticket.getArrival_date());

                if (solveMap.containsKey(ticket.getCarrier())) {
                    if (solveMap.get(ticket.getCarrier()) > minutes) {
                        solveMap.put(ticket.getCarrier(), minutes);
                    }
                } else {
                    solveMap.put(ticket.getCarrier(), minutes);
                }
            }



        }
        return solveMap;

    }
}
