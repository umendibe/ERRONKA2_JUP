public class Sarrera {

    private String pelikula;
    private String eguna;
    private int pertsonaKopurua;
    private double prezioa;
    private double guztira;

    public Sarrera(String pelikula, String eguna, int pertsonaKopurua, double prezioa) {
        this.pelikula = pelikula;
        this.eguna = eguna;
        this.pertsonaKopurua = pertsonaKopurua;
        this.prezioa = prezioa;
        this.guztira = pertsonaKopurua * prezioa;
    }

    // Getters
    public String getPelikula() {
        return pelikula;
    }

    public String getEguna() {
        return eguna;
    }

    public int getPertsonaKopurua() {
        return pertsonaKopurua;
    }

    public double getPrezioa() {
        return prezioa;
    }

    public double getGuztira() {
        return guztira;
    }

    @Override
    public String toString() {
        return "EGUNA: " + eguna + "\nPELIKULA: " + pelikula + "\nPERTSONA KOPURUA: " + pertsonaKopurua + "\nORDAINDU = " + guztira + "euro";
    }

}
