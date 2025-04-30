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


    // public class CalculadoraDeTiempo {

    //     private int tiempoTotal;

    //     public int getTiempoTotal() { return this.tiempoTotal; }

    //     // public void incluido(Filme f) {
    //     //     this.tiempoTotal += s.getDuracionEnMinutos();
    //     // }


    //     // public void incluido(Series s) {
    //     //     this.tiempoTotal += s.getDuracionEnMinutos();
    //     // }

        public void incluido(Titulo titulo) {
            System.out.println("Agregando duracion en minitos de " + titulo);
            this.tiempoTotal += titulo.getDuracionEnMinutos();
        }
    
        
    // }
}
