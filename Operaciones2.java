public class Operaciones2<T> {

    private T obj1;
    private T obj2;

    public void operar(String operacion) {

        if (obj1 instanceof Number && obj2 instanceof Number) {

            double num1 = ((Number) obj1).doubleValue();
            double num2 = ((Number) obj2).doubleValue();

            if (operacion.equalsIgnoreCase("suma")) {
                System.out.println("Resultado suma: " + (num1 + num2));

            } else if (operacion.equalsIgnoreCase("resta")) {
                System.out.println("Resultado resta: " + (num1 - num2));

            } else if (operacion.equalsIgnoreCase("multiplicacion")) {
                System.out.println("Resultado multiplicacion: " + (num1 * num2));

            } else {
                System.out.println("Operación no válida.");
            }

        } else if ((obj1 instanceof String || obj1 instanceof Character) &&
                   (obj2 instanceof String || obj2 instanceof Character)) {

            if (operacion.equalsIgnoreCase("concatenar")) {
                System.out.println("Resultado: " + obj1 + obj2);
            } else {
                System.out.println("Con cadenas o caracteres solo se puede concatenar.");
            }
        } else if (obj1 instanceof Boolean || obj2 instanceof Boolean) {

            System.out.println("No se pueden realizar operaciones con Boolean.");

        } else {

            System.out.println("Los tipos de datos no son compatibles.");
        }
    }

    public static void main(String[] args) {

        Operaciones<Integer> objNumeros =
                new Operaciones<>(27, 13);

        objNumeros.operar("suma");
        objNumeros.operar("resta");
        objNumeros.operar("multiplicacion");

        System.out.println();

        Operaciones<String> objCadenas =
                new Operaciones<>("Hola ", "Como estas?");

        objCadenas.operar("concatenar");

        System.out.println();

        Operaciones<Boolean> objBooleanos =
                new Operaciones<>(true, false);

        objBooleanos.operar("suma");
    }
}
    


    

