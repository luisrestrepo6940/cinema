package com.company;

public class Main {

    public static void main(String[] args) {

        //Declarar y crear array de Series con 5 posiciones.
        Serie listaSeries[] = new Serie[5];

        //Declarar y crear array de videojuegos con 5 posiciones. 
        Videojuego listaVideoJuegos[] = new Videojuego[5];

        //Inicializar cada posición del array de series.
        listaSeries[0] = new Serie();
        listaSeries[1] = new Serie("The Twilight Zone", "Rod Serling");
        listaSeries[2] = new Serie("Breaking Bad", 2, "Comedia",
                "Vince Gilligan");
        listaSeries[3] = new Serie("Avatar; la leyenda de Aang", 5, "Animado",
                "Michael Dante DiMartino");
        listaSeries[4] = new Serie("Breaking Bad", 8, "Thriller",
                "Vince Gilligan");

        //Inicializar cada posición del array de videojuegos.
        listaVideoJuegos [0] = new Videojuego();
        listaVideoJuegos [1] = new Videojuego("Super Mario Galaxy 2", 10.5, "Aventura",
                "Nintendo EAD");
        listaVideoJuegos [2] = new Videojuego("Final fantasy X","Square Enix");
        listaVideoJuegos [3] = new Videojuego("Super Mario 3DS", 8, "Aventura",
                "Nintendo");
        listaVideoJuegos [4] = new Videojuego("Metal Gear Solid", 9, "Acción",
                "Konami");

        //Entregar 3 series con el método entregar().
        listaSeries[0].entregar();
        listaSeries[3].entregar();
        listaSeries[4].entregar();

        //Entregar 2 Videojuegos con el método entregar().
        listaVideoJuegos[0].entregar();
        listaVideoJuegos[3].entregar();
        //listaVideoJuegos[4].entregar();

        //listaSeries[4].devolver();

        //Contar y devolver las series y los videojuegos entregados.
        int seriesPrestadas = 0;
        int videojuegosPrestados = 0;

        for (int i = 0; i < listaSeries.length; i++) {

            if (listaSeries[i].isEntregado()){
                seriesPrestadas += 1;
            }

            if (listaVideoJuegos[i].isEntregado()){
                videojuegosPrestados += 1;
            }
        }

        System.out.println("\n" + "Actualmente se tiene(n) " + seriesPrestadas + " series y " + videojuegosPrestados +
                " videojuego(s) entregado(s)\n");

        //Crear dos objetos en la primera posición de cada array.
        Serie serieMayor = listaSeries[0];
        Videojuego videojuegoMayor = listaVideoJuegos[0];

        //Obtener y desplegar en pantalla el videojuego que tiene más horas estimadas y la serie con más temporadas.
        for(int i=0;i<listaSeries.length;i++){

            if(listaSeries[i].compareTo(serieMayor)==Serie.MAYOR){
                serieMayor=listaSeries[i];
            }

            if(listaVideoJuegos[i].compareTo(videojuegoMayor)==Videojuego.MAYOR){
                videojuegoMayor=listaVideoJuegos[i];
            }
        }
        System.out.println(serieMayor);
        System.out.println(videojuegoMayor);
    }
}


