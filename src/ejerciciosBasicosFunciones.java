import java.util.Scanner;

public class ejerciciosBasicosFunciones {
    public static void saludar(String nombreEntrada) {
        System.out.println("bienvenido" + nombreEntrada + " a la programacion");
    }
        public static void main(String[] args) {
            // Saludo personalizado
            //Crea una función estática llamada saludar() que reciba un nombre como parámetro (String)
            //      y muestre por pantalla:
            //"¡Hola, [nombre]! Bienvenido al servidor de programación."
            //Desde main, pide el nombre por teclado y llama a la función.
            Scanner lector=new Scanner(System.in);
            System.out.println("¿cual es tu nombre?");
            String nombre=lector.nextLine();
            saludar(nombre);


        }


}
