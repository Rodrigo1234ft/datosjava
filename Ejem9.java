import java.util.ArrayList;
import java.util.List;

public class Ejem9 {
    
public static void main(String[] args) {
    List<Integer> obj1 = new ArrayList<Integer>();
    obj1.add(5);
    obj1.add(10);
    obj1.add(15);
    obj1.add(20);
    obj1.add(25);

for (int i = 0; i < obj1.size(); i++) {
        System.out.println("Elemento en la posición " + i + ": " + obj1.get(i));
    }

    System.out.println("Elementos de la lista: " + obj1);

    System.out.println("Valor en la posicion 2: " + obj1.get(2));

    for (Integer elemento : obj1) {
        System.out.println("Valor del Elemento: " + elemento);
    }
 }
}
