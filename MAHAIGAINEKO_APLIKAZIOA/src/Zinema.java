import java.util.ArrayList;

public class Zinema {

    // Klaseko atributu estatikoak 
    public static String pelikulak;
    public static String gelak;

    // Eraikitzailea 
    public Zinema(String pelikulak, String gelak) {
        this.pelikulak = pelikulak;
        this.gelak = gelak;
    }

    // Metodo estatikoa: pelikulen zerrenda sortu eta itzuli
    public static ArrayList<String> Pelikulak() {
        ArrayList<String> pelikulak = new ArrayList<>(); // Zerrenda hutsa sortu

        // Pelikulen izenak gehitu
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

        return pelikulak; // Zerrenda itzuli
    }

    // Metodo estatikoa: zinema gelak sortu eta itzuli
    public static ArrayList<String> Gelak() {
        ArrayList<String> gelak = new ArrayList<>(); // Zerrenda hutsa sortu

        // Gelak gehitu
        gelak.add("Umeen gela");
        gelak.add("Superheroien gela");
        gelak.add("Thriller gela");
        gelak.add("Zientzia fikziozko gela");
        gelak.add("Komedia gela");

        return gelak; // Zerrenda itzuli
    }
}
