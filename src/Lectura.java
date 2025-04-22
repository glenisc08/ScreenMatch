package src;

import java.util.Scanner;

public class Lectura {
    
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            System.out.println("Por favor, escribe el nombre de una película:");
            String pelicula = teclado.nextLine();
            System.out.println("Ahora escribe la fecha de lanzamiento:");
            int fechaDeLanzamiento = teclado.nextInt();
            System.out.println("Dinos qué nota le das a esta película:");
            double nota = teclado.nextDouble();

            System.out.println("\nResumen:");
            System.out.println("Película: " + pelicula);
            System.out.println("Año de lanzamiento: " + fechaDeLanzamiento);
            System.out.println("Nota: " + nota);
        }
    }
}