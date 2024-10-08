
package Clases;

public class Persona {
    private static int codigo =1;
    private String apellidos;
    private String nombres;
    private String dni;

    public static int getCodigo() {
        return codigo;
    }

    public static void setCodigo(int codigo) {
        Persona.codigo = codigo;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Persona() {
        Persona.codigo++;
    }

    public Persona(String apellidos, String nombres, String dni) {
        Persona.codigo++;
        this.apellidos = apellidos;
        this.nombres = nombres;
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Persona{" + "apellidos=" + apellidos + ", nombres=" + nombres + ", dni=" + dni + '}';
    }
    
}
