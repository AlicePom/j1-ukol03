package cz.czechitas.ukol3;

public class Disk {

    private long kapacita;
    private long vyuziteMisto = 0;

    public long getKapacita() {
        return kapacita;
    }

    public void setKapacita(long kapacita) {
        this.kapacita = kapacita;
    }

    public long getVyuziteMisto() {
        return vyuziteMisto;
    }

    public void setVyuziteMisto(long velikost) {
        if (velikost > kapacita) {
            System.err.println("Na disku není dost místa!");
            return;
        }
        // Property `vyuziteMisto` nemůže klesnout pod `0`, což opět zajistí kontrola v setteru.
        if (vyuziteMisto + velikost < 0) {
            System.err.println("Chybná velikost mazaného souboru!");
            return;
        }
        this.vyuziteMisto += velikost;
    }

    public String toString(long kapacita, long vyuziteMisto) {
        return "Kapactia disku je " + kapacita + " bajtů, z toho využité místo je " + vyuziteMisto + " bajtů.";
    }
}
