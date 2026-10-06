import java.util.ArrayList;
import java.util.List;

public class Ejem10Dinamico {
    public static void main(String[] args) {
        List<Ejem10Dato> lista = new ArrayList<>();
        lista.add(new Ejem10Dato("Juan", 25, "juan@example.com"));  
        lista.add(new Ejem10Dato("María", 30, "maria@example.com"));
        lista.add(new Ejem10Dato("Pedro", 35, "pedro@example.com"));
        lista.add(new Ejem10Dato("Ana", 28, "ana@example.com"));

        for (Ejem10Dato persona : lista) {
            System.out.println("Nombre: " + persona.getNombre());
            System.out.println("Edad: " + persona.getEdad());
            System.out.println("Correo: " + persona.getCorreo());
            System.out.println();
        }
    }
}