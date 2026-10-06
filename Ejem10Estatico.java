public class Ejem10Estatico {
    public static void main(String[] args) {
        Ejem10Dato obj1 = new Ejem10Dato("Juan", 25, "juan@example.com");
        System.out.println("Nombre: " + obj1.getNombre());
        System.out.println("Edad: " + obj1.getEdad());
        System.out.println("Correo: " + obj1.getCorreo());

        Ejem10Dato obj2 = new Ejem10Dato();
        obj2.setNombre("María");
        obj2.setEdad(30);
        obj2.setCorreo("maria@example.com");
        System.out.println("Nombre: " + obj2.getNombre());
        System.out.println("Edad: " + obj2.getEdad());
        System.out.println("Correo: " + obj2.getCorreo());
    }
}
