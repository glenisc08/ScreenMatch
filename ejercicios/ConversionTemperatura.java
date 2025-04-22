package ejercicios;
public class ConversionTemperatura {
    public static void main(String[] args) {
        // Declaramos la temperatura en Celsius
        double temperaturaCelsius = 50.0;
        
        // Calculamos la temperatura en Fahrenheit usando la fórmula
        double temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;
        
        // Mostramos el resultado con decimales
        System.out.println(String.format("Temperatura en Celsius: %.2f°C", temperaturaCelsius));
        System.out.println(String.format("Temperatura en Fahrenheit: %.2f°F", temperaturaFahrenheit));
        
        // Convertimos a entero usando casting y mostramos sin decimales
        int temperaturaFahrenheitEntero = (int) temperaturaFahrenheit;
        System.out.println("Temperatura en Fahrenheit (sin decimales): " + temperaturaFahrenheitEntero + "°F");
    }
}
