package com.company;

public class Videojuego implements Entregable {


    private final static double HORAS_ESTIMADAS = 10;

    public static final int MAYOR = 1;

    public static final int IGUAL = 0;

    public static final int MENOR = -1;

    private String titulo;

    private double horaEstimadas;

    private boolean entregado;

    private String genero;

    private String compañia;

    public Videojuego() {

        this("", HORAS_ESTIMADAS, "", "");

    }

    public Videojuego(String titulo, String compañia) {

        this(titulo, HORAS_ESTIMADAS, "", compañia);

    }

    public Videojuego(String titulo, double horaEstimadas, boolean entregado, String genero, String compañia) {

        this.titulo = titulo;
        this.horaEstimadas = horaEstimadas;
        this.entregado = false;
        this.genero = genero;
        this.compañia = compañia;

    }

    public Videojuego(String titulo, double horaEstimadas) {
        this.titulo = titulo;
        this.horaEstimadas = horaEstimadas;
    }

    public Videojuego(String titulo, double horaEstimadas, String genero, String compañia) {
        this.titulo = titulo;
        this.horaEstimadas = horaEstimadas;
        this.genero = genero;
        this.compañia = compañia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getHoraEstimadas() {
        return horaEstimadas;
    }

    public void setHoraEstimadas(double horaEstimadas) {
        this.horaEstimadas = horaEstimadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompañia() {
        return compañia;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }

    public void entregar(){

        entregado = true;

    }

    public void devolver(){

        entregado = false;

    }

    public boolean isEntregado(){

        if (entregado){

            return true;

        }else {

            return false;
        }
    }

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

    public String toString(){

        return "\tDatos del videojuego\n" +
                "\tTítulo: " + titulo + "\n" +
                "\tHoras estimadas: " + horaEstimadas + "\n" +
                "\tGénero: " + genero + "\n" +
                "\tCompañía: " + compañia + "\n";
    }

    public boolean iguales(Videojuego a){

        if (titulo.equalsIgnoreCase(a.getTitulo()) && compañia.equalsIgnoreCase(a.getCompañia())){

            return true;

        }else {

            return false;

        }
    }
}
