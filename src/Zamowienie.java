import java.util.ArrayList;

public class Zamowienie {

    private int numerZamowienia;
    private KlientKawiarni klient;
    private ArrayList<ProduktMenu> produkty;
    private boolean oplacone;
    private static int kolejnyNumer;

    public Zamowienie(int numerZamowienia, KlientKawiarni klient, ArrayList<ProduktMenu> produkty, boolean oplacone, int kolejnyNumer) {
        this.numerZamowienia = numerZamowienia;
        this.klient = klient;
        this.produkty = produkty;
        this.oplacone = oplacone;
        this.kolejnyNumer = kolejnyNumer;
    }
}
