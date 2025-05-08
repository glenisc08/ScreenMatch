package screenmatch.Principal;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import screenmatch.Excepcion.ErrorEnConversionDeDuracionExeption;
import screenmatch.Modelos.Titulo;
import screenmatch.Modelos.TituloOmdb;

public class PrincipalConBusqueda {
    public static void main(String[] args) throws IOException, InterruptedException {
        try (Scanner lectura = new Scanner(System.in)) {
            List<Titulo> titulos = new ArrayList<>();
            Gson gson = new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                    .setPrettyPrinting()
                    .create();

            while (true) {
                System.out.println("Escriba el nombre de la película (o 'salir' para terminar):");
                String busqueda = lectura.nextLine();

                if (busqueda.equalsIgnoreCase("salir")) {
                    break;
                }

                String direccion = "https://www.omdbapi.com/?t=" + busqueda.replace(" ", "+") + "&apikey=66c7bcb3";

                try {
                    HttpClient client = HttpClient.newHttpClient();
                    HttpRequest request = HttpRequest.newBuilder()
                            .uri(URI.create(direccion))
                            .build();
                    HttpResponse<String> response = client
                            .send(request, HttpResponse.BodyHandlers.ofString());

                    String json = response.body();
                    System.out.println("Respuesta de la API:\n" + json);

                    TituloOmdb miTituloOmdb = gson.fromJson(json, TituloOmdb.class);
                    System.out.println("Objeto TituloOmdb:\n" + miTituloOmdb);

                    Titulo miTitulo = new Titulo(miTituloOmdb);
                    System.out.println("Titulo convertido:\n" + miTitulo);

                    titulos.add(miTitulo);
                } catch (NumberFormatException e) {
                    System.out.println("Error al convertir un número: " + e.getMessage());
                } catch (IllegalArgumentException e) {
                    System.out.println("Error en la URI: " + e.getMessage());
                } catch (ErrorEnConversionDeDuracionExeption e) {
                    System.out.println(e.getMessage());
                }
            }

            // Imprimir información antes de escribir el archivo
            System.out.println("Lista de títulos a guardar:\n" + titulos);

            String currentDir = System.getProperty("user.dir");
            System.out.println("Directorio de trabajo actual: " + currentDir);

            File archivo = new File("titulos.json"); //Crear objeto File
            System.out.println("Ruta absoluta del archivo: " + archivo.getAbsolutePath());

            try {
                if (!archivo.exists()) {
                    boolean creado = archivo.createNewFile();
                    if (creado) {
                        System.out.println("Archivo creado exitosamente.");
                    } else {
                        System.out.println("No se pudo crear el archivo.");
                    }
                } else {
                    System.out.println("El archivo ya existe.");
                }


                FileWriter escritura = new FileWriter(archivo);
                gson.toJson(titulos, escritura);
                escritura.close();
                System.out.println("Archivo 'titulos.json' escrito exitosamente.");
            } catch (IOException e) {
                System.err.println("Error al escribir en el archivo: " + e.getMessage());
                e.printStackTrace(); // Imprimir el stack trace completo de la excepción
            }
        }
    }
}

