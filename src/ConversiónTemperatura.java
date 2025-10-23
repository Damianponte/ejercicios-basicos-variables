import java.util.Scanner;

public class ConversiónTemperatura {
    public static double celsiusAFahrenheit(double celsius) {
        double resultadoFarenheit= celsius*(9/5) + 32;
        return resultadoFarenheit;


                //Crea una función estática llamada celsiusAFahrenheit() que reciba una temperatura en Celsius
                 //  y devuelva su conversión a Fahrenheit usando la fórmula F = (C * 9/5) + 32.
                // Desde el main, pide una temperatura al usuario y muestra el resultado.
    }
        public static void main(String[] args) {
        System.out.println( " que temperatura hay " );
        Scanner entrada = new Scanner(System.in);
        double temperaturaCelsius=entrada.nextDouble();
        System.out.println( " la temperatura es:" + temperaturaCelsius + " grados celius ");
        


    }
}
