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

    //----------- gettery i settery -----------
    public int getNumerZamowienia() {
        return numerZamowienia;
    }

    public void setNumerZamowienia(int numerZamowienia) {
        this.numerZamowienia = numerZamowienia;
    }

    public KlientKawiarni getKlient() {
        return klient;
    }

    public void setKlient(KlientKawiarni klient) {
        this.klient = klient;
    }

    public ArrayList<ProduktMenu> getProdukty() {
        return produkty;
    }

    public void setProdukty(ArrayList<ProduktMenu> produkty) {
        this.produkty = produkty;
    }

    public boolean isOplacone() {
        return oplacone;
    }

    public void setOplacone(boolean oplacone) {
        this.oplacone = oplacone;
    }

    public static int getKolejnyNumer() {
        return kolejnyNumer;
    }

    public static void setKolejnyNumer(int kolejnyNumer) {
        Zamowienie.kolejnyNumer = kolejnyNumer;
    }

}
