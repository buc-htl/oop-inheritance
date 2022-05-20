public class Medium {

    /**
     private Attribute und Methoden sind nur in der Klasse selbst sichtbar (also auch in keinen Kindklassen).
     **/
    private int inventarNummer;

    /**
     protected Attribute sind auch in Kindklassen verfügbar (plus allen Klassen innerhalb vom gleichen Package)
     **/
    protected String titel;

    private String ausleiher;

    public Medium(String titel, int inventarNummer) {
        this.titel = titel;
        this.inventarNummer = inventarNummer;
    }

    public int getInventarNummer() {
        return inventarNummer;
    }

    public String getTitel() {
        return titel;
    }

    public void ausleihen(String a) {
        this.ausleiher = a;
    }

    public void zurueckbringen() {
        this.ausleiher = null;
    }


    public String toString() {
        return "Inventarnummer: "+inventarNummer+", Titel: "+titel;
    }



}
