public class PasswordChangeEvent extends AbstractEvent {

    public PasswordChangeEvent(String id) {
        super(id);
    }

    public void process() {
        System.out.println("Customer " + id + " changed their password. " +
                "Sending a confirmation email to the customer.");
    }
}
