/** Importatu beharreko javako paketeak funtzio guztiak funtziona dezaten. */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

/**
 * BIRFAKTORIZAZIOA
 * 1. Menua1() metodoa sortu da menuaren erakusteko. Era honetan main metodoa
 * garbia eta ulergarria geratzen da lehen bistaz --> 60. lerroan
 * 2. Lehen kasua lehenKasua() metodoan kokatu da. Era honetan main metodoa
 * garbia eta ulergarria geratzen da lehen bistaz --> 72. lerroan
 * 3. Bigarren kasua bigarrenKasua() metodoan kokatu da. Era honetan main
 * metodoa garbia eta ulergarria geratzen da lehen bistaz --> 115. lerroan
 * 4. Hirugarren kasua hirugarrenKasua() metodoan kokatu da. Era honetan main
 * metodoa garbia eta ulergarria geratzen da lehen bistaz --> 122. lerroan
 * 5. Laugarren kasua laugarrenKasua() metodoan kokatu da. Era honetan main
 * metodoa garbia eta ulergarria geratzen da lehen bistaz --> 127. lerroan
 * 6. Bostgarren kasua bostgarrenKasua() metodoan kokatu da. Era honetan main
 * metodoa garbia eta ulergarria geratzen da lehen bistaz --> 132. lerroan
 * 7. Errepikatzen den galdetegia errepikatzen() metodoan kokatu da. Era honetan
 * main metodoa garbia eta ulergarria geratzen da lehen bistaz --> 137. lerroan
 */
public class Aplikazioa {
    /** Koloreak kontsolarako */
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";

    /** BARIABLE PUBLIKOAK */
    static Scanner sc = new Scanner(System.in);
    /** Kontsolatik datuak jasotzeko eskanerra sortzen */
    static int aukera;
    /** Aukera jasotzeko aldagai globala */
    static int aukeraSarrera;
    /** Sarrera aukeratzeko aldagai globala */
    static boolean errepikatu = true;
    static int aukeraHilabetea;
    /** Programa barriro exekutatzeko baimena */
    static ArrayList<String> lista = Zinema.Pelikulak();
    /** Pelikulen zerrenda Zinema.java fitxategitik hartuta */
    static ArrayList<String> listaAsteburuak = Zinema.Asteburuak();
    /** Asteburuetako zerrenda Zinema.java fitxategitik hartuta */
    static ArrayList<Sarrera> salmentak = new ArrayList<>();
    /** Salmenten zerrenda */
    static List<String> larunbata;
    /** Larunbatetako zerrenda */
    static List<String> igandea;
    /** Igandeko zerrenda */
    static Map<String, ArrayList<String>> asteburuBakoitzeko = new HashMap<>();
    /** Asteburu bakoitzeko pelikulen map-a */
    static Random random = new Random();
    /**
     * Ausazko zenbakiak sortzeko objektua, kasu honetan ausazko pelikulak
     * inprimatzeko
     */

    public static void main(String[] args) {

        while (errepikatu) {/* Programa nagusia bueltaka exekutatzen da erabiltzaileak nahi duen arte */

            Menua1();/* Menua erakutsi eta aukera jaso */

            switch (aukera) { /** Aukeraren arabera */
                /** Lehen kasua : Hilabetea eta asteburua aukeratu, ondoren sarrerak erosteko aukera eman.*/
                case 1:
                    lehenKasua();
                    if (aukeraHilabetea < 1 || aukeraHilabetea > Zinema.hilabeteak.size()) {
                        break;
                    } else {
                        sarrerakGaldera();
                        sarreraErosi();
                    }

                    break;
                    /** Bigarren kasua : Pelikulen eta gelen informazio orokorra erakutsi eta sarrerak erosteko aukera eman.*/
                case 2:
                    bigarrenKasua();
                    sarrerakGaldera();
                    lehenKasua();
                    sarreraErosi();
                    break;
                    /** Hirugarren kasua : Kokapena erakutsi.*/
                case 3:
                    hirugarrenKasua();
                    break;
                    /** Laugarren kasua : Irekiera ordutegia erakutsi.*/
                case 4:
                    laugarrenKasua();
                    break;
                    /** Bosgarren kasua : Saskia erakutsi (erositako sarrerak). */
                case 5:
                    Saskia();
                    break;
                    /** Seigarren kasua : Programa amaitzeko aukera eman.*/
                case 6:
                    bostgarrenKasua();
                    return;
                default:
                    System.out.println(ANSI_RED + "Aukera ez da baliozkoa!" + ANSI_RESET);
            }

            if (errepikatu) {
                errepikatzen();/** Beste operazio bat egiteko aukera eman erabiltzaileari. */
            }
        }
        sc.close();/** Scanner-a itxi */
    }

    /** Menua erakutsi eta aukera jaso */
    public static void Menua1() {
        System.out.println(ANSI_CYAN + "\nZein ikusi nahi duzu: \n" +
                "1. Aste eguna \n" +
                "2. Pelikulen informazio orokorra \n" +
                "3. Kokapena \n" +
                "4. Irekiera ordutegia \n" +
                "5. Saskia \n" +
                "6. Irten" + ANSI_RESET);

        System.out.print("Aukeratu bat: ");
        aukera = sc.nextInt();
    }

    /** Lehen kasua: Hilabetea eta asteburua aukeratu, ondoren sarrerak erosteko aukera eman. */
    public static void lehenKasua() {
        System.out.println("Aukeratu hilabetea: ");
        /** Hilabeteak erakutsi */
        for (int i = 0; i < Zinema.hilabeteak.size(); i++) {
            System.out.println(" (" + (i + 1) + ") " + Zinema.hilabeteak.get(i));
        }
        aukeraHilabetea = sc.nextInt();
        if (aukeraHilabetea < 1 || aukeraHilabetea > Zinema.hilabeteak.size()) {
            System.out
                    .println(ANSI_RED + "HILABETE OKERRA AUKERATU DUZU. MESDEZ HILABETE BALIOZKO BAT AUKERATU."
                            + ANSI_RESET);
            return;
        } else
            System.out.println("Aukeratu asteburua: ");
        for (int i = 0; i < Zinema.Asteburuak().size(); i++) {
            System.out.println(" (" + (i + 1) + ") " + Zinema.Asteburuak().get(i));
        }
        int aukeraAsteburu = sc.nextInt();

        if (aukeraAsteburu < 1 || aukeraAsteburu > Zinema.Asteburuak().size()) {
            System.out
                    .println(ANSI_RED + "HILABETE OKERRA AUKERATU DUZU. MESDEZ HILABETE BALIOZKO BAT AUKERATU."
                            + ANSI_RESET);
            return;
        }
        String kodea = aukeraHilabetea + "-" + aukeraAsteburu;

        ArrayList<String> pelikulakAsteburu;
        /** Ausazko pelikulak data bakoitzerako informazioa gordetzeko */
        if (asteburuBakoitzeko.containsKey(kodea)) {
            pelikulakAsteburu = asteburuBakoitzeko.get(kodea); /** Kodea hartu */
            igandea = new ArrayList<>(pelikulakAsteburu.subList(0, 6)); /** Igandeko pelikulak lortu */
            larunbata = new ArrayList<>(pelikulakAsteburu.subList(6, 12)); /** Larunbateko pelikulak lortu */
        } else {
            pelikulakAsteburu = new ArrayList<>(); /** Ausazko pelikulak sortzeko ArrayList bat sortu */

            ArrayList<String> kopiaLista = new ArrayList<>(lista); /** Pelikulen kopia bat sortu */
            Collections.shuffle(kopiaLista, random); /** Pelikulen zerrenda ausaz ordenatu */
            larunbata = new ArrayList<>(kopiaLista.subList(0, Math.min(6, kopiaLista.size()))); /** Lehen 6 pelikula hartu larunbaterako */

            Collections.shuffle(kopiaLista, random); /** Pelikulen zerrenda berriro ausaz ordenatu */
            igandea = new ArrayList<>(kopiaLista.subList(0, Math.min(6, kopiaLista.size()))); /** Lehen 6 pelikula hartu igandetarako */

            pelikulakAsteburu.addAll(igandea); /** Pelikulak gehitu zerrendara */
            pelikulakAsteburu.addAll(larunbata); /** Pelikulak gehitu zerrendara */

            asteburuBakoitzeko.put(kodea, pelikulakAsteburu); /** Kodea eta pelikulen zerrenda mapan gorde */
        }
        /** Errore kasua */
        if (aukeraAsteburu < 0 || aukeraAsteburu > 5) {
            System.out.println(ANSI_RED + "AUKERA EZ DA BALIOZKOA" + ANSI_RESET);
            /** Asteburuaren arabera pelikulak erakutsi */
        } else if (aukeraAsteburu == 1) {
            System.out.println(
                    ANSI_GREEN + "1. asteburuko pelikulak: \n Larunbateko pelikulak:\n" + ANSI_RESET + larunbata);
            System.out.println(ANSI_GREEN + " \n Igandeko pelikulak:" + ANSI_RESET + igandea);
        } else if (aukeraAsteburu == 2) {
            System.out.println(
                    ANSI_GREEN + "2. asteburuko pelikulak: \n Larunbateko pelikulak:\n" + ANSI_RESET + larunbata);
            System.out.println(ANSI_GREEN + " \n Igandeko pelikulak:" + ANSI_RESET + igandea);
        } else if (aukeraAsteburu == 3) {
            System.out.println(
                    ANSI_GREEN + "3. asteburuko pelikulak: \n Larunbateko pelikulak:\n" + ANSI_RESET + larunbata);
            System.out.println(ANSI_GREEN + " \n Igandeko pelikulak:" + ANSI_RESET + igandea);
        } else if (aukeraAsteburu == 4) {
            System.out.println(
                    ANSI_GREEN + "4. asteburuko pelikulak: \n Larunbateko pelikulak:\n" + ANSI_RESET + larunbata);
            System.out.println(ANSI_GREEN + " \n Igandeko pelikulak:" + ANSI_RESET + igandea);
        } else if (aukeraAsteburu == 5) {
            System.out.println(
                    ANSI_GREEN + "5. asteburuko pelikulak: \n Larunbateko pelikulak:\n" + ANSI_RESET + larunbata);

            System.out.println(ANSI_GREEN + " \n Igandeko pelikulak:" + ANSI_RESET + igandea);
        }
    }
    /** Sarrerak erosi metodoa */
    public static void sarreraErosi() {
        /** Errore kasua */
        if (aukeraSarrera != 1)
            return;
        /** Egunaren aukeraketa */
        System.out.println("Aukeratu eguna: \n 1. Larunbata \n 2. Igandea");
        int aukeraEguna = sc.nextInt();
        /** Eguneko pelikulak eta izena lortu */
        List<String> egunekoPelikulak;
        String egunaIzena;
        if (aukeraEguna == 1) {
            egunekoPelikulak = larunbata;
            egunaIzena = "Larunbata";
        } else if (aukeraEguna == 2) {
            egunekoPelikulak = igandea;
            egunaIzena = "Igandea";
            /** Errore kasua */
        } else {
            System.out.println(ANSI_RED + "Egun okerra aukeratu duzu." + ANSI_RESET);
            return;
        }
        /** Eguneko pelikulak erakutsi */
        for (int i = 0; i < egunekoPelikulak.size(); i++) {
            System.out.println(" (" + i + ") " + egunekoPelikulak.get(i));
        }
        /** Pelikula aukeraketa */
        System.out.println("Zein pelikula ikusi nahi duzu? (Zenbakia aukeratu)");
        int pelikulaIkusi = sc.nextInt();
        /** Errore kasua */
        if (pelikulaIkusi < 0 || pelikulaIkusi >= egunekoPelikulak.size()) {
            System.out.println(ANSI_RED + "Pelikula ez da baliozkoa." + ANSI_RESET);
            return;
        }
        /** Sarreren prezio fijo bat hasieratu */
        double prezioa = 8.50;
        /** Sarreren kopurua galdetu */
        System.out.println("Zenbat sarrera erosi nahi dituzu? (1etik 4ra gehienez)");
        int pertsonaKop = sc.nextInt();
        /** Errore kasua */
        if (pertsonaKop < 1 || pertsonaKop > 4) {
            System.out.println(ANSI_RED + "ERROREA: Mesedez 1 eta 4 arteko zenbaki bat sartu." + ANSI_RESET);
            return;
        }
        /** Sarrera objektua sortu eta salmenten zerrendan gehitu */
        Sarrera sarrera = new Sarrera(egunekoPelikulak.get(pelikulaIkusi), egunaIzena, pertsonaKop, prezioa);
        /** Salmentak listara erositako sarrerak gehitu */
        salmentak.add(sarrera);
        /** Sarreraren informazioa erakutsi */
        System.out.println(ANSI_GREEN + sarrera + ANSI_RESET);
        /** Beste sarrera bat erosi nahi den galdetu metodoa*/
        sarrerakErrepikatzen();
    }

    /** 2. aukera: Pelikulen eta gelen informazio orokorra */
    public static void bigarrenKasua() {
        System.out.println(ANSI_BLUE + "\nPelikulen lista: " + ANSI_RESET + Zinema.Pelikulak() + "\n");
        System.out.println(ANSI_PURPLE + "Pelikula kopurua: " + ANSI_RESET + Zinema.Pelikulak().size() + "\n");
        System.out.println(ANSI_BLUE + "Gelak: " + ANSI_RESET + Zinema.Gelak() + "\n");
        System.out.println(ANSI_PURPLE + "Gela kopurua: " + ANSI_RESET + Zinema.Gelak().size() + "\n");
    }

    /** 3. aukera: Kokapena */
    public static void hirugarrenKasua() {
        System.out.println(ANSI_CYAN + "\nKokapena:" + ANSI_RESET);
        System.out.println("Usurbilen kokatzen gara, Errekatxiki kalean konkretuki.\n");
    }

    /** 4. aukera: Ordutegia */
    public static void laugarrenKasua() {
        System.out.println(ANSI_GREEN + "Ordutegia:" + ANSI_RESET);
        System.out.println("Larunbatak: 12:00 - 01:00 \nIgandeak: 16:00 - 00:00 \n");
    }

    /** 6. aukera: Programa ixteko */
    public static void bostgarrenKasua() {
        System.out.println(ANSI_RED + "Agur!" + ANSI_RESET);
        errepikatu = false;
    }

    /** Errepikatu nahi den galdetegia */
    public static void errepikatzen() {
        System.out.println(ANSI_YELLOW + "\nBeste zerbait egin nahi duzu? bai(1) ez(2)" + ANSI_RESET);
        int jarraitu = sc.nextInt();
        if (jarraitu != 1) {
            System.out.println(ANSI_RED + "Agur!" + ANSI_RESET);
            errepikatu = false;
        }
    }
    /** Beste sarrera bat erosi nahi den galdetegia */
    public static void sarrerakErrepikatzen() {
        System.out.println("Beste sarrera bat erosi nahi duzu? bai(1) ez(2) ");
        int aukeraSarrera = sc.nextInt();

        if (aukeraSarrera == 1) {
            lehenKasua();
            sarreraErosi();
        } else {
            return;
        }
    }
    /** 5. aukera: Saskia erakutsi (erositako sarrerak). */
    public static void Saskia() {
        /** Saskia hutsik badago inprimatu adierazpena */
        if (salmentak.isEmpty()) {
            System.out.println(ANSI_RED + "Salmentarik ez dago." + ANSI_RESET);
        /** Bestela, erositako sarrerak inprimatu */
        } else {
            for (int i = 0; i < salmentak.size(); i++) {
                System.out.println(ANSI_BLUE + "Sarrera " + (i + 1) + ": \n" + ANSI_RESET + ANSI_GREEN
                        + salmentak.get(i) + ANSI_RESET);
            }
        }
        /** Salmenten totala kalkulatu eta inprimatu */
        double total = 0;
        for (Sarrera s : salmentak) {
            total += s.getGuztira();
        }
        System.out.println("\nTotal diru-sarrera: " + total + "euro");
    }

    public static void sarrerakGaldera() {
        System.out.println(ANSI_YELLOW + "Sarrerak erosi nahi al dituzu? bai(1) ez(2)" + ANSI_RESET);
        aukeraSarrera = sc.nextInt();
    }
}
