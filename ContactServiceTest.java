package contactService.Mod3;

import org.junit.Test;
import static org.junit.Assert.*;

public class ContactServiceTest {

    @Test
    public void testAddAndGet() {
        ContactService s = new ContactService();

        Contact c = new Contact("24770", "Beau", "Welchel", "5122775242", "504 Fern St");

        s.addContact(c);

        assertEquals(c, s.getContact("24770"));
    }

    @Test
    public void testUpdate() {
        ContactService s = new ContactService();

        Contact c = new Contact("24770", "Beau", "Welchel", "5122775242", "504 Fern St");

        s.addContact(c);

        s.updateFirstName("24770", "NewName");

        assertEquals("NewName", s.getContact("24770").getFirstName());
    }

    @Test
    public void testDelete() {
        ContactService s = new ContactService();

        Contact c = new Contact("24770", "Beau", "Welchel", "5122775242", "504 Fern St");

        s.addContact(c);
        s.deleteContact("24770");

        try {
            s.getContact("24770");
            fail();
        } catch (IllegalArgumentException e) {
            assertTrue(true);
        }
    }
}