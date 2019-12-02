package com.company;

public class Serie implements Entregable{

    private final static int NUMERO_TEMPORADAS = 3;

    public static final int MAYOR = 1;

    public static final int IGUAL = 0;

    public static final int MENOR = -1;

    private String titulo;

    private int numeroTemporadas;

    private boolean entregado;

    private String genero;

    private String creador;

    public Serie(){
        this("",NUMERO_TEMPORADAS, "", "");
    }

    public Serie(String titulo, String creador){
        this(titulo,NUMERO_TEMPORADAS, "", creador);
    }

    public Serie(String titulo, int numeroTemporadas, String genero, String creador){
        this.titulo=titulo;
        this.numeroTemporadas=numeroTemporadas;
        this.genero=genero;
        this.creador=creador;
        this.entregado=false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public static int getNumeroTemporadas() {
        return NUMERO_TEMPORADAS;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
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
        }
        return false;
    }

    public int compareTo(Object a){

        int comparar = MENOR;

        Serie serie = (Serie)a;

        if (numeroTemporadas>serie.getNumeroTemporadas()){

            comparar = MAYOR;

        }else if (numeroTemporadas==serie.getNumeroTemporadas()){

            comparar = IGUAL;

        }

        return comparar;

    }

    public String toString(){

        return "\tDatos de la serie\n" +
                "\tTítulo: " + titulo + "\n" +
                "\tNúmero de temporadas: " + numeroTemporadas + "\n" +
                "\tGénero: " + genero + "\n" +
                "\tCreador: " + creador + "\n";
    }

    public boolean iguales(Serie a){

        if (titulo.equalsIgnoreCase(a.getTitulo()) && creador.equalsIgnoreCase(a.getCreador())){
            return true;
        }
        return false;
    }
}