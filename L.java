import java.util.Scanner;

public class L {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa el primer dato: ");

        String dato1 = entrada.nextLine();

        System.out.print("Ingresa el segundo dato: ");

        String dato2 = entrada.nextLine();

        Object obj1;

        Object obj2;


        if (dato1.equalsIgnoreCase("true")

                || dato1.equalsIgnoreCase("false")) {

            obj1 = Boolean.parseBoolean(dato1);

        } else {

            try {

                obj1 = Double.parseDouble(dato1);

            } catch (NumberFormatException e) {

                obj1 = dato1;

            }

        }


        if (dato2.equalsIgnoreCase("true")

                || dato2.equalsIgnoreCase("false")) {

            obj2 = Boolean.parseBoolean(dato2);

        } else {

            try {

                obj2 = Double.parseDouble(dato2);

            } catch (NumberFormatException e) {

                obj2 = dato2;

            }

        }

        System.out.println();

        System.out.println("===== OPERACIONES =====");

        System.out.println("1. Restar");

        System.out.println("2. Sumar");

        System.out.println("3. Multiplicar");

        System.out.println("4. Concatenar");

        System.out.print("Realizar la operación: ");

        int operacion = entrada.nextInt();

        // MANDAR A LLAMAR A Ejem6

        Ejem6<Object, Object> obj =

                new Ejem6<>(obj1, obj2);

        obj.operar(operacion);

        entrada.close();

    }

}
