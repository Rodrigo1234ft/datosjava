import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Practica3 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        List<Ejem10Dato> lista = new ArrayList<>();

        System.out.print("¿Cuántos elementos deseas capturar?: ");
int cantidad = teclado.nextInt();
teclado.nextLine();

for (int i = 0; i < 3; i++) {

    System.out.println("\nElemento " + (i + 1));

    System.out.print("Nombre: ");
    String nombre = teclado.nextLine();

    System.out.print("Edad: ");
    int edad = teclado.nextInt();
    teclado.nextLine();

    System.out.print("Correo: ");
    String correo = teclado.nextLine();

}
    }
}