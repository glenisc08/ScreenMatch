package src;

public class Decisiones {
    
    public static void main(String[] args) {
        int fechaDeLanzamainto = 1999;
        boolean incluidoEnElPlan = true;
        @SuppressWarnings("unused")
        double scoreDeLaPelicula = 8.2;
        String tipoplan = "plus";

        if (fechaDeLanzamainto >= 2022){
            System.out.println("Peliculas mas ppulares");
        }else {
            System.out.println("Peliculas Retro que aun vale la pena ver");
        }

        if (incluidoEnElPlan || tipoplan.equals("plus")){
            System.out.println("Disfrute de su pelicula");
        } else {
            System.out.println("Pelicula no disponible para su plan actual");
        }
    }
}
