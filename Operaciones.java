import java.util.Scanner;

public class Operaciones<T> {

    private T obj1;

    private T obj2;

    public Operaciones(T obj1, T obj2) {

        this.obj1 = obj1;

        this.obj2 = obj2;

    }

    public void operar(String operacion) {

        // Si los dos objetos son números

        if (obj1 instanceof Number && obj2 instanceof Number) {

            double num1 = ((Number) obj1).doubleValue();

            double num2 = ((Number) obj2).doubleValue();

            if (operacion.equalsIgnoreCase("suma")) {

                System.out.println("Resultado: " + (num1 + num2));

            } else if (operacion.equalsIgnoreCase("resta")) {

                System.out.println("Resultado: " + (num1 - num2));

            } else if (operacion.equalsIgnoreCase("multiplicacion")) {

                System.out.println("Resultado: " + (num1 * num2));

            } else {

                System.out.println("Operación no válida.");

            }

        // Si son cadenas o caracteres

        } else if ((obj1 instanceof String || obj1 instanceof Character) &&

                   (obj2 instanceof String || obj2 instanceof Character)) {

            if (operacion.equalsIgnoreCase("concatenar")) {

                System.out.println("Resultado: " + obj1 + obj2);

            } else {

                System.out.println(

                    "Con cadenas o caracteres solo se puede concatenar."

                );

            }

        // Si alguno es Boolean

        } else if (obj1 instanceof Boolean || obj2 instanceof Boolean) {

            System.out.println(

                "No se pueden realizar operaciones con Boolean."

            );

        // Si son tipos diferentes

        } else {

            System.out.println("Los tipos de datos no son compatibles.");

        }

    }

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingresa el primer dato: ");

        String dato1 = entrada.nextLine();

        System.out.print("Ingresa el segundo dato: ");

        String dato2 = entrada.nextLine();

        Object obj1;

        Object obj2;

        // Detectar el tipo del primer dato

        if (dato1.equalsIgnoreCase("true") ||

            dato1.equalsIgnoreCase("false")) {

            obj1 = Boolean.parseBoolean(dato1);

        } else {

            try {

                obj1 = Double.parseDouble(dato1);

            } catch (NumberFormatException e) {

                obj1 = dato1;

            }

        }

        // Detectar el tipo del segundo dato

        if (dato2.equalsIgnoreCase("true") ||

            dato2.equalsIgnoreCase("false")) {

            obj2 = Boolean.parseBoolean(dato2);

        } else {

            try {

                obj2 = Double.parseDouble(dato2);

            } catch (NumberFormatException e) {

                obj2 = dato2;

            }

        }

        System.out.print(

            "¿Qué operación deseas realizar? "

        );

        String operacion = entrada.nextLine();

        // Crear el objeto genérico

        Operaciones<Object> objetos =

                new Operaciones<>(obj1, obj2);

        objetos.operar(operacion);

        entrada.close();

    }
}