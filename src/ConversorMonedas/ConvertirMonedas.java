//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package ConversorMonedas;

import java.awt.Component;
import javax.swing.JOptionPane;

public class ConvertirMonedas {
    public ConvertirMonedas() {
    }

    public void ConvertirPesosArgentinoDolares(double valor) {
        double monedaDolar = valor / 137.68;
        monedaDolar = (double)Math.round(monedaDolar * 100.0) / 100.0;
        JOptionPane.showMessageDialog((Component)null, "Tienes $ " + monedaDolar + " Dolares");
    }

    public void ConvertirPesosArgentinoEuros(double valor) {
        double monedaEuro = valor / 137.2;
        monedaEuro = (double)Math.round(monedaEuro * 100.0) / 100.0;
        JOptionPane.showMessageDialog((Component)null, "Tienes $ " + monedaEuro + " Euros");
    }

    public void ConvertirPesosArgentinoLibra(double valor) {
        double monedaLibra = valor / 161.52;
        monedaLibra = (double)Math.round(monedaLibra * 100.0) / 100.0;
        JOptionPane.showMessageDialog((Component)null, "Tienes $ " + monedaLibra + " Libras Esterlinas");
    }

    public void ConvertirPesosArgentinoYen(double valor) {
        double monedaYen = valor / 1.0;
        monedaYen = (double)Math.round(monedaYen * 100.0) / 100.0;
        JOptionPane.showMessageDialog((Component)null, "Tienes $ " + monedaYen + " Yen Japonés");
    }

    public void ConvertirPesosArgentinoWon(double valor) {
        double monedaWon = valor / 0.1;
        monedaWon = (double)Math.round(monedaWon * 100.0) / 100.0;
        JOptionPane.showMessageDialog((Component)null, "Tienes $ " + monedaWon + " Won sub-coreano");
    }

    public void ConvertirDolaresPesosArgentino(double valor) {
        double monedaDolar = 137.68 * valor;
        monedaDolar = (double)Math.round(monedaDolar * 100.0) / 100.0;
        JOptionPane.showMessageDialog((Component)null, "Tienes Dolares " + monedaDolar + " en pesos");
    }

    public void ConvertirEurosPesosArgentino(double valor) {
        double monedaEuro = valor * 137.2;
        monedaEuro = (double)Math.round(monedaEuro * 100.0) / 100.0;
        JOptionPane.showMessageDialog((Component)null, "Tienes Euros " + monedaEuro + " en pesos");
    }

    public void ConvertirLibraPesosArgentino(double valor) {
        double monedaLibra = valor * 161.52;
        monedaLibra = (double)Math.round(monedaLibra * 100.0) / 100.0;
        JOptionPane.showMessageDialog((Component)null, "Tienes Libras Esterlinas " + monedaLibra + " en pesos");
    }

    public void ConvertirYenPesosArgentino(double valor) {
        double monedaYen = valor * 1.0;
        monedaYen = (double)Math.round(monedaYen * 100.0) / 100.0;
        JOptionPane.showMessageDialog((Component)null, "Tienes Yen Japonés " + monedaYen + " en pesos");
    }

    public void ConvertirWonPesosArgentino(double valor) {
        double monedaWon = valor * 0.1;
        monedaWon = (double)Math.round(monedaWon * 100.0) / 100.0;
        JOptionPane.showMessageDialog((Component)null, "Tienes Won sub-coreano " + monedaWon + " en pesos");
    }
}
