import java.util.Random;

public class Dado {
    public static int dado() {
        Random generator = new Random();
        int resultado = generator.nextInt(1,7);

        return resultado;
    }

    public static void main(String[] args) {
        //Crea una función estática llamada lanzarDado() que no reciba parámetros y devuelva un número aleatorio entre 1 y 6.
        //Desde main, llama a la función varias veces (por ejemplo, dentro de un for) y muestra cada lanzamiento.
        //Marcas: ejercicios básicos funciones


        for (int i =0;i<25;i++){
            int resultado=dado();
            System.out.println("ha salido la cara: "+resultado);
        }



        }

}
