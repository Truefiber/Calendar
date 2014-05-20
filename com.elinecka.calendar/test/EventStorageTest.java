import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class EventStorageTest {

    @org.junit.Test
    public void testSearchTitle() throws Exception {
        EventStorage testStorage = new EventStorage();
        String[] attendees = {"testattendee1", "testattendee2"};
        String[] attendees2 = {"testattendee2", "testattendee4"};
        testStorage.add(new Event.EventBuilder().setAttendees(attendees).setTitle("testtitle").build());

        testStorage.add(new Event.EventBuilder().setAttendees(attendees2).setTitle("test2").build());
        List<Event> searchResult = testStorage.searchByTitle("test2");
        List<Event> searchAttendee = testStorage.searchByAttendee("testattendee2");
        assertEquals(1, searchResult.size());
        assertEquals(2, searchAttendee.size());


    }




}