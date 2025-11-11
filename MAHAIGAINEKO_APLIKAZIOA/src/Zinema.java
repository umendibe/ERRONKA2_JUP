import java.util.ArrayList;

public class Zinema{

    // Pelikulen izenen zerrenda gordetzeko ArrayList-a
    private static ArrayList<String> pelikulak = new ArrayList<>();
    
    // Gelen izenen zerrenda gordetzeko ArrayList-a
    private static ArrayList<String> gelak = new ArrayList<>();
    private static ArrayList<String> asteburuak = new ArrayList<>();
    public static ArrayList<String> hilabeteak = new ArrayList<>();

    /*
     * Bloke estatikoa:
     * Programa martxan hasten denean behin exekutatzen da.
     * Hemen pelikulak eta gelak arrayetan gehitzen ditugu.
     * Horrela ez da beharrezkoa gero berriro datuak betetzea.
    /**
     * BIRFAKTORIZAZIOA
     * 1. Pelikulen eta gelen datuak Zinema klasean kokatu dira, Aplikazioa klasea garbiagoa izan dadin.
     * Pelikulak ArrayList eta Gelak ArrayList pribatuak static moduan deklaratu dira, behin bakarrik kargatu daitezen.
     * 2. Pelikulak() eta Gelak() metodo publikoak sortu dira, datu hauek beste klase batzuetatik eskuratu ahal izateko.
     * - Pelikulak ArrayList -->38. lerroa
     * - Gelak ArrayList -->43. lerroa
     */
    // Blokea: datuak behin bakarrik kargatzen dira
    static {
        pelikulak.add("Blackphone 2");
        pelikulak.add("Springsteen: Deliver Me From Nowhere");
        pelikulak.add("Maspalomas");
        pelikulak.add("Chinsaw Man");
        pelikulak.add("La Casa de Muñecas de Gabby: La Película");
        pelikulak.add("Crepusculo");
        pelikulak.add("Las Guerras de K-Pop");
        pelikulak.add("Tom y Jerry: Aventura en el Tiempo");
        pelikulak.add("Tron: Ares");
        pelikulak.add("Los Domingos");
        pelikulak.add("Caza de Brujas");
        pelikulak.add("Cuervos Locos");
        pelikulak.add("Decorado");

        gelak.add("Umeen gela");
        gelak.add("Superheroien gela");
        gelak.add("Thriller gela");
        gelak.add("Zientzia fikziozko gela");
        gelak.add("Komedia gela");

        asteburuak.add("1. asteburua");
        asteburuak.add("2. asteburua");
        asteburuak.add("3. asteburua");
        asteburuak.add("4. asteburua");
        asteburuak.add("5. asteburua");

        hilabeteak.add("Azaroa");
        hilabeteak.add("Abendua");
    }

    // Metodoa: pelikulen zerrenda itzultzen du 
    public static ArrayList<String> Pelikulak() {
        return pelikulak;
    }

    // Metodoa: gelen zerrenda itzultzen du
    public static ArrayList<String> Gelak() {
        return gelak;
    }

    public static ArrayList<String> Asteburuak() {
        return asteburuak;
    }

}
