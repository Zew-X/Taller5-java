package taller5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ejercicio2 {

    public static double calcularPromedio(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3.0;
    }

    public static String obtenerEstado(double promedio) {
        if (promedio >= 70) {
            return "APROBADO";
        } else {
            return "REPROBADO";
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Nota 1:");
        double n1 = Double.parseDouble(lector.readLine());
        System.out.println("Nota 2:");
        double n2 = Double.parseDouble(lector.readLine());
        System.out.println("Nota 3:");
        double n3 = Double.parseDouble(lector.readLine());

        double promedio = calcularPromedio(n1, n2, n3);

        System.out.println("Promedio: " + String.format("%.2f", promedio));
        System.out.println("Estado: " + obtenerEstado(promedio));
    }
}
