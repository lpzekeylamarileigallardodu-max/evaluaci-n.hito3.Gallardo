package com.evaluacion.estudiantes.controller;
import com.evaluacion.estudiantes.model.Estudiante;
import com.evaluacion.estudiantes.service.EstudiantesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/estudiantes")
public class EstudiantesController {
    @Autowired
    private EstudiantesService service;
    @GetMapping("/agregar")
    public String agregar(@RequestParam int id, @RequestParam String nombre, @RequestParam int puntaje) {
        return service.agregar(id, nombre, puntaje);
    }
    @GetMapping
    public List<Estudiante> mostrar() {
        return service.mostrar();
    }
    @GetMapping("/ordenados")
    public List<Estudiante> ordenados() {
        return service.ordenados();
    }
    @GetMapping("/buscar/{nombre}")
    public Estudiante buscar(@PathVariable String nombre) {
        return service.buscar(nombre);
    }
}
