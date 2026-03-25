public class ProduktMenu {

    private String kod;
    private String nazwa;
    private double cena;
    private String kategoria;
    private static int liczbaProduktow;

    public ProduktMenu(String kod, String nazwa, int cena, String kategoria, int liczbaProduktow) {
        this.kod = kod;
        this.nazwa = nazwa;
        this.cena = cena;
        this.kategoria = kategoria;
        this.liczbaProduktow = liczbaProduktow;
    }

    //----------- gettery -----------
    public String getNazwa() {
        return nazwa;
    }

    public String getKod() {
        return kod;
    }

    public String getKategoria() {
        return kategoria;
    }

    public double getCena() {
        return cena;
    }

    public static int getLiczbaProduktow() {
        return liczbaProduktow;
    }

    //----------- settery -----------
    public void setKod(String kod) {
        this.kod = kod;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public void setKategoria(String kategoria) {
        this.kategoria = kategoria;
    }

    public static void setLiczbaProduktow(int liczbaProduktow) {
        ProduktMenu.liczbaProduktow = liczbaProduktow;
    }


}
