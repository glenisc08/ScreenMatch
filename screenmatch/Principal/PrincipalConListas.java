package screenmatch.Principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import screenmatch.Modelos.Pelicula;
import screenmatch.Modelos.Serie;
import screenmatch.Modelos.Titulo;

public class PrincipalConListas {
    public static void main(String[] args) {
                Pelicula miPelicula = new Pelicula("Coraline", 2007);
                miPelicula.evalua(9);
                Pelicula otraPelicula = new Pelicula("Matrix", 1998);
                otraPelicula.evalua(6);
                var peliculaDeBruno = new Pelicula("El senior de los Anillos", 2001);
                peliculaDeBruno.evalua(10);
                Serie casaDragon = new Serie("La casa del Dragon", 2022);

                // Pelicula p1 = miPelicula;


                ArrayList<Titulo> lista = new ArrayList<>();
                lista.add(miPelicula);
                lista.add(otraPelicula);
                lista.add(peliculaDeBruno);
                lista.add(casaDragon);

                for (Titulo item : lista) {
                    System.out.println(item.getNombre());
                    if (item instanceof Pelicula pelicula && pelicula.getClasificacion() > 2){
                        System.out.println(pelicula.getClasificacion());
                    }
                   
                    ArrayList<String> listaDeActores = new ArrayList<>();
                    listaDeActores.add("Dakota Fanning");
                    listaDeActores.add("Keanu Reeves");
                    listaDeActores.add("Elijah Wood");

                    Collections.sort(listaDeActores);
                    System.out.println("Lista de actores ordenada: " + listaDeActores);

                    Collections.sort(lista);
                    System.out.println("Lista de titulos ordenados: " + lista);

                    lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));
                    System.out.println("Lista ordenada por fecha: "+lista);
                }

    }
}
