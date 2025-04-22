package AudioApp;

public class Main {
    public static void main(String[] args) {
        Cancion cancion = new Cancion("Mi Canción", 180, "Artista", "Álbum", "Pop");
        cancion.reproducir();
        cancion.darMeGusta();
        
        Podcast podcast = new Podcast("Episodio 1", 1800, "Presentador", "Descripción", 1);
        podcast.reproducir();
        podcast.darMeGusta();
    }
}

