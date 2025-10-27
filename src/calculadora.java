import java.util.Scanner;

public class calculadora {
    public static int suma(int a,int b){
        int resultado= a+b;
        return resultado;
    }
    public static int resta(int a,int b){
        int resultado= a-b;
        return resultado;
    }
    public static int multipicacion (int a, int b){
        int resultado=a*b;
        return resultado;
    }
    public static double division(double a, double b){
        double resultado=a/b;

        return resultado;
    }

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        int a;
        int b;
        System.out.println("Ingrese el valor de a: ");
        a = lector.nextInt();

        System.out.println("ingrese el valor de b: ");
        b = lector.nextInt();
        System.out.println( "que operación quieres que haga" );
        System.out.println(" ingrese: +, -, /, *");
        String entrada = lector.next();
        if (entrada.equals("+")){
            int resultado = suma(a,b);
            System.out.println(" el resultado es : " + resultado);
        } else if (entrada.equals(" - ")) {
            int resultado = resta(a, b);
            System.out.println(" el resultado es : " + resultado);
        } else if (entrada.equals(" * ")) {
            int resultado = multipicacion(a, b);
            System.out.println(" el resultado es : " + resultado);
        } else{
            double resultado = division(a, b);
            boolean numerob=true;
            while(b==0){
                if (numerob==true){
                    System.out.println(" Error");
                    System.out.println("numero divido por 0");
                    System.out.println("elije otro numero");
                    b = lector.nextInt();
                }else{
                    System.out.println(" el resultado es : " + resultado);
                }

                numerob=!numerob;
            }

        }

    }
}
