import java.util.*;

/**
 * Created by Fiber on 20.05.14.
 */
final public class Event {

    private UUID id;
    private String title;
    private List<String> attendees;
    private Date start;
    private Date finish;
    private String location;

    private Event (EventBuilder builder) {
        id = UUID.randomUUID();
        title = builder.title;
        attendees = builder.attendees;
        start = builder.start;
        finish = builder.finish;
        location = builder.location;
    }

    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    final public List<String> getAttendees() {
        return new ArrayList<String>(attendees);
    }

    @Override
    public String toString() {
        return ("Event title is : " + getTitle() + ", UUID: " + getId());
    }

    public static class EventBuilder {
        private String title;
        private List<String> attendees;
        private Date start;
        private Date finish;
        private String location;

        public EventBuilder() {

        }

        public EventBuilder setAttendees(String...attendees) {
            this.attendees = new ArrayList<String>(Arrays.asList(attendees));
            return this;
        }

        public EventBuilder setTitle(String title) {
            this.title = title;
            return this;
        }


        public EventBuilder setStartDate(Date startDate) {
            this.start = startDate;
            return this;
        }

        public EventBuilder setFinishDate(Date finishDate) {
            this.finish = finishDate;
            return this;
        }

        public EventBuilder setLocation(String location) {
            this.location = location;
            return this;
        }


        public Event build() {
            return new Event(this);
        }
    }
}
