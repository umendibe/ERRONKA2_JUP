import java.util.ArrayList;

public class Zinema {
    public static String pelikulak;
    public static String gelak;

    public Zinema(String pelikulak, String gelak) {
        this.pelikulak = pelikulak;
        this.gelak = gelak;
    }

    public static ArrayList<String> Pelikulak() {
        ArrayList<String> pelikulak = new ArrayList<>();
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
        return pelikulak;
    }

    public static ArrayList<String> Gelak() {
        ArrayList<String> gelak = new ArrayList<>();
        gelak.add("Umeen gela");
        gelak.add("Superheroien gela");
        gelak.add("Thriller gela");
        gelak.add("Zientzia fikziozko gela");
        gelak.add("Komedia gela");
        return gelak;
    }
}
