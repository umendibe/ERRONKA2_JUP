import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class Aplikazioa {
    /** Koloreak kontsolarako */
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";

    static Scanner sc = new Scanner(System.in);
    /** Kontsolatik datuak jasotzeko */
    static int aukera;
    /** Kontsolatik datuak jasotzeko */
    static int aukeraSarrera;
    /** Sarrerak erosteko aukeraren aldagaia */
    static boolean errepikatu = true;
    /** Programa barriro exekutatuko den ala ez adierazten du */
    static ArrayList<String> lista = Zinema.Pelikulak();
    /** Zinema klaseko pelikulen zerrenda */
    static ArrayList<String> listaAsteburuak = Zinema.Asteburuak();
    /** Zinema klaseko asteburuen zerrenda */
    static ArrayList<Sarrera> salmentak = new ArrayList<>();
    /** Erositako sarrerak gordetzeko zerrenda */
    static List<String> larunbata;
    /** Larunbateko pelikulen zerrenda */
    static List<String> igandea;
    /** Igandeko pelikulen zerrenda */
    static Map<String, ArrayList<String>> asteburuBakoitzeko = new HashMap<>();
    /** Asteburu bakoitzeko pelikulen map-a */
    static Random random = new Random();

    /** Ausazko zenbakiak sortzeko Random objektua */
    /**
     * Programa nagusia: erabiltzaileak menuko aukerak hautatu eta exekutatzen ditu.
     */
    public static void main(String[] args) {
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
        while (errepikatu) {/** Programa nagusia bueltaka exekutatzen da erabiltzaileak nahi duen arte */

            Menua1();
            /** Menua erakutsi eta aukera jaso */
            switch (aukera) {
                case 1:
                    lehenKasua();
                    System.out.println(ANSI_YELLOW + "Sarrerak erosi nahi al dituzu? bai(1) ez(2)" + ANSI_RESET);
                    aukeraSarrera = sc.nextInt();
                    sarreraErosi();
                    break;
                case 2:
                    bigarrenKasua();
                    System.out.println(ANSI_YELLOW + "Sarrerak erosi nahi al dituzu? bai(1) ez(2)" + ANSI_RESET);
                    aukeraSarrera = sc.nextInt();
                    sarreraErosi();
                    break;
                case 3:
                    hirugarrenKasua();
                    break;
                case 4:
                    laugarrenKasua();
                    break;
                case 5:
                    Saskia();
                    break;
                case 6:
                    bostgarrenKasua();
                    /** Programa amaitu */
                    return;
                default:
                    System.out.println(ANSI_RED + "Aukera ez da baliozkoa!" + ANSI_RESET);
            }

            if (errepikatu) {
                errepikatzen();/** Erabiltzaileari jarraitu nahi duen galdetzen zaio */
            }
        }
        sc.close();/** Scanner-a itxi */
    }

    /**
     * Menu nagusia inprimatzen du eta aukera jasotzen du
     */
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

    /**
     * 1. aukerari dagokion ekintza: aste egunaren arabera
     * pelikulen zerrenda
     * erakutsi eta sarrerak erosteko aukera eskaintzen du.
     */
    public static void lehenKasua() {
        System.out.println("Aukeratu hilabetea: ");
        for (int i = 0; i < Zinema.hilabeteak.size(); i++) {
            System.out.println(" (" + (i + 1) + ") " + Zinema.hilabeteak.get(i));
        }
        int aukeraHilabetea = sc.nextInt();
        System.out.println("Aukeratu asteburua: ");
        for (int i = 0; i < Zinema.Asteburuak().size(); i++) {
            System.out.println(" (" + (i + 1) + ") " + Zinema.Asteburuak().get(i));
        }
        int aukeraAsteburu = sc.nextInt();

        String kodea = aukeraHilabetea + "-" + aukeraAsteburu;

        ArrayList<String> pelikulakAsteburu;

        if (asteburuBakoitzeko.containsKey(kodea)) {
            pelikulakAsteburu = asteburuBakoitzeko.get(kodea);
            igandea = new ArrayList<>(pelikulakAsteburu.subList(0, 6));
            larunbata = new ArrayList<>(pelikulakAsteburu.subList(6, 12));
        } else {
            pelikulakAsteburu = new ArrayList<>();

            ArrayList<String> kopiaLista = new ArrayList<>(lista);
            Collections.shuffle(kopiaLista, random);
            larunbata = new ArrayList<>(kopiaLista.subList(0, Math.min(6, kopiaLista.size())));

            Collections.shuffle(kopiaLista, random);
            igandea = new ArrayList<>(kopiaLista.subList(0, Math.min(6, kopiaLista.size())));

            pelikulakAsteburu.addAll(igandea);
            pelikulakAsteburu.addAll(larunbata);

            asteburuBakoitzeko.put(kodea, pelikulakAsteburu);
        }
        if (aukeraAsteburu < 0 || aukeraAsteburu > 5) {
            System.out.println(ANSI_RED + "AUKERA EZ DA BALIOZKOA" + ANSI_RESET);
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

    /**
     * Sarrerak erosteko metodoa, erabiltzaileak eguna, pelikula eta sarrera kopurua
     * aukeratzen du.
     */

    public static void sarreraErosi() {

        if (aukeraSarrera != 1)
            return;

        System.out.println("Aukeratu eguna: \n 1. Larunbata \n 2. Igandea");
        int aukeraEguna = sc.nextInt();

        List<String> egunekoPelikulak;
        String egunaIzena;
        if (aukeraEguna == 1) {
            egunekoPelikulak = larunbata;
            egunaIzena = "Larunbata";
        } else if (aukeraEguna == 2) {
            egunekoPelikulak = igandea;
            egunaIzena = "Igandea";
        } else {
            System.out.println(ANSI_RED + "Egun okerra aukeratu duzu." + ANSI_RESET);
            return;
        }

        for (int i = 0; i < egunekoPelikulak.size(); i++) {
            System.out.println(" (" + i + ") " + egunekoPelikulak.get(i));
        }
        System.out.println("Zein pelikula ikusi nahi duzu? (Zenbakia aukeratu)");
        int pelikulaIkusi = sc.nextInt();

        if (pelikulaIkusi < 0 || pelikulaIkusi >= egunekoPelikulak.size()) {
            System.out.println(ANSI_RED + "Pelikula ez da baliozkoa." + ANSI_RESET);
            return;
        }

        double prezioa = 8.50;
        System.out.println("Zenbat sarrera erosi nahi dituzu? (1etik 4ra gehienez)");
        int pertsonaKop = sc.nextInt();

        if (pertsonaKop < 1 || pertsonaKop > 4) {
            System.out.println(ANSI_RED + "ERROREA: Mesedez 1 eta 4 arteko zenbaki bat sartu." + ANSI_RESET);
            return;
        }

        Sarrera sarrera = new Sarrera(egunekoPelikulak.get(pelikulaIkusi), egunaIzena, pertsonaKop, prezioa);

        salmentak.add(sarrera);

        System.out.println(ANSI_GREEN + sarrera + ANSI_RESET);

        sarrerakErrepikatzen();
    }

    /**
     * 2. aukerari dagokion ekintza: Pelikulen eta gelen informazio orokorra erakusten du.
     * */
    public static void bigarrenKasua() {
        System.out.println(ANSI_BLUE + "\nPelikulen lista: " + ANSI_RESET + Zinema.Pelikulak() + "\n");
        System.out.println(ANSI_PURPLE + "Pelikula kopurua: " + ANSI_RESET + Zinema.Pelikulak().size() + "\n");
        System.out.println(ANSI_BLUE + "Gelak: " + ANSI_RESET + Zinema.Gelak() + "\n");
        System.out.println(ANSI_PURPLE + "Gela kopurua: " + ANSI_RESET + Zinema.Gelak().size() + "\n");
    }
    /** 
     * 3. aukerari dagokion ekintza: zinemaren kokapena erakusten du. 
     */

    public static void hirugarrenKasua() {
        System.out.println(ANSI_CYAN + "\nKokapena:" + ANSI_RESET);
        System.out.println("Usurbilen kokatzen gara, Errekatxiki kalean konkretuki.\n");
    }

    /** 
     * 4. aukerari dagokion ekintza: zinemaren ordutegia erakusten du. 
     */
    public static void laugarrenKasua() {
        System.out.println(ANSI_GREEN + "Ordutegia:" + ANSI_RESET);
        System.out.println("Larunbatak: 12:00 - 01:00 \nIgandeak: 16:00 - 00:00 \n");
    }

   /** 
     * 6. aukerari dagokion ekintza: programa amaitzen du eta "Agur!" mezua erakusten du. 
     */
    public static void bostgarrenKasua() {
        System.out.println(ANSI_RED + "Agur!" + ANSI_RESET);
        errepikatu = false;
    }

     /** 
     * Programa berriro exekutatu nahi den galdetzen du. 
     */
    public static void errepikatzen() {
        System.out.println(ANSI_YELLOW + "\nBeste zerbait egin nahi duzu? bai(1) ez(2)" + ANSI_RESET);
        int jarraitu = sc.nextInt();
        if (jarraitu != 1) {
            System.out.println(ANSI_RED + "Agur!" + ANSI_RESET);
            errepikatu = false;
        }
    }
     /** 
     * Beste sarrera bat erosi nahi den galdetzen du. 
     */
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
     /** 
     * Saskian dauden erosketak erakusten ditu eta guztira zenbat diru gastatu den kalkulatzen du. 
     */
    public static void Saskia() {
        if (salmentak.isEmpty()) {
            System.out.println(ANSI_RED + "Salmentarik ez dago." + ANSI_RESET);
        } else {
            for (int i = 0; i < salmentak.size(); i++) {
                System.out.println(ANSI_BLUE + "Sarrera " + (i + 1) + ": \n" + ANSI_RESET + ANSI_GREEN
                        + salmentak.get(i) + ANSI_RESET);
            }
        }
        double total = 0;
        for (Sarrera s : salmentak) {
            total += s.getGuztira();
        }
        System.out.println("\nTotal diru-sarrera: " + total + "euro");
    }
}
