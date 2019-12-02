package com.company;

public class Main {

    public static void main(String[] args) {

        Serie listaSeries[] = new Serie[5];

        Videojuego listaVideoJuegos[] = new Videojuego[5];

        listaSeries[0] = new Serie();
        listaSeries[1] = new Serie("The Twilight Zone", "Rod Serling");
        listaSeries[2] = new Serie("Sherlock", 13, "Comedia", "Rachel Talalay");
        listaSeries[3] = new Serie("Avatar: la leyenda de Aang", 3, "animado", "Michael Dante DiMartino");
        listaSeries[4] = new Serie("Breaking Bad", 5, "Thriller", "Vince Gilligan");

        listaVideoJuegos [0] = new Videojuego();
        listaVideoJuegos [1] = new Videojuego("Super Mario Galaxy 2", 20, "Aventura", "Nintendo EAD");
        listaVideoJuegos [2] = new Videojuego("Final fantasy X","Square Enix");
        listaVideoJuegos [3] = new Videojuego("Super Mario 3DS", 30, "Aventura", "Nintendo");
        listaVideoJuegos [4] = new Videojuego("Metal Gear Solid", 80, "acción", "Konami");

        listaSeries[1].entregar();
        listaSeries[2].entregar();
        listaVideoJuegos[0].entregar();
        listaVideoJuegos[4].entregar();

        int entregados = 0;

        for (int i = 0; i < listaSeries.length; i++) {

            if (listaSeries[i].isEntregado()){
                entregados+=1;
                listaSeries[i].devolver();
            }

            if (listaVideoJuegos[i].isEntregado()){
                entregados+=1;
                listaVideoJuegos[i].devolver();
            }
        }

        System.out.println("\n" + "\tActualmente se tiene(n) " + entregados + " articulo(s) entregado(s)\n");

        Serie serieMayor=listaSeries[0];

        Videojuego videojuegoMayor=listaVideoJuegos[0];


        for(int i=1;i<listaSeries.length;i++){

            if(listaSeries[i].compareTo(serieMayor)==Serie.MAYOR){
                serieMayor=listaSeries[i];
            }

            if(listaVideoJuegos[i].compareTo(videojuegoMayor)==Videojuego.MAYOR){
                videojuegoMayor=listaVideoJuegos[i];
            }

        }

        System.out.println(videojuegoMayor);

        System.out.println(serieMayor);
    }

}


