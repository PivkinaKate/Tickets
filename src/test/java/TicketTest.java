import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Comparator;

public class TicketTest {

    @Test
    public void testSortTickets() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("VLG", "MSK", 100, 10, 12);
        Ticket ticket2 = new Ticket("VLG", "SOCHI", 150, 9, 10);
        Ticket ticket3 = new Ticket("VLG", "MSK", 300, 11, 14);
        Ticket ticket4 = new Ticket("VLG", "MSK", 100, 12, 14);
        Ticket ticket5 = new Ticket("VLG", "MSK", 200, 16, 18);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);

        Ticket[] actual = manager.search("VLG", "MSK");
        Ticket[] expected = {ticket1, ticket4, ticket5, ticket3};

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void testSortTickets2() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("VLG", "MSK", 100, 10, 12);
        Ticket ticket2 = new Ticket("VLG", "SOCHI", 150, 9, 10);
        Ticket ticket3 = new Ticket("VLG", "MSK", 300, 11, 14);
        Ticket ticket4 = new Ticket("VLG", "MSK", 100, 12, 14);
        Ticket ticket5 = new Ticket("VLG", "MSK", 200, 16, 18);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);

        Ticket[] actual = manager.search("VLDVSTK", "VLG");
        Ticket[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void testSortTickets1() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("VLG", "MSK", 100, 10, 12);
        Ticket ticket2 = new Ticket("VLG", "SOCHI", 150, 9, 10);
        Ticket ticket3 = new Ticket("VLG", "MSK", 300, 11, 14);
        Ticket ticket4 = new Ticket("VLG", "MSK", 100, 12, 14);
        Ticket ticket5 = new Ticket("VLG", "MSK", 200, 16, 18);
        Ticket ticket6 = new Ticket("VLG", "SPB", 300, 16, 18);
        Ticket ticket7 = new Ticket("VLG", "SPB", 200, 16, 18);
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        manager.add(ticket7);

        Ticket[] actual = manager.search("VLG", "SPB");
        Ticket[] expected = {ticket7, ticket6};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSortTimeTickets() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("VLG", "MSK", 100, 10, 12); // 2
        Ticket ticket2 = new Ticket("VLG", "SOCHI", 150, 9, 10); // 1
        Ticket ticket3 = new Ticket("VLG", "MSK", 300, 11, 12); // 1
        Ticket ticket4 = new Ticket("VLG", "MSK", 100, 12, 15); // 3
        Ticket ticket5 = new Ticket("VLG", "MSK", 200, 16, 18); // 2
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);

        Comparator<Ticket> comparator = new TicketTimeComparator();


        Ticket[] actual = manager.search("VLG", "MSK", comparator);
        Ticket[] expected = {ticket3, ticket1, ticket5, ticket4};

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void testSortTimeTickets1() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("VLG", "MSK", 100, 10, 12); // 2
        Ticket ticket2 = new Ticket("VLG", "SOCHI", 150, 9, 10); // 1
        Ticket ticket3 = new Ticket("VLG", "MSK", 300, 11, 12); // 1
        Ticket ticket4 = new Ticket("VLG", "MSK", 100, 12, 15); // 3
        Ticket ticket5 = new Ticket("VLG", "MSK", 200, 16, 18); // 2
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);

        Comparator<Ticket> comparator = new TicketTimeComparator();


        Ticket[] actual = manager.search("VLG", "SOCHI", comparator);
        Ticket[] expected = {ticket2};

        Assertions.assertArrayEquals(expected, actual);
    }
    @Test
    public void testSortTimeTickets2() {
        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("VLG", "MSK", 100, 10, 12); // 2
        Ticket ticket2 = new Ticket("VLG", "SOCHI", 150, 9, 10); // 1
        Ticket ticket3 = new Ticket("VLG", "MSK", 300, 11, 12); // 1
        Ticket ticket4 = new Ticket("VLG", "MSK", 100, 12, 15); // 3
        Ticket ticket5 = new Ticket("VLG", "MSK", 200, 16, 18); // 2
        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);

        Comparator<Ticket> comparator = new TicketTimeComparator();


        Ticket[] actual = manager.search("Tula", "MSK", comparator);
        Ticket[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }
}
