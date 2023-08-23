import java.util.*;

public class Price {
    public int getAverageValue(List<Ticket> list) {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            Ticket ticket = list.get(i);
            if (ticket.getOrigin_name().equals("Владивосток") && ticket.getDestination_name().equals("Тель-Авив")) {
                sum = sum + (int) ticket.getPrice();
                count++;
            }

        }
        return sum / count;
    }

    public int getMedian(List<Ticket> list) {
        List<Integer> prices = new LinkedList<>();
        for (int i = 0; i < list.size(); i++) {
            Ticket ticket = list.get(i);
            if (ticket.getOrigin_name().equals("Владивосток") && ticket.getDestination_name().equals("Тель-Авив")) {
                prices.add((int) ticket.getPrice());
            }

        }
        Collections.sort(prices);
        if (prices.size() % 2 == 0) {
            return (prices.get(prices.size() / 2 - 1) + prices.get(prices.size() / 2)) / 2;
        } else {
            return prices.get((1 + prices.size()) / 2);
        }
    }
}
