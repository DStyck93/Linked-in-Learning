public class Main {

    public static void main(String[] args) {
        
        Contact c1 = new Contact("Dakota", 1234567890L, "Dakota@gamil.com");
        Contact c2 = new Contact("Harley", "Harley@gmail.com");
        Contact c3 = new Contact("Stacie", 9876543210L);

        Phone phone = new Phone();
        phone.addContact(c1);
        phone.addContact(c2);
        phone.addContact(c3);

        for(Contact c : phone.getContacts()) {
            System.out.println(c.toString());
        }
    }
}