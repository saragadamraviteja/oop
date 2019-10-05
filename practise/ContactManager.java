public class ContactManager extends Contact{
    contact[] contacts = new Contact[10];
    int count = 0;
    public void addContact(Contact contact) {
        contact[count++] = contact;
    }
    public void setrelation(String user, String relation) {
        for (int i =0; i < count; i++) {
            if (contacts[i].name.equals(user)) {
                for (int j = 0; j < count; )
            }
        }
    }
}