public class Sarrera {
    /** BARIABLE PUBLIKOAK (Atributuak) */
    private String pelikula; /** Pelikula izena*/
    private String eguna; /** Eguna*/
    private int pertsonaKopurua; /** Pertsona kopurua*/
    private double prezioa; /** Prezioa*/
    private double guztira; /** Guztira*/
    /** Objektuaren eraikitzailea */
    public Sarrera(String pelikula, String eguna, int pertsonaKopurua, double prezioa) {
        this.pelikula = pelikula;
        this.eguna = eguna;
        this.pertsonaKopurua = pertsonaKopurua;
        this.prezioa = prezioa;
        this.guztira = pertsonaKopurua * prezioa;
    }

    /** Informazioa lortzeko metodoak */

    /** Pelikula izena lortzeko metodoa */
    public String getPelikula() {
        return pelikula;
    }

    /** Eguna lortzeko metodoa */
    public String getEguna() {
        return eguna;
    }

    /** Pertsona kopurua lortzeko metodoa */
    public int getPertsonaKopurua() {
        return pertsonaKopurua;
    }

    /** Prezioa lortzeko metodoa */
    public double getPrezioa() {
        return prezioa;
    }
    /** Guztira ordaindu beharreko metodoa */
    public double getGuztira() {
        return guztira;
    }
    /** toString metodoa: Sarrera objektuaren informazioa itzultzen du (String batean bihurtu) */
    @Override
    public String toString() {
        return "EGUNA: " + eguna + "\nPELIKULA: " + pelikula + "\nPERTSONA KOPURUA: " + pertsonaKopurua + "\nORDAINDU = " + guztira + "euro";
    }

}
