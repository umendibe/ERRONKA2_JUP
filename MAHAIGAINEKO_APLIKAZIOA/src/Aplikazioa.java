import java.util.ArrayList;
import java.util.Scanner;

public class Aplikazioa {
    // Koloreak kontsolarako
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";

    static Scanner sc = new Scanner(System.in);// Kontsolatik datuak jasotzeko
    static int aukera;// Kontsolatik datuak jasotzeko
    static boolean errepikatu = true;// Programa barriro exekutatzeko baimena
    static ArrayList<String> lista = Zinema.Pelikulak();
    static ArrayList<String> listaAsteburuak = Zinema.Asteburuak();

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
        while (errepikatu) {// Programa nagusia bueltaka exekutatzen da erabiltzaileak nahi duen arte

            Menua1();// Menua erakutsi eta aukera jaso
        // Menua erakutsi eta aukera jaso
            switch (aukera) {
                case 1:
                    lehenKasua();
                    sarreraErosi();
                    break;
                case 2:
                    bigarrenKasua();
                    sarreraErosi();
                    break;
                case 3:
                    hirugarrenKasua();
                    break;
                case 4:
                    laugarrenKasua();
                    break;
                case 5:
                    bostgarrenKasua();//Programa amaitu
                    return;
                default:
                    System.out.println(ANSI_RED + "Aukera ez da baliozkoa!" + ANSI_RESET);
            }

            if (errepikatu) {
                errepikatzen();// Erabiltzaileari jarraitu nahi duen galdetzen zaio
            }
        }
        sc.close();// Scanner-a itxi
    }
    // Menu nagusia inprimatzen du eta aukera jasotzen du
    public static void Menua1() {
        System.out.println(ANSI_CYAN + "\nZein ikusi nahi duzu: \n" +
                "1. Aste eguna \n" +
                "2. Pelikulen informazio orokorra \n" +
                "3. Kokapena \n" +
                "4. Irekiera ordutegia \n" +
                "5. Irten" + ANSI_RESET);

        System.out.print("Aukeratu bat: ");
        aukera = sc.nextInt();
    }
    // 1. aukera: Aste egunaren arabera pelikulen zerrenda erakutsi eta sarrerak saltzea
    public static void lehenKasua() {
        System.out.println("Aukeratu hilabetea: ");
        
        System.out.println(ANSI_YELLOW + " (1) " + listaAsteburuak.get(0) + " (2) " + listaAsteburuak.get(1) + " (3) " + listaAsteburuak.get(2) + ANSI_RESET);
        int aukeraEguna = sc.nextInt();

        Zinema data1 = new Zinema();
        if (aukeraEguna == 1) {
            System.out.println(ANSI_GREEN + "8ko asteburuko pelikulak: \n Larunbateko pelikulak:" + ANSI_RESET);
            for (int i = 0; i < 6; i++) {
                System.out.println(lista.get(i));
            }
            System.out.println(ANSI_GREEN + " \n Igandeko pelikulak:" + ANSI_RESET);
            for (int i = 6; i < 12; i++) {
                System.out.println(lista.get(i));
            }

        } else if (aukeraEguna == 2) {
            System.out.println(ANSI_GREEN + "15eko asteburuko pelikulak: \n Larunbateko pelikulak:" + ANSI_RESET);
            for (int i = 6; i < 12; i++) {
                System.out.println(lista.get(i));
            }
            System.out.println(ANSI_GREEN + " \n Igandeko pelikulak:" + ANSI_RESET);
            for (int i = 0; i < 6; i++) {
                System.out.println(lista.get(i));
            }

        } else if (aukeraEguna == 3) {
            System.out.println(ANSI_GREEN + "22ko asteburuko pelikulak: \n Larunbateko pelikulak:" + ANSI_RESET);
            for (int i = 0; i < 6; i++) {
                System.out.println(lista.get(i));
            }
            System.out.println(ANSI_GREEN + " \n Igandeko pelikulak:" + ANSI_RESET);
            for (int i = 6; i < 12; i++) {
                System.out.println(lista.get(i));
            }
        }
        // Sarrerak erosi nahi diren galdetu
    }

    public static void sarreraErosi() {
        System.out.println(ANSI_YELLOW + "Sarrerak erosi nahi al dituzu? bai(1) ez(2)" + ANSI_RESET);
        int aukeraSarrera = sc.nextInt();

        if (aukeraSarrera == 1) {
            // Pelikulen indizea erakutsi aukeratzeko
            for (int i = 0; i < lista.size(); i++) {
                System.out.println(ANSI_RED + i + " - " + lista.get(i) + ANSI_RESET);
            }
            System.out.println("Zein pelikula ikusi nahi duzu? (Zenbakia aukeratu)");
            int pelikulaIkusi = sc.nextInt();

            double prezioa = 8.50;
            System.out.println("Zenbat sarrera erosi nahi dituzu? (1etik 4ra gehienez)");
            int pertsonaKop = sc.nextInt();
           // Pertsona kopurua balidatu
            if (pertsonaKop < 1 || pertsonaKop > 4) {
                System.out.println(ANSI_RED + "ERROREA: Mesedez 1 eta 4 arteko zenbaki bat sartu." + ANSI_RESET);
            } else {
                double guztira = prezioa * pertsonaKop;
                System.out.println(ANSI_GREEN + lista.get(pelikulaIkusi)
                        + " pelikula ikusteko sarrera erosi duzu, "
                        + guztira + "€ ordaindu behar dira." + ANSI_RESET);
            }
        }
    }
    // 2. aukera: Pelikulen eta gelen informazio orokorra + salmenta
    public static void bigarrenKasua() {
        System.out.println(ANSI_BLUE + "\nPelikulen lista: " + ANSI_RESET + Zinema.Pelikulak() + "\n");
        System.out.println(ANSI_PURPLE + "Pelikula kopurua: " + ANSI_RESET + Zinema.Pelikulak().size() + "\n");
        System.out.println(ANSI_BLUE + "Gelak: " + ANSI_RESET + Zinema.Gelak() + "\n");
        System.out.println(ANSI_PURPLE + "Gela kopurua: " + ANSI_RESET + Zinema.Gelak().size() + "\n");
    }
    // 3. aukera: Kokapena

    public static void hirugarrenKasua() {
        System.out.println(ANSI_CYAN + "\nKokapena:" + ANSI_RESET);
        System.out.println("Usurbilen kokatzen gara, Errekatxiki kalean konkretuki.\n");
    }
    // 4. aukera: Ordutegia
    public static void laugarrenKasua() {
        System.out.println(ANSI_GREEN + "Ordutegia:" + ANSI_RESET);
        System.out.println("Larunbatak: 12:00 - 01:00 \nIgandeak: 16:00 - 00:00 \n");
    }
    // 5. aukera: Programa ixteko
    public static void bostgarrenKasua() {
        System.out.println(ANSI_RED + "Agur!" + ANSI_RESET);
        errepikatu = false;
    }
    // Beste ekintza bat egin nahi den galdetus
    public static void errepikatzen() {
        System.out.println(ANSI_YELLOW + "\nBeste zerbait egin nahi duzu? bai(1) ez(2)" + ANSI_RESET);
        int jarraitu = sc.nextInt();
        if (jarraitu != 1) {
            System.out.println(ANSI_RED + "Agur!" + ANSI_RESET);
            errepikatu = false;
        }
    }
}
