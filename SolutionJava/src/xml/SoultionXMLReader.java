package xml;

import static java.lang.System.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.xml.stream.StreamFilter;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.events.XMLEvent;

public class SoultionXMLReader {
	public static void main(String[] args) {
		String filename = "c:\\text\\bookxml.txt";
		XMLInputFactory factory = XMLInputFactory.newInstance();
		out.println("FACTORY: " + factory);
		try {
			XMLEventReader r = factory.createXMLEventReader
			        (filename, new FileInputStream(filename));
			while (r.hasNext()) {
			    XMLEvent e = r.nextEvent();
			    System.out.println(e.toString());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (XMLStreamException e) {
			e.printStackTrace();
		}
                
	}
	
	public final static String getEventTypeString(int eventType) {
	    switch (eventType) {
	        case XMLEvent.START_ELEMENT:
	            return "START_ELEMENT";

	        case XMLEvent.END_ELEMENT:
	            return "END_ELEMENT";

	        case XMLEvent.PROCESSING_INSTRUCTION:
	            return "PROCESSING_INSTRUCTION";

	        case XMLEvent.CHARACTERS:
	            return "CHARACTERS";

	        case XMLEvent.COMMENT:
	            return "COMMENT";

	        case XMLEvent.START_DOCUMENT:
	            return "START_DOCUMENT";

	        case XMLEvent.END_DOCUMENT:
	            return "END_DOCUMENT";

	        case XMLEvent.ENTITY_REFERENCE:
	            return "ENTITY_REFERENCE";

	        case XMLEvent.ATTRIBUTE:
	            return "ATTRIBUTE";

	        case XMLEvent.DTD:
	            return "DTD";

	        case XMLEvent.CDATA:
	            return "CDATA";

	        case XMLEvent.SPACE:
	            return "SPACE";
	    }
	    return "UNKNOWN_EVENT_TYPE," + eventType;
	}
}
