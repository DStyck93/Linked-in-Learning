import java.util.ArrayList;

public class Phone {
    private ArrayList<Contact> contacts;

    public Phone() {
        this.contacts = new ArrayList<>();
    }

    public Phone(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }

    public ArrayList<Contact> getContacts() {
        return contacts;
    }

    public void addContact(Contact contact) {
        this.contacts.add(contact);
    }
}
