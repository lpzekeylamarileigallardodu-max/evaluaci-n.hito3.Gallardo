package com.evaluacion.estudiantes.service;
import com.evaluacion.estudiantes.estructuras.ListaEstudiantes;
import com.evaluacion.estudiantes.model.Estudiante;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class EstudiantesService {
    private ListaEstudiantes lista = new ListaEstudiantes();
    public String agregar(int id, String nombre, int puntaje) {
        lista.insertar(new Estudiante(id, nombre, puntaje));
        return "Estudiante agregado: " + nombre;
    }
    public List<Estudiante> mostrar() {
        return lista.mostrar();
    }
    public List<Estudiante> ordenados() {
        return lista.ordenadosAprobados();
    }
    public Estudiante buscar(String nombre) {
        return lista.buscar(nombre);
    }
}
