

import com.contactmanager.Contact;
import com.contactmanager.ContactManager;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

public class ContactManagerTest {
    private ContactManager contactManager;

    @BeforeEach
    void setUp() {
        contactManager = new ContactManager();
    }

    //checking the contact adding
    @Test
    void testAddContact_positive() {
        Contact contact = new Contact("Jon", "0490234567");
        contactManager.addContact(contact);
        assertEquals(1, contactManager.displayAllContacts().size());
    }

    //checking the contact searching
    @Test
    void testSearchContact_foundOneMatch() {
        Contact contact = new Contact("Vova", "0490209876");
        contactManager.addContact(contact);
        Contact found = contactManager.searchContact("Vova");
        assertNotNull(found);
        assertEquals("Vova", found.getName());
        assertEquals("0490209876", found.getPhone());
    }

    //checking the not exist contact searching
    @Test
    void testSearchContact_nonExistingContact() {
        Contact contact = new Contact("Vova", "0490209876");
        contactManager.addContact(contact);
        Contact found = contactManager.searchContact("Elizabet");
        assertNull(found);
    }

    //checking the empty contact searching
    @Test
    void testSearchContact_emptyField() {
        Contact contact = new Contact("Janny", "0490209992");
        contactManager.addContact(contact);
        Contact found = contactManager.searchContact("");
        assertNull(found);
    }

    //checking the match printing format
    @Test
    void testToLine() {
        Contact contact = new Contact("Omal", "0490203333");
        String expectingResult = "* Name: Omal\nPhone: 0490203333\n";
        assertEquals(expectingResult, contact.toLine());
    }


}
