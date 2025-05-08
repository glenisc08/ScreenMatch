package src;

import java.util.Scanner;

public class Evaluaciones {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            double nota = 0;
            double mediaEvaluaciones = 0;
            double totalEvaluaciones = 0;
                        while (nota != -1){
                            System.out.println("Escribe la nota que le darias a la pelicula de Matrix");
                            nota = teclado.nextDouble();
                            mediaEvaluaciones += nota;
                            totalEvaluaciones++;
            }
            System.out.println("La media de evaluaciones para Matrix es: " + mediaEvaluaciones / totalEvaluaciones);
        }
    }
}

