package com.company;

public class Serie implements Entregable{

    private final static int NUMERO_TEMPORADAS = 3; //Temporadas por defecto.

    public final static int MAYOR = 1; //Constante para indicar que una serie es mayor que otra.

    public final static int IGUAL = 0; //Constante para indicar que una serie es igual que otra.

    public final static int MENOR = -1; //Constante para indicar que una serie es menor que otra.

    private String titulo; //Título de la serie.

    private int numeroTemporadas; //Número de temporadas de la serie.

    private boolean prestado; //Indicar el estado de la serie.

    private String genero; //Género de la serie.

    private String creador; //Creador de la serie.

    //Constructor por defecto.
    public Serie(){

        this("",NUMERO_TEMPORADAS, "", "");
    }

    //Constructor con dos atributos(título, creador)
    public Serie(String titulo, String creador){

        this(titulo,NUMERO_TEMPORADAS, "", creador);
    }

    //Constructor con todos los atributos(título, número de temporadas, género, creador)
    public Serie(String titulo, int numeroTemporadas, String genero, String creador){
        this.titulo=titulo;
        this.numeroTemporadas=numeroTemporadas;
        this.genero=genero;
        this.creador=creador;
        this.prestado =false;
    }

    //Obtener el título de la serie.
    public String getTitulo() {
        return titulo;
    }

    //Modificar el título de la serie.
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    //Obtener el número de  temporadas de la serie.
    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    //Modificar el número de temporadas de la serie.
    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    //Obtener el género de la serie.
    public String getGenero() {
        return genero;
    }

    //Modificar el género de la serie.
    public void setGenero(String genero) {
        this.genero = genero;
    }

    //Obtener el creador de la serie.
    public String getCreador() {

        return creador;
    }

    //Modificar el creador de la serie.
    public void setCreador(String creador) {
        this.creador = creador;
    }

    //Método (entregar) para cambiar el atributo prestado a true.
    public void entregar(){
        prestado = true;
    }

    //Método (devolver) para cambiar el atributo prestado a false.
    public void devolver(){
        prestado = false;
    }

    //Método para devolver el estado de prestado.
    public boolean isEntregado(){

        if (prestado){
            return true;
        }
        return false;
    }

    //Método para comparar el número de temporadas de una serie.
    public int compareTo(Object a){

        int compare = MENOR;
        Serie serie = (Serie)a;

        if (numeroTemporadas>serie.getNumeroTemporadas()){
            compare = MAYOR;
        }else if (numeroTemporadas==serie.getNumeroTemporadas()){
            compare = IGUAL;
        }
        return compare;
    }

    //Desplegar en pantalla la información de la serie.
    public String toString(){

        return "***Información de la serie con más temporadas***\n" + "Título: " + titulo + "\n"
                + "Número de temporadas: " + numeroTemporadas + "\n" + "Género: " + genero + "\n" + "Creador: "
                + creador + "\n";
    }
}