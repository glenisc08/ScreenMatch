package AudioApp;

public class Cancion extends Audio {
    private String artista;
    private String album;
    private String genero;

    public Cancion(String titulo, int duracion, String artista, String album, String genero) {
        super(titulo, duracion);
        this.artista = artista;
        this.album = album;
        this.genero = genero;
    }

    // Getters específicos de Cancion
    public String getArtista() { return artista; }
    public String getAlbum() { return album; }
    public String getGenero() { return genero; }
}
