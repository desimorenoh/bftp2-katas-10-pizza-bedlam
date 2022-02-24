import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class PizzaBedlamTest {

    @Test
    void margheritaTicket() {

        Pizza margheritaPizza = new Pizza("margherita", BigDecimal.valueOf(9.30));

        String ticket = margheritaPizza.getTicket();

        assertThat(ticket, equalTo(
                        "MARGHERITA   9,30€\n" +
                "   _____________________________\n" +
                "   TOTAL                 9,30€"));

    }
    @Test
    void ProsciuttoTicket() {

        Pizza prosciuttoPizza = new Pizza("Prosciutto", BigDecimal.valueOf(12.00));

        String ticket = prosciuttoPizza.getTicket();

        assertThat(ticket, equalTo(
                        "PROSCIUTTO   12,00€\n" +
                "   _____________________________\n" +
                "   TOTAL                 12,00€"));

    }

    @Test
    void ProsciuttoEFunghiTicket() {

        Pizza prosciuttoEFunghiPizza = new Pizza("prosciutto E Funghi", BigDecimal.valueOf(12.50));

        String ticket = prosciuttoEFunghiPizza.getTicket();

        assertThat(ticket, equalTo(
                "PROSCIUTTO E FUNGHI   12,50€\n" +
                        "   _____________________________\n" +
                        "   TOTAL                 12,50€"));

    }

    @Test
    void cuatroStagioniTicket() {

        Pizza cuatroStagioniPizza = new Pizza("4 Stagioni", BigDecimal.valueOf(12.50));

        String ticket = cuatroStagioniPizza.getTicket();

        assertThat(ticket, equalTo(
                "4 STAGIONI   12,50€\n" +
                        "   _____________________________\n" +
                        "   TOTAL                 12,50€"));

    }

    @Test
    void extraIngredientsCanBeAdded(){

        Extras ingredientesBasicos = new Extras("Ingredientes Básicos", BigDecimal.valueOf(0.90));
        Pizza pizza = new Pizza("4 STAGIONI", BigDecimal.valueOf(12.50));

        String ticket = ingredientesBasicos + pizza.getTicket();

        assertThat(ticket, equalTo(
                "4 STAGIONI   12,50€\n" +
                        "Ingredientes básicos   0.90€\n" +
                        "   _____________________________\n" +
                        "   TOTAL                 13,40€"));

    }
}
