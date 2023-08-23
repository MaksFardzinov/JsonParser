public class Ticket {
    private String origin;
    private String origin_name;
    private String destination;
    private String destination_name;
    private String departure_date;
    private String departure_time;
    private String arrival_date;
    private String arrival_time;
    private String carrier ;
    private long stops;
    private long price;
    public Ticket(String origin,String origin_name,String destination,String destination_name,String departure_date,
                  String departure_time,String arrival_date,String arrival_time,String carrier,long stops,long price){
        this.origin = origin;
        this.arrival_date = arrival_date;
        this.arrival_time = arrival_time;
        this.departure_time = departure_time;
        this.carrier = carrier;
        this.departure_date = departure_date;
        this.destination_name = destination_name;
        this.origin_name = origin_name;
        this.destination = destination;
        this.stops = stops;
        this.price = price;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public String getArrival_date() {
        return arrival_date;
    }

    public String getCarrier() {
        return carrier;
    }

    public String getDeparture_time() {
        return departure_time;
    }

    public String getOrigin_name() {
        return origin_name;
    }

    public String getDestination_name() {
        return destination_name;
    }

    public long getStops() {
        return stops;
    }

    public String getDeparture_date() {
        return departure_date;
    }

    public String getArrival_time() {
        return arrival_time;
    }

    public long getPrice() {
        return price;
    }
}
