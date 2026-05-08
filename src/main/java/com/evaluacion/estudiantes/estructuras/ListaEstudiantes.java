package com.evaluacion.estudiantes.estructuras;
import com.evaluacion.estudiantes.model.Estudiante;
import java.util.ArrayList;
import java.util.List;
public class ListaEstudiantes {
    private Nodo cabeza;
    public void insertar(Estudiante e) {
        Nodo nuevo = new Nodo(e);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            Nodo actual = cabeza;
            while (actual.siguiente != null)
                actual = actual.siguiente;
            actual.siguiente = nuevo;
        }
    }
    public List<Estudiante> mostrar() {
        List<Estudiante> lista = new ArrayList<>();
        Nodo actual = cabeza;
        while (actual != null) {
            lista.add(actual.estudiante);
            actual = actual.siguiente;
        }
        return lista;
    }
    public List<Estudiante> ordenadosAprobados() {
        List<Estudiante> aprobados = new ArrayList<>();
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.estudiante.puntaje >= 51)
                aprobados.add(actual.estudiante);
            actual = actual.siguiente;
        }
        for (int i = 0; i < aprobados.size() - 1; i++)
            for (int j = i + 1; j < aprobados.size(); j++)
                if (aprobados.get(j).puntaje > aprobados.get(i).puntaje) {
                    Estudiante temp = aprobados.get(i);
                    aprobados.set(i, aprobados.get(j));
                    aprobados.set(j, temp);
                }
        return aprobados;
    }
    public Estudiante buscar(String nombre) {
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.estudiante.nombre.equalsIgnoreCase(nombre))
                return actual.estudiante;
            actual = actual.siguiente;
        }
        return null;
    }
}
