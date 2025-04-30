package screenmatch.Modelos;

public class Titulo {



    // private String nombre;

        // private int fechaDeLanzamiento;

        // private boolean incluidoEnPlan;

        // private double sumaDeLasEvaluaciones;

        // private int totalDelasEvaluaciones;

        // private int duracionEnMinutos;



        // public String getNombre() { return nombre; }

        // public int getFechaDeLanzamiento() { return fechaDeLanzamiento; }

        // public boolean isIncluidoEnPlan() { return incluidoEnPlan; }




    private String nombre;

    private int fechaDeLanzamiento;

    private int duracionEnMinutos;

    private double sumaDeLasEvaluaciones;

    private boolean incluidoEnPlan;

    private int totalDelasEvaluaciones;


    public Titulo(String nombre, int fechaDeLanzamiento) {
        this.nombre = nombre;
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public String getNombre() {
        return nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }


    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public boolean isIncluidoEnPlan() {
        return incluidoEnPlan;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public void setIncluidoEnPlan(boolean incluidoEnPlan) {
        this.incluidoEnPlan = incluidoEnPlan;
    }

    public int getTotalDelasEvaluaciones(){
        return totalDelasEvaluaciones;
    }


    public void muestraFichaTecnica() {
        System.out.println("Mi pelicula es: " + nombre);
        System.out.println("Su fecha de lazamiento es: " + fechaDeLanzamiento);
        System.out.println("Duracion en minutos: " + getDuracionEnMinutos());
    }

    public void evalua(double nota){
        sumaDeLasEvaluaciones += nota;
        totalDelasEvaluaciones++;
    }

    public double calculaMedia(){
        return sumaDeLasEvaluaciones / totalDelasEvaluaciones;
    }

}
