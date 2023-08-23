import org.json.simple.JSONArray;

import org.json.simple.JSONObject;

import org.json.simple.parser.*;
import org.json.simple.JsonObject;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JsonParser {
    public JsonStruct parse() throws FileNotFoundException {
        JSONParser parser = new JSONParser();
        JsonStruct jsonStruct = new JsonStruct();
        try (FileReader reader = new FileReader("src/files/tickets.json")) {


            Object o = new JSONParser().parse(reader);
            JSONObject object = (JSONObject) o;

            JSONArray ticketsArray = (JSONArray) object.get("tickets");
            List<Ticket> ticketList = new ArrayList<>();
            for (Object ticket : ticketsArray) {
                JSONObject listObject = (JSONObject) ticket;
                String origin = (String) listObject.get("origin");
                String origin_name = (String) listObject.get("origin_name");
                String destination = (String) listObject.get("destination");
                String destination_name = (String) listObject.get("destination_name");
                String departure_date = (String) listObject.get("departure_date");
                String departure_time = (String) listObject.get("departure_time");
                String arrival_date = (String) listObject.get("arrival_date");
                String arrival_time = (String) listObject.get("arrival_time");
                String carrier = (String) listObject.get("carrier");
                long stops = (long) listObject.get("stops");
                long price = (long) listObject.get("price");
                Ticket mainTicket = new Ticket(origin, origin_name, destination, destination_name, departure_date,
                        departure_time, arrival_date, arrival_time, carrier, stops, price);
                ticketList.add(mainTicket);

            }
            jsonStruct.setList(ticketList);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return jsonStruct;
    }
}