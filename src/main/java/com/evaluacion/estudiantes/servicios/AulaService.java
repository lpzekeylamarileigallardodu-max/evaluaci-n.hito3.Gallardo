package com.evaluacion.estudiantes.service;
import org.springframework.stereotype.Service;
@Service
public class AulaService {
    private int[][] aula = new int[5][15];
    public String ocupar(int fila, int columna) {
        aula[fila][columna] = 1;
        return "Asiento ocupado: fila " + fila + " columna " + columna;
    }
    public String liberar(int fila, int columna) {
        aula[fila][columna] = 0;
        return "Asiento liberado: fila " + fila + " columna " + columna;
    }
    public int[][] mostrar() {
        return aula;
    }
    public int contarOcupados() {
        int count = 0;
        for (int i = 0; i < 5; i++)
            for (int j = 0; j < 15; j++)
                if (aula[i][j] == 1) count++;
        return count;
    }
}
