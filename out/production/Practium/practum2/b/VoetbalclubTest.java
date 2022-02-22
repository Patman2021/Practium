package jurrepractum2.b;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class VoetbalclubTest {

    @Test
    void kijkwaterbijeenlegevoetbalclubgeschrevenwordt() {
        System.out.println("kijk wat er bij een lege voetbalclub geschreven wordt");
        Voetbalclub niks = new Voetbalclub("");
        Voetbalclub nullig = new Voetbalclub(null);
        Voetbalclub graa = new Voetbalclub("De Graafschap");
        assertEquals("FC", niks.getClubNaam(), "er is geen FC teruggegeven");
        System.out.println("De eerste test is gelukt :)"+niks.getClubNaam());
        assertEquals("FC", nullig.getClubNaam(), "er is geen FC teruggegeven");
        System.out.println("De tweede test is gelukt :)" + nullig.getClubNaam());
        System.out.println("De tweede test is gelukt :)" + graa.getClubNaam());



    }
    @Test
    void ietsmetdepuntenenzo() {
        System.out.println("kijk wat er bij een lege voetbalclub geschreven wordt");
        Voetbalclub graa = new Voetbalclub("De Graafschap");
        graa.verwerkResultaat('t');
        System.out.println(graa);
        assertEquals(0,graa.aantalGespeeld(),"er is niet genoeg gewonnen");
        graa.verwerkResultaat('e');
        assertEquals(0,graa.aantalGespeeld(),"er is niet genoeg gewonnen");
        System.out.println(graa);
        graa.verwerkResultaat('w');
        System.out.println(graa);
        assertEquals(3,graa.aantalPunten(),"er is niet genoeg gewonnen");
        graa.verwerkResultaat('g');
        System.out.println(graa);
        assertEquals(4,graa.aantalPunten(),"er is niet genoeg gewonnen");
        graa.verwerkResultaat('v');
        System.out.println(graa);
        assertEquals(4,graa.aantalPunten(),"er is niet genoeg gewonnen");
        System.out.println("De eerste test is gelukt :)");

    }
    @Test
    void nogeenpuntleestest() {
        System.out.println("kijk wat de toString() levert");
        Voetbalclub psv = new Voetbalclub("psv");
        psv.verwerkResultaat('e');
        assertEquals("psv 0 0 0 0 0",psv.toString(),"er is niet genoeg gewonnen");
        System.out.println(psv);
        System.out.println("Lekker bezig, een foute invoer leid niet tot punten of gespeelde wedstrijden");
        psv.verwerkResultaat('w');
        assertEquals("psv 1 1 0 0 3",psv.toString(),"de String is niet correct");
        System.out.println(psv);
        System.out.println("Lekker bezig, een goede invoer leid tot punten en gespeelde wedstrijden");
        psv.verwerkResultaat('g');
        assertEquals("psv 2 1 1 0 4",psv.toString(),"de String is niet correct");
        System.out.println(psv);
        System.out.println("Lekker bezig, een goede invoer leid tot punten en gespeelde wedstrijden");
        psv.verwerkResultaat('v');
        System.out.println(psv);
        assertEquals("psv 3 1 1 1 4",psv.toString(),"de String is niet correct");
        System.out.println("Lekker bezig, een goede invoer leid tot punten en gespeelde wedstrijden");
        System.out.println("De Strings worden goed geprint, de test is gelukt!");

    }
    @Test
    void heelVeelWedstrijden() {
        Voetbalclub AZ = new Voetbalclub("AZ Alkmaar");
        AZ.verwerkResultaat('w');
        AZ.verwerkResultaat('v');
        AZ.verwerkResultaat('w');
        AZ.verwerkResultaat('w');
        AZ.verwerkResultaat('g');
        System.out.println(AZ);
        assertEquals(10,AZ.aantalPunten(),"de String is niet correct");
        assertEquals(5,AZ.aantalGespeeld(),"de String is niet correct");
        AZ.verwerkResultaat('w');
        AZ.verwerkResultaat('v');
        AZ.verwerkResultaat('g');
        AZ.verwerkResultaat('g');
        AZ.verwerkResultaat('g');
        AZ.verwerkResultaat('g');
        System.out.println(AZ);
        assertEquals(17,AZ.aantalPunten(),"de String is niet correct");
        assertEquals(11,AZ.aantalGespeeld(),"de String is niet correct");
        System.out.println("Goed bezig, het systeem laat goed het aantal punten en gespeelde wedstrijden zien!");


    }
}