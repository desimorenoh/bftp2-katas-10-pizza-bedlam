import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.math.BigDecimal;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class PizzaBedlamTest {


    @Test
    void margheritaTicket() {

        Pizza margheritaPizza = new Pizza("margherita", BigDecimal.valueOf(9.30));

        String ticket = margheritaPizza.getTicket();

        assertThat(ticket, equalTo(
                "MARGHERITA   9.30€\n" +
                        "   _____________________________\n" +
                        "   TOTAL                 9.30€"));

    }
    @Test
    void ProsciuttoTicket() {

        Pizza prosciuttoPizza = new Pizza("Prosciutto", BigDecimal.valueOf(12.00));

        String ticket = prosciuttoPizza.getTicket();

        assertThat(ticket, equalTo(
                "PROSCIUTTO   12.00€\n" +
                        "   _____________________________\n" +
                        "   TOTAL                 12.00€"));

    }

    @Test
    void ProsciuttoEFunghiTicket() {

        Pizza prosciuttoEFunghiPizza = new Pizza("prosciutto E Funghi", BigDecimal.valueOf(12.50));

        String ticket = prosciuttoEFunghiPizza.getTicket();

        assertThat(ticket, equalTo(
                "PROSCIUTTO E FUNGHI   12.50€\n" +
                        "   _____________________________\n" +
                        "   TOTAL                 12.50€"));

    }

    @Test
    void cuatroStagioniTicket() {

        Pizza cuatroStagioniPizza = new Pizza("4 Stagioni", BigDecimal.valueOf(12.50));

        String ticket = cuatroStagioniPizza.getTicket();

        assertThat(ticket, equalTo(
                "4 STAGIONI   12.50€\n" +
                        "   _____________________________\n" +
                        "   TOTAL                 12.50€"));

    }

    @Test
    void extraIngredientsCanBeAdded(){
        new Pizza("4 STAGIONI", BigDecimal.valueOf(12.50));
        new Extras("Ingredientes básicos", BigDecimal.valueOf(0.90));

        String ticket = String.valueOf(Ticket.getTicket());

        assertThat(ticket, equalTo(
                "4 STAGIONI   12.50€\n" +
                        "Ingredientes básicos   0.90€\n" +
                        "   _____________________________\n" +
                        "   TOTAL                 13.40€"));

    }

    @Test
    void extraIngredientsCanBeAddedTo(){

        new Pizza("Margherita", BigDecimal.valueOf(9.30));
        new Extras("Ingredientes básicos", BigDecimal.valueOf(0.90));


        String ticket = String.valueOf(Ticket.getTicket());

        assertThat(ticket, equalTo(
                "MARGHERITA   9.30€\n" +
                        "Ingredientes básicos   0.90€\n" +
                        "   _____________________________\n" +
                        "   TOTAL                 10.20€"));

    }
}