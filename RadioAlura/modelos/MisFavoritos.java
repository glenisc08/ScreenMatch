package RadioAlura.modelos;

public class MisFavoritos {
    public void adicione(Audio audio){
        if(audio.getClasificacion() >= 8){
            System.out.println(audio.getTitulo() +  "Favorito del momento");
        } else {
            System.out.println(audio.getTitulo() +  "Mejores reviews");
        }
    }
}
