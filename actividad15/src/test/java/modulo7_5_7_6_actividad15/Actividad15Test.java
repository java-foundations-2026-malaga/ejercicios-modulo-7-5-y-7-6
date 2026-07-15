package modulo7_5_7_6_actividad15;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import org.junit.jupiter.api.Test;

class Actividad15Test {
  @Test
  void salidaEsperada() throws Exception {
    ByteArrayOutputStream buffer = new ByteArrayOutputStream();
    PrintStream originalOut = System.out;
    System.setOut(new PrintStream(buffer, true, StandardCharsets.UTF_8));
    try {
      Actividad15.main(new String[0]);
    } finally {
      System.setOut(originalOut);
    }
    String output = buffer.toString(StandardCharsets.UTF_8).replace("\r\n", "\n").trim();
    assertEquals(
        "Total: 2\n"
            + "Reserva 1: Bubba - A1\n"
            + "Reserva 2: Twitch - B2\n"
            + "Guardia abre A1\n"
            + "A1 abierta: true\n"
            + "Incorrect code\n"
            + "B2 abierta: false\n"
            + "Capacidad máxima: 100",
        output);
  }
}
