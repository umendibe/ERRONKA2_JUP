import java.util.ArrayList;

public class Zinema{

    // Pelikulen izenen zerrenda gordetzeko ArrayList-a
    private static ArrayList<String> pelikulak = new ArrayList<>();
    
    // Gelen izenen zerrenda gordetzeko ArrayList-a
    private static ArrayList<String> gelak = new ArrayList<>();

    /*
     * Bloke estatikoa:
     * Programa martxan hasten denean behin exekutatzen da.
     * Hemen pelikulak eta gelak arrayetan gehitzen ditugu.
     * Horrela ez da beharrezkoa gero berriro datuak betetzea.
     */
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

    // Metodoa: pelikulen zerrenda itzultzen du 
    public static ArrayList<String> Pelikulak() {
        return pelikulak;
    }

    // Metodoa: gelen zerrenda itzultzen du
    public static ArrayList<String> Gelak() {
        return gelak;
    }
}
