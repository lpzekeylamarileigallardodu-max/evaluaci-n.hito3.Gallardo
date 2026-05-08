package com.evaluacion.estudiantes.controller;
import com.evaluacion.estudiantes.service.CalificacionesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/notas")
public class NotasController {
    @Autowired
    private CalificacionesService service;
    @GetMapping("/agregar")
    public String agregar(@RequestParam int valor) {
        return service.agregar(valor);
    }
    @GetMapping
    public int[] mostrar() {
        return service.mostrarTodas();
    }
    @GetMapping("/promedio")
    public double promedio() {
        return service.promedio();
    }
    @GetMapping("/max")
    public int max() {
        return service.max();
    }
    @GetMapping("/min")
    public int min() {
        return service.min();
    }
}
