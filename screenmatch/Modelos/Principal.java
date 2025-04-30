package screenmatch.Modelos;

import java.util.ArrayList;

import screenmatch.Pelicula;
import screenmatch.Calculos.CalculadoraDeTiempo;
import screenmatch.Calculos.FiltroRecomendacion;

public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula("Coraline", 2007);
        miPelicula.setDuracionEnMinutos(100);
        miPelicula.setIncluidoEnPlan(true);

        miPelicula.muestraFichaTecnica();
        miPelicula.evalua(10);
        miPelicula.evalua(10);
        miPelicula.evalua(7.8);
        System.out.println(miPelicula.getTotalDelasEvaluaciones());
        System.out.println("Média de evaluaciones de la película: " + miPelicula.calculaMedia());

        Serie casaDragon = new Serie("La casa del Dragon", 2022);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodiosPorTemporada(10);
        casaDragon.muestraFichaTecnica();
        System.out.println(casaDragon.getDuracionEnMinutos());

        Pelicula otraPelicula = new Pelicula("Matrix", 1998);
        otraPelicula.setDuracionEnMinutos(180);

        CalculadoraDeTiempo calculadora = new CalculadoraDeTiempo();
        calculadora.incluye(miPelicula);
        calculadora.incluye(casaDragon);
        System.out.println(calculadora.getTiempoTotal());

        FiltroRecomendacion filtroRecomendacion = new FiltroRecomendacion();
        filtroRecomendacion.filtra(miPelicula);

        Episodio episodio = new Episodio();
        episodio.setNombre("Los Herederos del Dragón");
        episodio.setSerie(casaDragon);
        episodio.setTotalVisualizaciones(300);

        filtroRecomendacion.filtra(episodio); 


        var peliculaDeBruno = new Pelicula("El senior de los Anillos", 2001);
        peliculaDeBruno.setDuracionEnMinutos(188);


        ArrayList<Pelicula> ListaDePeliculas = new ArrayList<>();
        ListaDePeliculas.add(peliculaDeBruno);
        ListaDePeliculas.add(miPelicula);
        ListaDePeliculas.add(otraPelicula);

        System.out.println("Tamanio de la lista: " + ListaDePeliculas.size());
        System.out.println("La primera pelicula es: " + ListaDePeliculas.get(0).getNombre());

        System.out.println(ListaDePeliculas.toString());

        System.out.println("toString de la Pelicula: " + ListaDePeliculas.get(0).toString());





        
           
    }
}
