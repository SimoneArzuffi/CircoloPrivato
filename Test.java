import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

public class Test {
    private Circolo circolo;

    @BeforeEach
    public void setUp() {
        circolo = new Circolo();
    }

    @Test
    public void testAggiungiSocio() {
        circolo.aggiungiSocio("John", "Doe", 30, 'M');
        assertEquals(1, circolo.soci.size());
    }

    @Test
    public void testRimuoviSocio() {
        circolo.aggiungiSocio("John", "Doe", 30, 'M');
        circolo.rimuoviSocio("John", "Doe", 30, 'M');
        assertEquals(0, circolo.soci.size());
    }

    @Test
    public void testIncrementaEta() {
        circolo.aggiungiSocio("John", "Doe", 30, 'M');
        circolo.aggiungiSocio("Jane", "Smith", 25, 'F');
        circolo.incrementaEta();
        
        for (Socio socio : circolo.soci) {
            assertEquals(socio.eta, socio.eta + 1);
        }
    }

    @Test
    public void testEtaMedia() {
        circolo.aggiungiSocio("John", "Doe", 30, 'M');
        circolo.aggiungiSocio("Jane", "Smith", 25, 'F');
        
        assertEquals(27, circolo.etaMedia());
    }

    @Test
    public void testCalcolaEtaMediaPerSesso() {
        circolo.aggiungiSocio("John", "Doe", 30, 'M');
        circolo.aggiungiSocio("Jane", "Smith", 25, 'F');
        
        assertEquals(30, circolo.calcolaEtaMediaPerSesso('M'));
        assertEquals(25, circolo.calcolaEtaMediaPerSesso('F'));
    }

    @Test
    public void testDistribuzionePercentuale() {
        circolo.aggiungiSocio("John", "Doe", 30, 'M');
        circolo.aggiungiSocio("Jane", "Smith", 25, 'F');
        circolo.aggiungiSocio("Bob", "Johnson", 35, 'M');
        
        circolo.distribuzionePercentuale();
    }
}