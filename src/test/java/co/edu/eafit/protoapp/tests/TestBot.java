package co.edu.eafit.protoapp.tests;

import co.edu.eafit.protoapp.Bot;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestBot {

    @Test
    public void testCuadrado() {
        Bot bot = new Bot();
        assertEquals("Hola, como puedo ayudarte?",Saludo(), 0);
    }

    @Test
    public void testCero() {
        Bot bot = new Bot();
        assertEquals(0.0, bot.cuadrado(0.0), 0);
    }

    @Test
    public void testUno() {
        Bot bot = new Bot();
        assertEquals(1.0, bot.cuadrado(1.0), 0);
    }

    @Test
    public void testNegativo() {
        Bot bot = new Bot();
        assertEquals(16.0, bot.cuadrado(-4.0), 0);
    }
}
