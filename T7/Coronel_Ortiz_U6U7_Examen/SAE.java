import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeMap;

public class SAE {
    TreeMap<Integer, Oferta> ofertas;

    public SAE() {
        this.ofertas = new TreeMap<Integer, Oferta>();
    }
    public boolean addOferta(Oferta o){
        if (ofertas.containsKey(o.getCodigo())){
            return false;
        }
        ofertas.put(o.getCodigo(), o);
        return true;
    }
    public boolean addTrabajador(Integer codigo, Trabajador t){
        if (ofertas.get(codigo).getTrabajadores().contains(t)){
            return false;
        }
        ofertas.get(codigo).getTrabajadores().add(t);
        return true;
    }
    public boolean removeTrabajador(Integer codigo, Trabajador t){
        if (!ofertas.get(codigo).getTrabajadores().contains(t)){
            return false;
        }
        ofertas.get(codigo).getTrabajadores().remove(t);
        return true;
    }
    public void mostrarTrabajadores(Integer codigo){
        if (ofertas.get(codigo).getTrabajadores().isEmpty()){
            System.out.println("No existen trabajadores inscritos");
        } else {
            System.out.println(ofertas.get(codigo).getTrabajadores());
        }
    }
    public void mostrarTrabajadoresXEdad(Integer codigo){
        if (ofertas.get(codigo).getTrabajadores().isEmpty()){
            System.out.println("No existen trabajadores inscritos");
        } else {
            Trabajador[] a = ofertas.get(codigo).getTrabajadores().toArray(new Trabajador[ofertas.get(codigo).getTrabajadores().size()]);
            Arrays.sort(a, new Comparator<Trabajador>() {
                @Override
                public int compare(Trabajador trabajador, Trabajador t1) {
                    if (trabajador.getEdad() == t1.getEdad()){
                        return trabajador.compareTo(t1);
                    }
                    return trabajador.getEdad() - t1.getEdad();
                }
            });
            System.out.println(Arrays.toString(a));
        }
    }
    public int cantidadOfertas(String dni){
        int a = 0;

        for (int i = 1; i < ofertas.size()+1; i++) {
            Trabajador[] b = ofertas.get(i).getTrabajadores().toArray(new Trabajador[ofertas.get(i).getTrabajadores().size()]);
            for (int j = 0; j < b.length; j++) {
                if (b[j].getDni().equals(dni))a++;
            }
        }
        return a;
    }
    public void mostrarOfertas(){
        Object[] a = ofertas.values().toArray();

        Arrays.sort(a, new Comparator<Object>() {

            @Override
            public int compare(Object o, Object t1) {
                Oferta a = (Oferta)o;
                Oferta b = (Oferta) t1;
                return b.getTrabajadores().size() - a.getTrabajadores().size();
            }
        });
        System.out.println(Arrays.toString(a));
    }
    public void guardarDatos(){
        try{

        }catch (Exception e){

        }
    }
    public void cargarDatos(){
        try{

        }catch (Exception e){

        }
    }
}
