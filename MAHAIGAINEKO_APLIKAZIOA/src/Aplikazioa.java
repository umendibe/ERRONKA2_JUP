import java.util.*;

public class Aplikazioa {

    // Koloreak kontsolarako (estetika)
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";

    static Scanner sc = new Scanner(System.in); // Kontsolatik datuak jasotzeko
    static int aukera; // Menuaren aukera gordetzeko
    static boolean errepikatu = true; // Programa berriro exekutatzeko baimena

    public static void main(String[] args) {

        while (errepikatu) { // Programa nagusia bueltaka exekutatzen da erabiltzaileak nahi duen arte

            Menua1(); // Menua erakutsi eta aukera jaso

            // Aukeraren arabera metodo ezberdin bat exekutatu
            switch (aukera) {
                case 1:
                    lehenKasua();
                    break;

                case 2:
                    bigarrenKasua();
                    break;

                case 3:
                    hirugarrenKasua();
                    break;

                case 4:
                    laugarrenKasua();
                    break;

                case 5:
                    bostgarrenKasua(); // Programa amaitu
                    return;

                default:
                    System.out.println(ANSI_RED + "Aukera ez da baliozkoa!" + ANSI_RESET);
            }

            if (errepikatu) {
                errepikatzen(); // Erabiltzaileari jarraitu nahi duen galdetzen zaio
            }
        }
        sc.close(); // Scanner-a itxi
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
        System.out.println(ANSI_YELLOW + "Aukeratu: (1) Larunbata  + (2) Igandea" + ANSI_RESET);
        int aukeraEguna = sc.nextInt();

        // Pelikulak zinema-klasetik hartzen dira
        if (aukeraEguna == 1) {
            System.out.println(ANSI_GREEN + "Larunbateko pelikulak:" + ANSI_RESET);
            for (int i = 0; i < 6; i++) {
                System.out.println(Zinema.Pelikulak().get(i));
            }
        } else if (aukeraEguna == 2) {
            System.out.println(ANSI_GREEN + "Igandeko pelikulak:" + ANSI_RESET);
            for (int i = 6; i < 13; i++) {
                System.out.println(Zinema.Pelikulak().get(i));
            }
        }

        // Sarrerak erosi nahi diren galdetu
        System.out.println(ANSI_YELLOW + "Sarrerak erosi nahi al dituzu? bai(1) ez(2)" + ANSI_RESET);
        int aukeraSarrera = sc.nextInt();

        if (aukeraSarrera == 1) {
            // Pelikulen indizea erakutsi aukeratzeko
            for (int i = 0; i < Zinema.Pelikulak().size(); i++) {
                System.out.println(ANSI_RED + i + " - " + Zinema.Pelikulak().get(i) + ANSI_RESET);
            }

            System.out.println("Zein pelikula ikusi nahi duzu? (Zenbakia aukeratu)");
            int pelikulaIkusi = sc.nextInt();

            double prezioa = 8.50;
            System.out.println("Zenbat sarrera erosi nahi dituzu? (1etik 4ra gehienez)");
            int pertsonaKop = sc.nextInt();

            // Kopurua balidatu
            if (pertsonaKop < 1 || pertsonaKop > 4) {
                System.out.println(
                        ANSI_RED + "ERROREA: Mesedez 1 eta 4 arteko zenbaki bat sartu." + ANSI_RESET);
            } else {
                double guztira = prezioa * pertsonaKop;
                System.out.println(ANSI_GREEN + Zinema.Pelikulak().get(pelikulaIkusi)
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

        System.out.println(ANSI_YELLOW + "Sarrerak erosi nahi al dituzu? bai(1) ez(2)" + ANSI_RESET);
        int aukeraSarrera2 = sc.nextInt();

        if (aukeraSarrera2 == 1) {
            for (int i = 0; i < Zinema.Pelikulak().size(); i++) {
                System.out.println(ANSI_RED + i + " - " + Zinema.Pelikulak().get(i) + ANSI_RESET);
            }

            System.out.println("Zein pelikula ikusi nahi duzu? (Zenbakia aukeratu)");
            int pelikulaIkusi = sc.nextInt();

            double prezioa = 8.50;
            System.out.println("Zenbat pertsona zarete? (1etik 4ra gehienez)");
            int pertsonaKop = sc.nextInt();

            if (pertsonaKop < 1 || pertsonaKop > 4) {
                System.out.println(
                        ANSI_RED + "ERROREA: Mesedez 1 eta 4 arteko zenbaki bat sartu." + ANSI_RESET);
            } else {
                double guztira = prezioa * pertsonaKop;
                System.out.println(ANSI_GREEN + Zinema.Pelikulak().get(pelikulaIkusi)
                        + " pelikula ikusteko sarrera erosi duzu, "
                        + guztira + "€ ordaindu behar dira." + ANSI_RESET);
            }
        }
    }

    // 3. aukera: Kokapena
    public static void hirugarrenKasua() {
        System.out.println(ANSI_CYAN + "\nKokapena:" + ANSI_RESET);
        System.out.println("Usurbilen kokatzen gara, Errekatxiki kalean konkretuki. \n" +
                "Mapseko link-a: https://maps.app.goo.gl/LYmgyRZZ584R61nG9\n");
    }

    // 4. aukera: Ordutegia
    public static void laugarrenKasua() {
        System.out.println(ANSI_GREEN + "Ordutegia:" + ANSI_RESET);
        System.out.println("Astelehenak: 12:00 - 00:00 \nOsteguna: 16:00 - 00:00 \n");
    }

    // 5. aukera: Programa ixteko
    public static void bostgarrenKasua() {
        System.out.println(ANSI_RED + "Agur!" + ANSI_RESET);
        errepikatu = false;
    }

    // Beste ekintza bat egin nahi den galdetu
    public static void errepikatzen() {
        System.out.println(ANSI_YELLOW + "\nBeste zerbait egin nahi duzu? bai(1) ez(2)" + ANSI_RESET);
        int jarraitu = sc.nextInt();
        if (jarraitu != 1) {
            System.out.println(ANSI_RED + "Agur!" + ANSI_RESET);
            errepikatu = false;
        }
    }
}
