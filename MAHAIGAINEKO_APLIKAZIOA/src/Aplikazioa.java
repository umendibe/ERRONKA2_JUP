import java.util.ArrayList;
import java.util.Scanner;

public class Aplikazioa {

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";

    static Scanner sc = new Scanner(System.in);
    static int aukera;
    static boolean errepikatu = true;
    static ArrayList<String> lista = Zinema.Pelikulak();

    public static void main(String[] args) {
        /**
         * BIRFAKTORIZAZIOA
         * 1. Menua1() metodoa sortu da menuaren erakusteko. Era honetan main metodoa garbia eta ulergarria geratzen da lehen bistaz --> 60. lerroan
         * 2. Lehen kasua lehenKasua() metodoan kokatu da. Era honetan main metodoa garbia eta ulergarria geratzen da lehen bistaz --> 72. lerroan
         * 3. Bigarren kasua bigarrenKasua() metodoan kokatu da. Era honetan main metodoa garbia eta ulergarria geratzen da lehen bistaz --> 115. lerroan
         * 4. Hirugarren kasua hirugarrenKasua() metodoan kokatu da. Era honetan main metodoa garbia eta ulergarria geratzen da lehen bistaz --> 122. lerroan
         * 5. Laugarren kasua laugarrenKasua() metodoan kokatu da. Era honetan main metodoa garbia eta ulergarria geratzen da lehen bistaz --> 127. lerroan
         * 6. Bostgarren kasua bostgarrenKasua() metodoan kokatu da. Era honetan main metodoa garbia eta ulergarria geratzen da lehen bistaz --> 132. lerroan
         * 7. Errepikatzen den galdetegia errepikatzen() metodoan kokatu da. Era honetan main metodoa garbia eta ulergarria geratzen da lehen bistaz --> 137. lerroan
         */
        while (errepikatu) {

            Menua1();

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
                    bostgarrenKasua();
                    return;
                default:
                    System.out.println(ANSI_RED + "Aukera ez da baliozkoa!" + ANSI_RESET);
            }

            if (errepikatu) {
                errepikatzen();
            }
        }
        sc.close();
    }

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

    public static void lehenKasua() {
        System.out.println(ANSI_YELLOW + "Aukeratu: (1) Larunbata  + (2) Igandea" + ANSI_RESET);
        int aukeraEguna = sc.nextInt();

        if (aukeraEguna == 1) {
            System.out.println(ANSI_GREEN + "Larunbateko pelikulak:" + ANSI_RESET);
            for (int i = 0; i < 6; i++) {
                System.out.println(lista.get(i));
            }
        } else if (aukeraEguna == 2) {
            System.out.println(ANSI_GREEN + "Igandeko pelikulak:" + ANSI_RESET);
            for (int i = 6; i < lista.size(); i++) {
                System.out.println(lista.get(i));
            }
        }
    }

    public static void bigarrenKasua() {
        System.out.println(ANSI_BLUE + "\nPelikulen lista: " + ANSI_RESET + Zinema.Pelikulak() + "\n");
        System.out.println(ANSI_PURPLE + "Pelikula kopurua: " + ANSI_RESET + Zinema.Pelikulak().size() + "\n");
        System.out.println(ANSI_BLUE + "Gelak: " + ANSI_RESET + Zinema.Gelak() + "\n");
        System.out.println(ANSI_PURPLE + "Gela kopurua: " + ANSI_RESET + Zinema.Gelak().size() + "\n");
    }

    public static void sarreraErosi() {
        System.out.println(ANSI_YELLOW + "Sarrerak erosi nahi al dituzu? bai(1) ez(2)" + ANSI_RESET);
        int aukeraSarrera = sc.nextInt();

        if (aukeraSarrera == 1) {
            for (int i = 0; i < lista.size(); i++) {
                System.out.println(ANSI_RED + i + " - " + lista.get(i) + ANSI_RESET);
            }
            System.out.println("Zein pelikula ikusi nahi duzu? (Zenbakia aukeratu)");
            int pelikulaIkusi = sc.nextInt();

            double prezioa = 8.50;
            System.out.println("Zenbat sarrera erosi nahi dituzu? (1etik 4ra gehienez)");
            int pertsonaKop = sc.nextInt();

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

    public static void hirugarrenKasua() {
        System.out.println(ANSI_CYAN + "\nKokapena:" + ANSI_RESET);
        System.out.println("Usurbilen kokatzen gara, Errekatxiki kalean konkretuki.\n");
    }

    public static void laugarrenKasua() {
        System.out.println(ANSI_GREEN + "Ordutegia:" + ANSI_RESET);
        System.out.println("Astelehenak: 12:00 - 00:00 \nOsteguna: 16:00 - 00:00 \n");
    }

    public static void bostgarrenKasua() {
        System.out.println(ANSI_RED + "Agur!" + ANSI_RESET);
        errepikatu = false;
    }

    public static void errepikatzen() {
        System.out.println(ANSI_YELLOW + "\nBeste zerbait egin nahi duzu? bai(1) ez(2)" + ANSI_RESET);
        int jarraitu = sc.nextInt();
        if (jarraitu != 1) {
            System.out.println(ANSI_RED + "Agur!" + ANSI_RESET);
            errepikatu = false;
        }
    }
}
