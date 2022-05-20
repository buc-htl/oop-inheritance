public class Buch extends Medium {

    private String uebersetzer=null;

    public Buch(String titel, int inventarnummer) {
        super(titel,inventarnummer);
    }

    private void setUebersetzer(String uebersetzer) {
        this.uebersetzer = uebersetzer;
    }

    private String getUebersetzer() {
        return uebersetzer;
    }

}