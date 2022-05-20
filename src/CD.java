/**
 Mit Schlüsselwort "extends" wird die Klasse CD von der Klasse Medium abgeleitet. "extends" kann man auch als "ist eine Art von" lesen. "CD ist eine Art von Medium."

 In Java kann nur von einer einzigen Superklasse abgeleitet werden ("Einfachvererbung").

 Die Klasse CD erbt alle Attribute und Methoden von der Superklasse (auch Basisklasse oder Elternklasse genannt). Allerdings sind alle private Attribute und Methoden in der abgeleiteten Klasse nicht sichtbar.

 Die Klasse CD wird als abgeleitete Klasse, Unterklasse oder Kindklasse bezeichnet.
 **/
public class CD extends Medium {

    /**
     Die Klasse CD besitzt also das Attribut musikstil plus alle Attribute von Medium.
     **/
    private String musikstil;

    /**
     Konstruktoren werden nicht vererbt.
     **/
    public CD(String titel, int inventarnummer, String musikstil) {
        /**
         Der erste Aufruf in jedem Konstruktor, muss der Aufruf eines Konstruktors der Elternklasse mit super() sein.

         Wird dieser nicht explizit aufgerufen, wird automatisch der default-Konstruktor ohne Parameter in der Elternklasse aufgerufen. Existiert dieser nicht, muss es einen super()-Call auf jeden Fall geben.
         **/
        super(titel,inventarnummer);
        this.musikstil = musikstil;

    }

    public CD(String titel, int inventarnummer) {
        this(titel, inventarnummer, "unbekannt");
    }


    public String toString() {
        /**
         Mit "super." kann man explizit eine Methode der Superklasse aufrufen.
         **/
        String s = super.toString();
        return s+" ,Musikstil: "+musikstil;
    }

}