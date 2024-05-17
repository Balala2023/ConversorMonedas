package ConversorMonedas;

public class OpcionesConversion {
    ConvertirMonedas monedas = new ConvertirMonedas();

    public OpcionesConversion(){
    }

    public void ConvertirMonedas(double valor){

        switch (opcion){

            case "De Pesos a Dólar":
                this.monedas.ConvertirPesosColombianosDolar(valor);
                break;

            case "De Pesos a Euros":
                this.monedas.ConvertirPesosColombianosEuros(valor);
                break;

            case "De Pesos a Libras Esterlinas":
                this.monedas.ConvertirPesosColombianosLibras(valor);
                break;

            case "De Pesos a Yen Japonés":
                this.monedas.ConvertirPesosColombianosYen(valor);
                break;

            case "De Pesos a Won sul-coreano":
                this.monedas.ConvertirPesosColombianosWon(valor);
                break;

            case "De Dólar a Pesos ":
                this.monedas.ConvertirDolaresPesosColombianos(valor);
                break;

            case "De Euros a Pesos":
                this.monedas.ConvertirEurosPesosColombianos(valor);
                break;


            case "De Libras Esterlinas a Pesos":
                this.monedas.ConvertirLibrasPesosColombianos(valor);
                break;


            case "De Yen Japonés a Pesos":
                this.monedas.ConvertirYenPesosColombianos(valor);
                break;


            case "De Won sul-coreano a Pesos":
                this.monedas.ConvertirWonPesosColombianos(valor);
                break;

        }
    }
}
