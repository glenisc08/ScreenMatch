package AudioApp;

public class Podcast extends Audio {
    private String presentador;
    private String descripcion;
    private int numeroEpisodio;

    public Podcast(String titulo, int duracion, String presentador, String descripcion, int numeroEpisodio) {
        super(titulo, duracion);
        this.presentador = presentador;
        this.descripcion = descripcion;
        this.numeroEpisodio = numeroEpisodio;
    }

    // Getters específicos de Podcast
    public String getPresentador() { return presentador; }
    public String getDescripcion() { return descripcion; }
    public int getNumeroEpisodio() { return numeroEpisodio; }
}

