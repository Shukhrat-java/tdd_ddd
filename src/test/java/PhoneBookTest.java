import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PhoneBookTest {
    @Test
    public void testAdd() {
        PhoneBook phoneBook = new PhoneBook();
        assertEquals(1, phoneBook.add("Alice", "123"));
        assertEquals(2, phoneBook.add("Bob", "456"));
        assertEquals(2, phoneBook.add("Alice", "789"));
    }
}
