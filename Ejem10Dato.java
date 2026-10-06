public class Ejem10Dato {
    String nombre;
    int edad;  
    String correo;

    public Ejem10Dato(String nombre, int edad, String correo) {
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
    }
    public Ejem10Dato() {}

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;    
    }
    public String getCorreo() {
        return correo;
    }
}