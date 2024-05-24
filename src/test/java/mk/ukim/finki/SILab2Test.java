package mk.ukim.finki;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;


public class SILab2Test {

    List<Item> list1 = new ArrayList<>(
            List.of(
                    new Item("Bread", "1234", 30, 0),
                    new Item("Milk", "12", 50, 0.8f),
                    new Item("", null, 60, 0.8f)
            )
    );
    List<Item> list2 = new ArrayList<>(
            List.of(
                    new Item("Bread", "01234", 330, 0.8f),
                    new Item("Milk", "234", 60, 0)
            )
    );
    List<Item> list3 = new ArrayList<>(
            List.of(
                    new Item("Bread", "a1234", 330, 0.8f)
            )
    );

    @Test
    public void everyBranchTest() {
        RuntimeException exception;

        exception = assertThrows(RuntimeException.class, () -> SILab2.checkCart(null, 0));
        assertEquals("allItems list can't be null!", exception.getMessage());

        exception = assertThrows(RuntimeException.class, () -> SILab2.checkCart(list1, 0));
        assertEquals("No barcode!", exception.getMessage());

        assertTrue(SILab2.checkCart(list2, 500));
        assertFalse(SILab2.checkCart(list2, 100));

        exception = assertThrows(RuntimeException.class, () -> SILab2.checkCart(list3, 0));
        assertEquals("Invalid character in item barcode!", exception.getMessage());
    }

    @Test
    public void everyStatementTest() {
        RuntimeException exception;

        exception = assertThrows(RuntimeException.class, () -> SILab2.checkCart(null, 0));
        assertEquals("allItems list can't be null!", exception.getMessage());

        exception = assertThrows(RuntimeException.class, () -> SILab2.checkCart(list1, 0));
        assertEquals("No barcode!", exception.getMessage());

        assertTrue(SILab2.checkCart(list2, 500));
        assertFalse(SILab2.checkCart(list2, 100));

        exception = assertThrows(RuntimeException.class, () -> SILab2.checkCart(list3, 0));
        assertEquals("Invalid character in item barcode!", exception.getMessage());
    }
}
