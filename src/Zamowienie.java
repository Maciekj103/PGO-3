import java.util.ArrayList;

public class Zamowienie {

    private int numerZamowienia;
    private KlientKawiarni klient;
    private ArrayList<ProduktMenu> produkty = new ArrayList<>();
    private boolean oplacone;
    private static int kolejnyNumer;

    public Zamowienie(KlientKawiarni klient) {
        this.klient = klient;
        kolejnyNumer = getKolejnyNumer() + 1;
        this.numerZamowienia = getKolejnyNumer();
    }

    @Override
    public String toString() {
        return "Zamowienie{" +
                "numerZamowienia=" + numerZamowienia +
                ", klient=" + klient +
                ", produkty=" + produkty +
                ", oplacone=" + oplacone +
                '}';
    }

    public void dodajProdukt(ProduktMenu produkt){
        produkty.add(produkt);
    }

    public double policzWartosc(){
        double wartosc = 0;
        for (ProduktMenu produkt : produkty){
            wartosc += produkt.getCena();
        }
        return wartosc;
    }

    public int policzLiczbeProduktow(){
        return produkty.size();
    }

    public void oznaczJakoOplacone(){
        this.oplacone = true;
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
