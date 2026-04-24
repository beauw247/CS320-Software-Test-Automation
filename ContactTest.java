package contactService.Mod3;

import org.junit.Test;
import static org.junit.Assert.*;

public class ContactTest {

    @Test
    public void testValidContact() {
        Contact c = new Contact("24770", "Beau", "Welchel", "5122775242", "504 Fern St");

        assertEquals("24770", c.getContactId());
        assertEquals("Beau", c.getFirstName());
        assertEquals("Welchel", c.getLastName());
        assertEquals("5122775242", c.getPhone());
        assertEquals("504 Fern St", c.getAddress());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBadPhone() {
        new Contact("1", "A", "B", "123", "addr");
    }
}