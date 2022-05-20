class Main {
    public static void main(String[] args) {

        CD cd = new CD("The wall",1,"Classic Rock");

        /*
         Obwohl die Klasse CD keine Methode getTitel() definiert kann man sie verwenden, weil sie von
         der Klasse Medium vererbt wird.
         */
        System.out.println("Der Titel lautet: "+cd.getTitel());

        System.out.println(cd);

        /*
         Man kann aber z.B. nicht auf die Methode getUebersetzer() zugreifen, weil sie weder eine Methode der Klasse CD, noch einer Superklasse ist (sondern eine Methode der Klasse Buch).
         */
        //cd.getUebersetzer();

        /*
         Es wird die von Medium vererbte Methode "ausleihen()" aufgerufen.
         **/
        cd.ausleihen("Matthias");

        Ebook e = new Ebook("Entwurfsmuster",3);
        /*
         Es wird die in Ebook überschriebene Methode "ausleihen()" aufgerufen.
         */
        e.ausleihen("Julia");

    }
}