import Lvl2_AbstractFactory.Contact;
import Lvl2_AbstractFactory.factories.SpainContactFactory;
import Lvl2_AbstractFactory.factories.USAContactFactory;
import Lvl2_AbstractFactory.interfaces.ContactFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ContactFactoryTest {

    @Test
    void testSpainContactFormatting() {

        ContactFactory spainFactory = new SpainContactFactory(
                "Carrer Major 34", "Barcelona", "08001", "123456789"
        );
        Contact contact = new Contact(spainFactory);

        String expected = "Address: Carrer Major 34, 08001 Barcelona | Phone: +34 123456789";

        assertEquals(expected, contact.toString(), "El formato de España debería coincidir exactamente");
    }

    @Test
    void testUSAContactFormatting() {

        ContactFactory usaFactory = new USAContactFactory(
                "154 5th Avenue", "New York", "NY 10001", "987654321"
        );
        Contact contact = new Contact(usaFactory);

        String expected = "Address: 154 5th Avenue, New York, NY 10001 | Phone: +1 987654321";

        assertEquals(expected, contact.toString(), "El formato de USA debería coincidir exactamente");
    }
}