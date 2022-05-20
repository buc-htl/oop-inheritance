/**
 Klassenhierachien können über mehrere Ebenen gehen.
 Ebook erbt also von Buch und Buch erbt wiederum von Medium. D.h. alle nicht private Methoden und Attribute sowohl von Medium als auch von Buch stehen auch einem Ebook zu Verfügung.
 **/
public class Ebook extends Buch {

    public Ebook(String titel, int inventarnummer){
        super(titel, inventarnummer);
    }


    /**
     Methoden aus Superklassen können überschrieben werden. Die Methode besitzet die gleiche Signatur (Name, Parameter,...) wie die zu überschreibende Methode. Wenn auf ein Objekt dann diese Methode aufgerufen wird, wird die überschriebene und nicht die vererbte Methode ausgeführt.

     In diesem Fall wird die hier definierte Methode ausleihen() statt der in der Klasse Medium definierten Methode aufgerufen.

     Ein häufiger Fehler ist, dass man eine Methode eigentlich überschreiben möchte, es aber aufgrund z.B. eines Tippfehlers in Wahrheit nicht tut. Um diesen Fehler zu vermeiden, kann (optional) in Java vor überschriebenen Methoden die Annotation @Override stehen. Wenn dann keine Methode zum Überschreiben gefunden wird, zeigt der Compiler diesen Fehler an.
     **/
    @Override
    public void ausleihen(String a) {
        System.out.println("Fehler: E-Book kann nicht ausgeborgt werden");
    }

}
