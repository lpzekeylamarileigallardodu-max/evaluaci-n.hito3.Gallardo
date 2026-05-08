package com.evaluacion.estudiantes.service;

import org.springframework.stereotype.Service;

@Service
public class CalificacionesService {

    private int[] calificaciones = new int[110];
    private int contador = 0;

    public String agregar(int valor) {
        if (contador < 110) {
            calificaciones[contador] = valor;
            contador++;
            return "Calificación agregada: " + valor;
        }
        return "Arreglo lleno";
    }

    public int[] mostrarTodas() {
        return calificaciones;
    }

    public double promedio() {
        int suma = 0;
        for (int i = 0; i < contador; i++) {
            suma += calificaciones[i];
        }
        return contador == 0 ? 0 : (double) suma / contador;
    }

    public int max() {
        int max = calificaciones[0];
        for (int i = 1; i < contador; i++) {
            if (calificaciones[i] > max) max = calificaciones[i];
        }
        return max;
    }

    public int min() {
        int min = calificaciones[0];
        for (int i = 1; i < contador; i++) {
            if (calificaciones[i] < min) min = calificaciones[i];
        }
        return min;
    }
}