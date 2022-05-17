import java.sql.*;

public class Transacciones {
    public static void main(String[] args) {
        insertarPedido();
    }
    public static void insertarPedido(){
        try{
            Connection connection;
            connection = DriverManager.getConnection("jdbc:mariadb://localhost:3336/classicmodels?user=root&password=root&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
            connection.setAutoCommit(false);
            PreparedStatement ps = connection.prepareStatement("insert into orders orderNumber, orderDate, requiredDate, shippedDate, status, comments, customerNumber values (?,?,?,?,?,?,?)");
            ps.setInt(1, 2246873);
            ps.setDate(2, Date.valueOf("01/01/2020"));
            ps.setDate(3, Date.valueOf("01/01/2020"));
            ps.setDate(4, Date.valueOf("01/01/2020"));
            ps.setString(5, "deliver");
            ps.setString(6,"");
            ps.setInt(7, 3);
            ps.executeUpdate();
            ps = connection.prepareStatement("insert into orderdetails orderNumber, productCode, quantityOrdered, priceEach, orderLineNumber values (?,?,?,?,?)");
            ps.setInt(1, 2246873);
            ps.setString(2, "S10_1678");
            ps.setInt(3, 43);
            ps.setDouble(4, 3);
            ps.setInt(5, 3);
            ps.executeUpdate();
            ps = connection.prepareStatement("insert orderNumber, productCode, quantityOrdered, priceEach, orderLineNumber into orderdetails values (?,?,?,?,?)");
            ps.setInt(1, 2246873);
            ps.setString(2, "1");
            ps.setInt(3, 43);
            ps.setDouble(4, 3);
            ps.setInt(5, 3);
            ps.executeUpdate();



            connection.commit();

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
