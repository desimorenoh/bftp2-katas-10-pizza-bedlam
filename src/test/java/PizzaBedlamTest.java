import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class PizzaBedlamTest {

    @Test
    void margheritaTicket() {

        Pizza margheritaPizza = new Pizza("margherita", 9.30);

        String ticket = margheritaPizza.getTicket();

        assertThat(ticket, equalTo(
                        "MARGHERITA   9,30€\n" +
                "   _____________________________\n" +
                "   TOTAL                 9,30€"));

    }
    @Test
    void ProcuittoTicket() {

        Pizza procuittoPizza = new Pizza("Procuitto", 12.00);

        String ticket = procuittoPizza.getTicket();

        assertThat(ticket, equalTo(
                        "MARGHERITA   9,30€\n" +
                "   _____________________________\n" +
                "   TOTAL                 9,30€"));

    }
}
