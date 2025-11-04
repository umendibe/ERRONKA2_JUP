
/*BIRFAKTORIZAZIOA: 44, 66, 71 lerroetan eta switch barruan dagoen 2. kasua (case 2) estruktura berdina du.
 * 44. lerroa: boolean hasieratzen dugu, era horretan 57. lerroan dagoen while bat sortzeko switch kasuak amaitzen direnean berriz hasierako menua bistaratzeko, bukle moduko bat sortuz. Horretarako 157. lerroan if batekin baldintza sortzen dugu.
 * 66 eta 71. lerroak: for erabiliz bi egunetako pelikulen planteamenduak egiten dira eta pelikulak eskuz hasieratu beharrean, listatik adierazitako posizioen pelikulak ateratzen ditugu, programa era errazago batean kodetuz.
 */
import java.util.*;

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

    public static void main(String[] args) {

        boolean errepikatu = true;

        while (errepikatu) {

            Menua1();

            switch (aukera) {
                case 1:

                    lehenKasua();

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
                    System.out.println(ANSI_RED + "Agur!" + ANSI_RESET);
                    errepikatu = false;
                    return;

                default:
                    System.out.println(ANSI_RED + "Aukera ez da baliozkoa!" + ANSI_RESET);
            }
            if (errepikatu) {
                System.out.println(ANSI_YELLOW + "\nBeste zerbait egin nahi duzu? bai(1) ez(2)" + ANSI_RESET);
                int jarraitu = sc.nextInt();
                if (jarraitu != 1) {
                    System.out.println(ANSI_RED + "Agur!" + ANSI_RESET);
                    errepikatu = false;
                }

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
        System.out.println(ANSI_YELLOW + "Aukeratu: (1) Astelehena  + (2) Osteguna" + ANSI_RESET);
        int aukeraEguna = sc.nextInt();

        if (aukeraEguna == 1) {
            System.out.println(ANSI_GREEN + "Asteleheneko pelikulak:" + ANSI_RESET);
            for (int i = 0; i < 7; i++) {
                System.out.println(pelikulak.get(i));
            }
        } else if (aukeraEguna == 2) {
            System.out.println(ANSI_GREEN + "Osteguneko pelikulak:" + ANSI_RESET);
            for (int i = 7; i < 15; i++) {
                System.out.println(pelikulak.get(i));
            }
        }

        System.out.println(ANSI_YELLOW + "Sarrerak erosi nahi al dituzu? bai(1) ez(2)" + ANSI_RESET);
        int aukeraSarrera = sc.nextInt();

        if (aukeraSarrera == 1) {
            for (int i = 0; i < pelikulak.size(); i++) {
                System.out.println(ANSI_RED + i + " - " + pelikulak.get(i) + ANSI_RESET);
            }
            System.out.println("Zein pelikula ikusi nahi duzu? (Zenbakia aukeratu)");
            int pelikulaIkusi = sc.nextInt();

            double prezioa = 8.50;
            System.out.println("Zenbat sarrera erosi nahi dituzu? (1etik 4ra gehienez)");
            int pertsonaKop = sc.nextInt();

            if (pertsonaKop < 1 || pertsonaKop > 4) {
                System.out.println(
                        ANSI_RED + "ERROREA: Mesedez 1 eta 4 arteko zenbaki bat sartu." + ANSI_RESET);
            } else {
                double guztira = prezioa * pertsonaKop;
                System.out.println(ANSI_GREEN + pelikulak.get(pelikulaIkusi)
                        + " pelikula ikusteko sarrera erosi duzu, "
                        + guztira + "€ ordaindu behar dira." + ANSI_RESET);
            }
        }
        break;
    }

    public static void bigarrenKasua() {
        System.out.println(ANSI_BLUE + "\nPelikulen lista: " + ANSI_RESET + pelikulak + "\n");
        System.out.println(ANSI_PURPLE + "Pelikula kopurua: " + ANSI_RESET + pelikulak.size() + "\n");
        System.out.println(ANSI_BLUE + "Gelak: " + ANSI_RESET + gelak + "\n");
        System.out.println(ANSI_PURPLE + "Gela kopurua: " + ANSI_RESET + gelak.size() + "\n");

        System.out.println(ANSI_YELLOW + "Sarrerak erosi nahi al dituzu? bai(1) ez(2)" + ANSI_RESET);
        int aukeraSarrera2 = sc.nextInt();

        if (aukeraSarrera2 == 1) {
            for (int i = 0; i < pelikulak.size(); i++) {
                System.out.println(ANSI_RED + i + " - " + pelikulak.get(i) + ANSI_RESET);
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
                System.out.println(ANSI_GREEN + pelikulak.get(pelikulaIkusi)
                        + " pelikula ikusteko sarrera erosi duzu, "
                        + guztira + "€ ordaindu behar dira." + ANSI_RESET);
            }
        }

        break;
    }

     public static void hirugarrenKasua() {
        System.out.println(ANSI_CYAN + "\nKokapena:" + ANSI_RESET);
        System.out.println("Usurbilen kokatzen gara, Errekatxiki kalean konkretuki. \n" +
                "Mapseko link-a: https://maps.app.goo.gl/LYmgyRZZ584R61nG9\n");

    }

    public static void laugarrenKasua() {
        System.out.println(ANSI_GREEN + "Ordutegia:" + ANSI_RESET);
                    System.out.println("Astelehenak: 12:00 - 00:00 \nOsteguna: 16:00 - 00:00 \n");
    }
}



   
