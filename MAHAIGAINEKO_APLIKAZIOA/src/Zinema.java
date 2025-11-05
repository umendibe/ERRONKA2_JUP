import java.util.ArrayList;

public class Zinema{

    private static ArrayList<String> pelikulak = new ArrayList<>();
    private static ArrayList<String> gelak = new ArrayList<>();

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
    }

    public static ArrayList<String> Pelikulak() {
        return pelikulak;
    }

    public static ArrayList<String> Gelak() {
        return gelak;
    }
}
