package taller5;

import javax.swing.JOptionPane;

public class Ejercicio3 {

    public static double calcularArea(double base, double altura) {
        return base * altura;
    }

    public static double calcularPerimetro(double base, double altura) {
        return 2 * (base + altura);
    }

    public static void main(String[] args) {
        double base = Double.parseDouble(
                JOptionPane.showInputDialog("Base del rectángulo:"));
        double altura = Double.parseDouble(
                JOptionPane.showInputDialog("Altura del rectángulo:"));

        JOptionPane.showMessageDialog(null,
                "Área: " + String.format("%.2f", calcularArea(base, altura)) + "\n" +
                "Perímetro: " + String.format("%.2f", calcularPerimetro(base, altura)));
    }
}
