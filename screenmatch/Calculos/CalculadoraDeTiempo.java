package screenmatch.Calculos;

import screenmatch.Modelos.Serie;
import screenmatch.Modelos.Titulo;

public class CalculadoraDeTiempo {

    private int tiempoTotal;

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void incluye(Titulo titulo) {
        this.tiempoTotal += titulo.getDuracionEnMinutos();
    }

    public void incluye(Serie serie){
        tiempoTotal += serie.getDuracionEnMinutos();
    }
}
