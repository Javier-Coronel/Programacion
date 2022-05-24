import org.w3c.dom.Document;

import javax.xml.parsers.*;
import java.io.File;

public class ModificacionDOM {
    public static void main(String[] args) {
        try{
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document document = db.parse(new File("empleados.xml"));

        }catch(Exception e){

        }
    }
}
