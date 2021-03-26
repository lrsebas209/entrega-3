package co.edu.eafit.protoapp.tests;

import co.edu.eafit.protoapp.Bot;
import org.junit.Test;
import static org.junit.Assert.*;

public class TestBot {

    @Test
    public void testCuadrado() {
        Bot bot = new Bot();
        System.out.println(bot.Saludo());
        assertEquals("Hola, como puedo ayudarte?",bot.Saludo(), 0);
    }


}
