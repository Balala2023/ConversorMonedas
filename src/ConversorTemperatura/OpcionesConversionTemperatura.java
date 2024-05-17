package ConversorTemperatura;

import javax.swing.text.html.Option;

public class OpcionesConversionTemperatura {
  ConversorTemperatura.ConvertirTemperaturas temperatura = new ConversorTemperatura.ConvertirTemperaturas();
  public OpcionesConversionTemperatura() {

  }
  public void ConvertirTemperaturas(double valor){
      String opcion;
      switch (opcion) {
          case "De Rankine a Fahrenheit":
              this.temperatura.ConvertirRankineFahrenheit(valor);
              break;
          case "De Rankine a Celsius":
              this.temperatura.ConvertirRankineCelsius(valor);
              break;
          case "De Fahrenheit a Celsius":
              this.temperatura.ConvertirFahrenheitCelsius(valor);
              break;
          case "De Fahrenheit a Rankine":
              this.temperatura.ConvertirFahrenheitRankine(valor);
              break;
          case "De Fahrenheit a Kelvin":
              this.temperatura.ConvertirFahrenheitKelvin(valor);
              break;
          case "De Rankine a Kelvin":
              this.temperatura.ConvertirRankineKelvin(valor);
              break;

          case "De Celsius a Fahrenheit":
              this.temperatura.ConvertirCelsiusFahrenheit(valor);
              break;

          case "De Kelvin a Fahrenheit":
              this.temperatura.ConvertirKelvinFahrenheit(valor);
              break;
          case "De Celsius a Kelvin":
              this.temperatura.ConvertirCelsiusKelvin(valor);
              break;

          case "De Celsius a Rankine":
              this.temperatura.ConvertirCelsiusRankine(valor);
              break;
          case "De Kelvin a Celsius":
              this.temperatura.ConvertirKelvinCelsius(valor);
              break;
          case "De Kelvin a Rankine":
              this.temperatura.ConvertirKelvinRankine(valor);
              break;
      }
  }
}