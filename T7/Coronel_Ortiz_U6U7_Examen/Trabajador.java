import java.util.Objects;

public class Trabajador implements Comparable{
    private String dni;
    private String nombre;
    private String apellidos;
    private int edad;
    private String formacionAcademica;

    public Trabajador(String dni, String nombre, String apellidos, int edad, String formacionAcademica) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.formacionAcademica = formacionAcademica;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getFormacionAcademica() {
        return formacionAcademica;
    }

    public void setFormacionAcademica(String formacionAcademica) {
        this.formacionAcademica = this.formacionAcademica;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trabajador that = (Trabajador) o;
        return edad == that.edad && dni.equals(that.dni) && Objects.equals(nombre, that.nombre) && Objects.equals(apellidos, that.apellidos) && Objects.equals(formacionAcademica, that.formacionAcademica);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dni, nombre, apellidos, edad, formacionAcademica);
    }

    @Override
    public String toString() {
        return "Trabajador{" +
                "dni='" + dni + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                ", formacionAcademica='" + formacionAcademica + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Trabajador a = (Trabajador) o;
        if (a.getApellidos().equals(this.getApellidos())){
            return this.getNombre().compareTo(a.getNombre());
        }
        return this.getApellidos().compareTo(a.getApellidos());
    }


}
