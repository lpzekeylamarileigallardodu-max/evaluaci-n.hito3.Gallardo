package com.evaluacion.estudiantes.estructuras;

import com.evaluacion.estudiantes.model.Estudiante;

public class Nodo {
    public Estudiante estudiante;
    public Nodo siguiente;

    public Nodo(Estudiante estudiante) {
        this.estudiante = estudiante;
        this.siguiente = null;
    }
}