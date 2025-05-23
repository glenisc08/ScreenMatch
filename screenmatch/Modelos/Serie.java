package screenmatch.Modelos;

public class Serie extends Titulo {
    int temporadas;

    int episodiosPorTemporada;

    int minutosPorEpisodio;

    @Override
    public int getDuracionEnMinutos() {
        return temporadas * episodiosPorTemporada * minutosPorEpisodio;
    }

   public int getTemporadas() {
    return temporadas;
   }

   public void setTemporadas(int temporadas) {
    this.temporadas = temporadas;
   }


   public int getEpisodiosPorTemporada() {
    return episodiosPorTemporada;
   }

   public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
    this.episodiosPorTemporada = episodiosPorTemporada;
   }


   public int getMinutosPorEpisodio() {
    return minutosPorEpisodio;
   }

   public Serie(String nombre, int fechaDeLanzamiento) {
    super(nombre, fechaDeLanzamiento);
   }

   public void setMinutosPorEpisodio(int minutosPorEpisodio) {
    this.minutosPorEpisodio = minutosPorEpisodio;
   }

   @Override
   public String toString() {
       return "Serie: "+this.getNombre()+" ("+this.getFechaDeLanzamiento()+")";
   }
}
