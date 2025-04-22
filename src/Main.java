package src;
public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenidos a Screen Match");
        System.out.println("Pelicula: Matrix");

        int fechaDeLanzamainto = 1999;
        @SuppressWarnings("unused")
        boolean incluidoEnElPlan = true;
        @SuppressWarnings("unused")
        double scoreDeLaPelicula = 8.2;

        double media = (8.2 + 6.0 + 9.0) / 3;
        System.out.println(media);

        String sinopsis = """
                Matrix es una paradoja
                La mejor pelicula del fin del milenio
                Fue lanazada en:
                """ + fechaDeLanzamainto;
         System.out.println(sinopsis);

         int clasificacion = (int) (media / 2);
         System.out.println(clasificacion);

    }
}
