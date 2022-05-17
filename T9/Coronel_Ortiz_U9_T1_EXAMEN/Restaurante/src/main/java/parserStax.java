import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.TreeMap;

public class parserStax {

    public static void main(String[] args) {
        TreeMap<String, String> platos = new TreeMap<>();
//                int menorCalorias
        try{
            XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
            XMLEventReader xmlReader = xmlInputFactory.createXMLEventReader(new FileInputStream("examen.xml"));
            while(!xmlReader.nextEvent().isEndDocument()){
                if (xmlReader.nextTag().isAttribute()){
                }
            }


        }
        catch (Exception e){

        }
    }



}
