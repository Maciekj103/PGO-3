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


}
