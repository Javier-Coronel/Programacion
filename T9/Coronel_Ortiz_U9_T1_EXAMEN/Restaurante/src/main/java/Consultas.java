import java.sql.*;
import java.util.*;


public class Consultas {
    static Connection connection;
    public static void main(String[] args) {
        try{
        connection = DriverManager.getConnection("jdbc:mariadb://localhost:3336/classicmodels?user=root&password=root&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");

        CategoriaMasVendida();
        }catch (Exception e){
            System.out.println(e);
        }


        try {
            PreparedStatement ps = connection.prepareStatement("select * from products");
            ResultSet resultSet = ps.executeQuery();
            resultSet.first();
            resultSet.next();
            resultSet.next();
            System.out.println(resultSet.getString(1));
            System.out.println(resultSet.getString(2));
            System.out.println(resultSet.getString(3));
        }catch (Exception e){
            System.out.println(e);
        }
    }
    /*public static void ArrayList getProductLines(){
        ArrayList<ProductLine> productLineList = new ArrayList<ProductLine>();
        try{

            PreparedStatement ps = connection.prepareStatement("select * from productlines");
            ResultSet resultSet = ps.executeQuery();
            resultSet.first();
            while (resultSet.next()){
                ProductLine productLine = new ProductLine(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3))
                productLineList.add(productLine);
            }

        }catch (Exception e){}
        return productLineList;
    }*/
    public static void CategoriaMasVendida(){
        try {
            PreparedStatement ps = connection.prepareStatement("select pl.productLine from productlines pl inner join products p on pl.productLine = p.productLine " +
                    "inner join orderdetails od on od.productCode = p.productCode " +
                    " group by pl.productLine order by sum(quantityOrdered) limit 1");
            ResultSet resultSet = ps.executeQuery();
            resultSet.first();
            System.out.println(resultSet.getString(1));
        }catch (Exception e){
            System.out.println(e);
        }

    }
}
