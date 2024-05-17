import ConversorMonedas.OpcionesConversion;
import ConversorTemperatura.OpcionesConversionTemperatura;
import java.awt.Component;
import javax.swing.JOptionPane;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        OpcionesConversion conversion = new OpcionesConversion();
        OpcionesConversionTemperatura conversionT = new OpcionesConversionTemperatura();
        String opciones = "";
        switch (opciones) {
            case "Conversor de Monedas":
                String input = JOptionPane.showInputDialog((Component)null, "Ingrese el valor a convertir");
                double valorRecibido = Double.parseDouble(input);
                conversion.ConvertirMonedas(valorRecibido);
                int respuesta = JOptionPane.showConfirmDialog((Component)null, "¿Desea realizar otra Conversión?");
                if (respuesta == 0) {
                    System.out.println("Entra");
                } else {
                    JOptionPane.showMessageDialog((Component)null, "Programa finalizado");
                }
                break;
            case "Conversor de Temperatura":
                String input1 = JOptionPane.showInputDialog((Component)null, "Ingrese el valor a convertir");
                double valorRecibidoT = Double.parseDouble(input1);
                conversionT.ConvertirTemperaturas(valorRecibidoT);
                int respuestaT = JOptionPane.showConfirmDialog((Component)null, "¿Desea realizar otra Conversión?");
                if (respuestaT == 0) {
                    System.out.println("Entra");
                } else {
                    JOptionPane.showMessageDialog((Component)null, "Programa finalizado");
                }
        }

    }
}