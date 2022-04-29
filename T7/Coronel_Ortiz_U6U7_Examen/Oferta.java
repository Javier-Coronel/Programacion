import java.util.TreeSet;

public class Oferta implements Comparable{
    private int codigo;
    private String descripcion;
    private TreeSet<Trabajador> trabajadores;
    private boolean cubierta;

    public Oferta(int codigo, String descripcion, boolean cubierta) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.trabajadores = new TreeSet<Trabajador>();
        this.cubierta = cubierta;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public TreeSet<Trabajador> getTrabajadores() {
        return trabajadores;
    }

    public void setTrabajadores(TreeSet<Trabajador> trabajadores) {
        this.trabajadores = trabajadores;
    }

    public boolean isCubierta() {
        return cubierta;
    }

    public void setCubierta(boolean cubierta) {
        this.cubierta = cubierta;
    }



    @Override
    public String toString() {
        return "Oferta{" +
                "codigo=" + codigo +
                ", descripcion='" + descripcion + '\'' +
                ", cubierta=" + cubierta +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Oferta a = (Oferta) o;
        return this.getTrabajadores().size()-a.getTrabajadores().size();
    }
}
