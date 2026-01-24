package pitercoding.devdojo.exercicios.b2arrayslacoscondicionais;

/**
 * Task 6 — Matriz de vendas
 * “Relatório de vendas por semana.”
 */
public class MatrizDeVendas {
    public static void main(String[] args) {

        int[][] vendas = {
                {10, 20, 30, 40, 50, 60, 70},   // semana 1
                {15, 25, 35, 45, 55, 65, 75},   // semana 2
                {5,  10, 15, 20, 25, 30, 35},   // semana 3
                {100, 90, 80, 70, 60, 50, 40}   // semana 4
        };

        for (int semana = 0; semana < vendas.length; semana++) {
            int totalSemana = 0;

            for (int dia = 0; dia < vendas[semana].length; dia++) {
                totalSemana += vendas[semana][dia];
            }
            System.out.println("Total da semana " + (semana + 1) + ": " + totalSemana);
        }
    }
}
