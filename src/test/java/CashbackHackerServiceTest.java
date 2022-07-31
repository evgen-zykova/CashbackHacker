import org.junit.Test;
import ru.netology.service.CashbackHackerService;

import static org.junit.Assert.assertEquals;

public class CashbackHackerServiceTest {
    CashbackHackerService service = new CashbackHackerService();

    @Test
    public void calculateNotEnoughFullAmount() {
        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void calculatePurchasePer1000() {
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }

    @Test
    public void calculatePurchasePer0() {
        int amount = 0;
        int expected = 1000;
        int actual = service.remain(amount);

        assertEquals(actual, expected);
    }


}


