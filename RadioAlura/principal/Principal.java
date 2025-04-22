package RadioAlura.principal;

import RadioAlura.modelos.Cancion;
import RadioAlura.modelos.MisFavoritos;
import RadioAlura.modelos.Podcast;

public class Principal {
    
    public static void main(String[] args) {
        Cancion miCancion = new Cancion();
        miCancion.setTitulo("WildFlower ");
        miCancion.setCantante("Billie Eilish ");
        

        Podcast miPodcast = new Podcast();
        miPodcast.setPresentador("Gabriela Aguilar ");
        miPodcast.setTitulo("Cafe.Tech ");

        //cancion
        for (int i = 0; i < 15000; i++) {
            miCancion.meGusta();
        }
        for (int i = 0; i < 200; i++) {
            miCancion.reproduce();
        }

        //podcast
        for (int i = 0; i < 100; i++) {
            miPodcast.meGusta();
        }
        for (int i = 0; i < 8000; i++) {
            miPodcast.reproduce();
        }

        System.out.println("Total reproducciones: " + miCancion.getTotalDeReproducciones());
        System.out.println("Total de Me Gusta: " + miCancion.getTotalDeMeGusta());

        MisFavoritos favoritos = new MisFavoritos();
        favoritos.adicione(miPodcast);
        favoritos.adicione(miCancion);
    }
}
