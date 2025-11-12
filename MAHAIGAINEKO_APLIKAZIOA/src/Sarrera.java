public class Sarrera {

    private String pelikula;
    private String eguna;
    private int pertsonaKopurua;
    private double prezioa;
    private double guztira;
    /**
     * Sarrera klasearen eraikitzailea (constructor).
     * Eraikitzaile honek sarreraren informazioa jasotzen du eta guztira kalkulatzen du automatikoki.
     */
    public Sarrera(String pelikula, String eguna, int pertsonaKopurua, double prezioa) {
        this.pelikula = pelikula;
        this.eguna = eguna;
        this.pertsonaKopurua = pertsonaKopurua;
        this.prezioa = prezioa;
        this.guztira = pertsonaKopurua * prezioa;
    }

    /** 
     * Pelikularen izena itzultzen du.
     */
    public String getPelikula() {
        return pelikula;
    }
     /** 
     * Egunaren izena itzultzen du.
     */
    public String getEguna() {
        return eguna;
    }
     /** 
     * Pertsona kopurua itzultzen du.
     */
    public int getPertsonaKopurua() {
        return pertsonaKopurua;
    }
     /** 
     * Prezioa pertsona bakoitzeko itzultzen du.
     */
    public double getPrezioa() {
        return prezioa;
    }
     /** 
     * Guztira ordaindu beharreko zenbatekoa itzultzen du.
     */
    public double getGuztira() {
        return guztira;
    }
    /** 
     * Erosketaren informazioa testu formatuan itzultzen du.
     */
    @Override
    public String toString() {
        return "EGUNA: " + eguna + "\nPELIKULA: " + pelikula + "\nPERTSONA KOPURUA: " + pertsonaKopurua + "\nORDAINDU = " + guztira + "euro";
    }

}
