import java.util.ArrayList;

public class Phonebook {
    private ArrayList <Contact> contacts = new ArrayList<>();

    public void addContact(Contact contact) {
        contacts.add(contact);
        sort();
    }

    private void sort() {
        for (int i = 1; i < contacts.size(); i++) {
            Contact current = contacts.get(i);
            int j = i - 1;
            while (j >= 0 && contacts.get(j).getName().compareTo(current.getName()) > 0) {
                contacts.set(j + 1, contacts.get(j));
                j--;
            }
            contacts.set(j + 1, current);
        }
    }

    public void printPhonebook() {
        for (Contact contact : contacts) {
            System.out.println(contact.getName());
        }
    }
}