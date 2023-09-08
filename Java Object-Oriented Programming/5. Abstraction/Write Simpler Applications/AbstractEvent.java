import java.sql.Timestamp;

public abstract class AbstractEvent implements Event {
    protected Long createdTimestamp;
    protected String id;

    public AbstractEvent(String id) {
        this.createdTimestamp = new Timestamp(System.currentTimeMillis()).getTime();
    }

    public Long getTimeStamp() {
        return this.createdTimestamp;
    }
}
