package com.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<EspacioCultural> lugares = new ArrayList<>();

        lugares.add(new JardinBotanico());
        lugares.add(new MuseoDeAntioquia());
        lugares.add(new ParqueExplora());

        for (EspacioCultural lugar : lugares) {
            if (lugar instanceof JardinBotanico) {
                System.out.println("Lugar: Jardin Botanico");
            } else if (lugar instanceof MuseoDeAntioquia) {
                System.out.println("Lugar: Museo De Antioquia");
            } else if (lugar instanceof ParqueExplora) {
                System.out.println("Lugar: Parque Explora");
            }

            lugar.mostrarHorario();
            System.out.println("Requisito: " + lugar.obtenerRequisitoEntrada());
            lugar.realizarActividadPrincipal();
            System.out.println("------------------------------");
        }
    }
}
