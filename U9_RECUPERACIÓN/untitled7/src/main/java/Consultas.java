import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Consultas {
    public List<Product> getProducts(Double price){
        List<Product> a = new ArrayList<Product>();
        try{
            Connection connection = new ConexionDB().getConnection();
            PreparedStatement ps = connection.prepareStatement("select * from products where buyPrice < ?");
            ps.setString(1, price.toString());
            ResultSet rs = ps.executeQuery();
            while (rs.next()){
                a.add(new Product(rs.getString(1), rs.getString(2), rs.getString(3),rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7), rs.getDouble(8), rs.getDouble(9)));
            }
            rs.close();
            ps.close();
            connection.close();
        }catch(Exception e){
            System.out.println(e);
        }
        return a;
    }
    public void insertarOficina(){
        try{
        Connection connection = new ConexionDB().getConnection();
        connection.setAutoCommit(false);
        PreparedStatement ps = connection.prepareStatement("insert into offices values(?, ?, ?, ?, ?, ?, ?, ?, ?)");
            ps.setString(1, "nvOficina");
            ps.setString(2, "rge");
            ps.setString(3, "rge");
            ps.setString(4, "sfd");
            ps.setString(5, "ytj");
            ps.setString(6, "dwq");
            ps.setString(7, "fdg");
            ps.setString(8, "yumk");
            ps.setString(9, "xcv");
        ps.executeUpdate();
        ps = connection.prepareStatement("insert into employees values(?, ?, ?, ?, ?, ?, ?, ?)");
            for (int i = 1; i <= 2; i++) {
                ps.setInt(1, 89 * i);
                ps.setString(2, "hgj");
                ps.setString(3, "uyi");
                ps.setString(4, "ytm");
                ps.setString(5, "sadf");
                ps.setString(6, "nvOficina");
                ps.setInt(7, 1002);
                ps.setString(8, "tdfgbdtgd");
                ps.executeUpdate();
            }

        connection.commit();
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
