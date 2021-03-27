package co.protoapp.tests;

import co.protoapp.Bot;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestBot {

    @Test
    public void testCuadrado() {
        Bot bot = new Bot();
        assertEquals("Hola, como puedo ayudarte?",bot.Saludo());
    }


}
