import java.util.Scanner;

public class ejemplo8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] arreglo = new int[5];
        int valor;
        int i;

        System.out.println("--- 1. Llenado con FOR ---");
        for (i = 0; i < arreglo.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            valor = teclado.nextInt();
            arreglo[i] = valor;
        }

        System.out.println("\n--- Resultados con FOR ---");
        for (i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }

        System.out.println("\n--- 2. Llenado con WHILE ---");
        i = 0;
        while (i < arreglo.length) {
            System.out.print("Número " + (i + 1) + ": ");
            valor = teclado.nextInt();
            arreglo[i] = valor;
            i++;
        }

        System.out.println("\n--- Resultados con WHILE ---");
        i = 0;
        while (i < arreglo.length) {
            System.out.println(arreglo[i]);
            i++;
        }

        System.out.println("\n--- 3. Llenado con WHILE (TRUE) Y BREAK ---");
        i = 0;
        while (true) {
            System.out.print("Número " + (i + 1) + ": ");
            valor = teclado.nextInt();
            arreglo[i] = valor;
            i++;
            if (i >= arreglo.length) {
                break;
            }
        }

        System.out.println("\n--- Resultados con FOR-EACH ---");
        for (int elemento : arreglo) {
            System.out.println(elemento);
        }

        teclado.close();
    }
}
