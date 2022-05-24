import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;

public class RecorridoStax {
    public static void main(String[] args) {
        try {
            XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
            XMLEventReader xmlReader = xmlInputFactory.createXMLEventReader(new FileInputStream("empleados.xml"));
            int nDeEmpleados = 0;
            int sumaDeEdades = 0;
            int edadTotal;
            while(xmlReader.hasNext()){
                XMLEvent xmlEvent = xmlReader.nextEvent();
                if (xmlEvent.isAttribute()){
                    sumaDeEdades += Integer.getInteger(xmlEvent.toString());
                    nDeEmpleados++;
                }

            }
            if(nDeEmpleados > 0)System.out.println(sumaDeEdades/nDeEmpleados);




        }catch(Exception e){
            System.out.println(e);
        }
    }
}
