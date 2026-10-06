public class Ejem6<T, U> {

    T obj1;

    U obj2;

    public Ejem6(T obj1, U obj2) {

        this.obj1 = obj1;

        this.obj2 = obj2;

    }

    public void operar(int operacion) {

        // NUMEROS

        if (obj1 instanceof Number && obj2 instanceof Number) {

            double num1 = ((Number) obj1).doubleValue();

            double num2 = ((Number) obj2).doubleValue();

            switch (operacion) {

                case 1:

                    System.out.println("Resultado: " + (num1 - num2));

                    break;

                case 2:

                    System.out.println("Resultado: " + (num1 + num2));

                    break;

                case 3:

                    System.out.println("Resultado: " + (num1 * num2));

                    break;

                default:

                    System.out.println("Operacion no valida.");

            }

        // CADENAS O CARACTERES

        } else if ((obj1 instanceof String || obj1 instanceof Character)

                && (obj2 instanceof String || obj2 instanceof Character)) {

            if (operacion == 4) {

                System.out.println("Resultado: " + obj1 + obj2);

            } else {

                System.out.println(

                    "Con cadenas o caracteres solo se puede concatenar."

                );

            }

        // BOOLEAN

        } else if (obj1 instanceof Boolean || obj2 instanceof Boolean) {

            System.out.println(

                "No se pueden realizar operaciones con Boolean."

            );

        } else {

            System.out.println("Los tipos de datos no son compatibles.");

        }

    }

}