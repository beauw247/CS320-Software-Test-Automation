package contactService.Mod3;

import java.util.HashMap;
import java.util.Map;

public class ContactService {

    private Map<String, Contact> contacts = new HashMap<>();

    public void addContact(Contact contact) {
        if (contact == null) {
            throw new IllegalArgumentException("Contact cannot be null");
        }

        if (contacts.containsKey(contact.getContactId())) {
            throw new IllegalArgumentException("Duplicate contact ID");
        }

        contacts.put(contact.getContactId(), contact);
    }

    public void deleteContact(String contactId) {
        if (contactId == null || !contacts.containsKey(contactId)) {
            throw new IllegalArgumentException("Contact not found");
        }

        contacts.remove(contactId);
    }

    public void updateFirstName(String contactId, String firstName) {
        Contact contact = findContact(contactId);
        contact.setFirstName(firstName);
    }

    public void updateLastName(String contactId, String lastName) {
        Contact contact = findContact(contactId);
        contact.setLastName(lastName);
    }

    public void updatePhone(String contactId, String phone) {
        Contact contact = findContact(contactId);
        contact.setPhone(phone);
    }

    public void updateAddress(String contactId, String address) {
        Contact contact = findContact(contactId);
        contact.setAddress(address);
    }

    public Contact getContact(String contactId) {
        return findContact(contactId);
    }

    private Contact findContact(String contactId) {
        if (contactId == null || !contacts.containsKey(contactId)) {
            throw new IllegalArgumentException("Contact not found");
        }

        return contacts.get(contactId);
    }
}