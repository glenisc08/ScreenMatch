package screenmatch;

import screenmatch.Calculos.Clasificacion;
import screenmatch.Modelos.Titulo;

public class Pelicula extends Titulo implements Clasificacion{
   // private String director;

   // public String getDirector() {
   //  return director;
   // }


   // public void setDirector(String director) {
   //  this.director = director;
   // }


   // @Override
   // public int getClasificacion() {
   //    return (int) (calculaMedia() / 2);
   // }



   private String director;


      public Pelicula(String nombre, int fechaDeLanzamiento) {
         super(nombre, fechaDeLanzamiento);
      }


      public String getDirector() { return director; }

      public void setDirector(String director) { this.director = director; }

      @Override
      public int getClasificacion() { return (int) calculaMedia() / 2; }


   @Override
   public String toString() {
       return "Pelicula: " + this.getNombre() + " (" + getFechaDeLanzamiento() +")";
   }

  

}
