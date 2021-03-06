package jurrepractum2.b;

public class Voetbalclub {
    private String naam;
    private int aantalGewonnen;
    private int aantalGelijk;
    private int aantalVerloren;

    public String getClubNaam() {
        return naam;
    }

    public Voetbalclub(String n) {
        if (n == null | n == ""){
            naam = "FC";}
        else naam = n;

    }

    public void verwerkResultaat(char ch) {
        if (ch == 'w') {
            aantalGewonnen = aantalGewonnen + 1;
        }else if (ch == 'g') {
            aantalGelijk = aantalGelijk + 1;
        }else if (ch == 'v') {
            aantalVerloren = aantalVerloren + 1;
        }else{
            System.out.println("Deze invoer is niet correct");}
    }

    public int aantalGespeeld() {
        int aantal = aantalGewonnen + aantalVerloren + aantalGelijk;
        return aantal;

    }
    public int getAantalGewonnen() {
        return aantalGewonnen;
    }
    public int getAantalGelijk() {
        return aantalGelijk;
    }
    public int getAantalVerloren() {
        return aantalVerloren;
    }
    public String toString() {
        String s = naam + " " + aantalGespeeld() + " " + aantalGewonnen + " " + aantalGelijk + " " + aantalVerloren + " " + aantalPunten();
        return s;
    }
    public int aantalPunten() {
        int p = (aantalGewonnen * 3) + (aantalGelijk * 1);
        return p;


    }
}
