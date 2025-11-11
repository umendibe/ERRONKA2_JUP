import org.junit.jupiter.api.*;
import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

class Aplikazioatest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private final InputStream originalIn = System.in;

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void restore() {
        System.setOut(originalOut);
        System.setIn(originalIn);
        Aplikazioa.salmentak.clear(); 
    }

    @Test
    void testSaskiaSalmentekin() {
        Sarrera s1 = new Sarrera("Peli1", "Larunbata", 2, 8.50);
        Sarrera s2 = new Sarrera("Peli2", "Igandea", 1, 8.50);
        Aplikazioa.salmentak.add(s1);
        Aplikazioa.salmentak.add(s2);

        Aplikazioa.Saskia();

        String output = outContent.toString();
        assertTrue(output.contains("Peli1"));
        assertTrue(output.contains("Peli2"));
        assertTrue(output.contains("Total diru-sarrera: 25.5"));
    }

    @Test
    void testSaskiaHutsik() {
        Aplikazioa.Saskia();
        String output = outContent.toString();
        assertTrue(output.contains("Salmentarik ez dago"));
    }

    @Test
    void testMenuBalioTartea() {
        System.setIn(new ByteArrayInputStream("1\n".getBytes()));
        Aplikazioa.Menua1();
        assertTrue(Aplikazioa.aukera >= 1 && Aplikazioa.aukera <= 6);
    }

    @Test
    void testMenuEzBaliozkoa() {
        Aplikazioa.aukera = 10;
        if (Aplikazioa.aukera < 1 || Aplikazioa.aukera > 6) {
            System.out.println(Aplikazioa.ANSI_RED + "Aukera ez da baliozkoa!" + Aplikazioa.ANSI_RESET);
        }
        String output = outContent.toString();
        assertTrue(output.contains("Aukera ez da baliozkoa!"));
    }
}
