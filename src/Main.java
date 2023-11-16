import java.util.Scanner;

public class conversion {
    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        double EUR;
        double resultado;

        System.out.println("/////////////////////////////////////////////////////////");

        System.out.println("debes ingresar el valor de EUR que desea convertir a USD");
        EUR = lector.nextDouble();


        resultado = (EUR * 1.07277);

        System.out.println("////////////////////////////////////////////////////////");

        System.out.println(EUR+"EUR es igual a"+" "+resultado+" "+"USD");

    }
}
