import java.util.Scanner;

public class ejercicioResta {
    public static int resta(int a, int b){
        int resultado =a-b;
        return resultado;

    }
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int a;
        int b;
        System.out.println("Ingrese el valor de a:");
        a=entrada.nextInt();
        System.out.println("ingrese el valor de b");
         b=entrada.nextInt();


        int resultadoResta= resta(a,b);
        String resultadoaimprimir=( " la resta es: " + a + " - " + b + " = " + resultadoResta);
        System.out.println(resultadoaimprimir);


    }

}
