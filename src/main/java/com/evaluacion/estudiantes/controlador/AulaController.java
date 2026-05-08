package com.evaluacion.estudiantes.controller;
import com.evaluacion.estudiantes.service.AulaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/aula")
public class AulaController {
    @Autowired
    private AulaService service;
    @GetMapping
    public int[][] mostrar() {
        return service.mostrar();
    }
    @GetMapping("/ocupados")
    public int ocupados() {
        return service.contarOcupados();
    }
    @GetMapping("/ocupar")
    public String ocupar(@RequestParam int fila, @RequestParam int columna) {
        return service.ocupar(fila, columna);
    }
    @GetMapping("/liberar")
    public String liberar(@RequestParam int fila, @RequestParam int columna) {
        return service.liberar(fila, columna);
    }
}
