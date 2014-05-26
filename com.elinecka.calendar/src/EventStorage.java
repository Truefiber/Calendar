import java.util.*;

/**
 * Created by Fiber on 20.05.14.
 */
public class EventStorage {
    private  Map<UUID, Event> storage;

    public EventStorage() {
        storage = new HashMap<UUID, Event>();
        System.out.println("Event storage initiated");
    }

    public void add(Event event) {
        storage.put(event.getId(), event);
    }

    public List<Event> searchByTitle(String title) {
        List<UUID> listUUID = new ArrayList<UUID>(storage.keySet());
        List<Event> result = new ArrayList<Event>();
        for (UUID i : listUUID) {
            String eventTitle = storage.get(i).getTitle();
            if (eventTitle.contains(title)) {
                result.add(storage.get(i));
            }
        }

        return result;
    }
    
    public List<Event> searchByAttendee(String searchAttendee) {
        List<UUID> listUUID = new ArrayList<UUID>(storage.keySet());
        List<Event> result = new ArrayList<Event>();
        for (UUID i : listUUID) {
            List<String> resultAttendee = storage.get(i).getAttendees();
            if (resultAttendee.contains(searchAttendee)) {
                result.add(storage.get(i));
            }
        }

        return result;
    }


}
