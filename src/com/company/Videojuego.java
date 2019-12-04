package com.company;

public class Videojuego implements Entregable {


    private final static double HORAS_ESTIMADAS = 10;

    public static final int MAYOR = 1; //Constante para indicar que un videojuego es mayor que otro.

    public static final int IGUAL = 0; //Constante para indicar que un videojuego es igual que otro.

    public static final int MENOR = -1; //Constante para indicar que un videojuego es menor que otro.

    private String titulo; //Título del videojuego.

    private double horaEstimadas; //Número de horas estimadas del videojuego.

    private boolean entregado; //Indicar el estado del videojuego.

    private String genero; //Género del videojuego.

    private String compañia; //Creador del videojuego.

    //Constructor por defecto.
    public Videojuego() {

        this("", HORAS_ESTIMADAS, "", "");

    }

    //Constructor con dos atributos(título, compañia)
    public Videojuego(String titulo, String compañia) {

        this(titulo, HORAS_ESTIMADAS, "", compañia);

    }

    //Constructor con todos los atributos(título, horas estimadas, género, compañia)
    public Videojuego(String titulo, double horaEstimadas, String genero, String compañia) {

        this.titulo = titulo;
        this.horaEstimadas = horaEstimadas;
        this.entregado = false;
        this.genero = genero;
        this.compañia = compañia;

    }

    //Obtener el título del videojuego.
    public String getTitulo() {
        return titulo;
    }

    //Modificar el título del videojuego.
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    //Obtener el número de  horas estimadas del videojuego.
    public double getHoraEstimadas() {
        return horaEstimadas;
    }

    //Modificar el número de horas estimadas del videojuego.
    public void setHoraEstimadas(double horaEstimadas) {
        this.horaEstimadas = horaEstimadas;
    }

    //Obtener el género del videojuego.
    public String getGenero() {
        return genero;
    }

    //Modificar el género del videojuego.
    public void setGenero(String genero) {
        this.genero = genero;
    }

    //Obtener el creador del videojuego.
    public String getCompañia() {
        return compañia;
    }

    //Modificar el creador del videojuego.
    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }

    //Método (entregar) para cambiar el atributo prestado a true.
    public void entregar(){
        entregado = true;
    }

    //Método (devolver) para cambiar el atributo prestado a false.
    public void devolver(){
        entregado = false;
    }

    //Método para devolver el estado de prestado.
    public boolean isEntregado(){

        if (entregado){
            return true;
        }else {
            return false;
        }
    }

    //Método para comparar las horas estimadas de un videojuego.
    public int compareTo(Object a){

        int comparar = MENOR;

        Videojuego videojuego = (Videojuego) a;

        if (horaEstimadas>videojuego.getHoraEstimadas()){
            comparar = MAYOR;
        }else if (horaEstimadas==videojuego.getHoraEstimadas()){
            comparar = IGUAL;
        }
        return comparar;
    }

    //Desplegar en pantalla la información del videojuego.
    public String toString(){

        return
                "***Información del videojuego con más horas estimadas***\n" + "Título: " + titulo + "\n" +
                        "Horas estimadas: " + horaEstimadas + "\n" + "Género: " + genero + "\n" + "Compañía: " +
                        compañia + "\n";
    }
}