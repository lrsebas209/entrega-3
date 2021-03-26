package co.edu.eafit.protoapp.tests;

import co.edu.eafit.protoapp.Bot;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestBot {

    @Test
    public void testHola() {
        Bot bot = new Bot();
        assertEquals("Hola, como puedo ayudarte?", bot.Saludo(), 0);
    }

    @Test
    public void testCero() {
        Bot bot = new Bot();
        assertEquals("Aun no estoy configurado para responder eso, te gustaria contactarte con una persona?", bot.Responder(0.0), 0);
    }
}
