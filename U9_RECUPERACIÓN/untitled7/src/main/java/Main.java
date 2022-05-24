import java.sql.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> a = new Consultas().getProducts(20000D);
        System.out.println(a.get(1).toString());
        new Consultas().insertarOficina();
    }
}
