package AudioApp;

public class Audio {
    private String titulo;
    private int duracion;
    private int totalReproducciones;
    private int megusta;
    private double clasificacion;

    public Audio(String titulo, int duracion) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.totalReproducciones = 0;
        this.megusta = 0;
        this.clasificacion = 0.0;
    }

    public void reproducir() {
        this.totalReproducciones++;
    }

    public void darMeGusta() {
        this.megusta++;
    }

    // Getters y Setters
    public String getTitulo() { return titulo; }
    public int getDuracion() { return duracion; }
    public int getTotalReproducciones() { return totalReproducciones; }
    public int getMeGusta() { return megusta; }
    public double getClasificacion() { return clasificacion; }
    public void setClasificacion(double clasificacion) { this.clasificacion = clasificacion; }
}