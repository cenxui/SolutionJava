package xml;

import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;

public class SolutionXMLWriter {

	public static void main(String[] args) {
		XMLOutputFactory xof = XMLOutputFactory.newInstance();
		XMLStreamWriter  xtw  = null;
		try {
			xtw = xof.createXMLStreamWriter(
							new OutputStreamWriter(System.out, StandardCharsets.UTF_8));
			xtw.writeComment("Cenxui test xml");
			xtw.writeStartDocument("utf-8", "1.0");
			xtw.writeComment("all elements here are explicitly in the HTML namespace");
			xtw.writeStartDocument("utf-8","1.0");
			xtw.setPrefix("html", "http://www.w3.org/TR/REC-html40");
			xtw.writeStartElement("http://www.w3.org/TR/REC-html40","html");
			xtw.writeNamespace("html", "http://www.w3.org/TR/REC-html40");
			xtw.writeStartElement("http://www.w3.org/TR/REC-html40", "head");
			xtw.writeStartElement("http://www.w3.org/TR/REC-html40", "title");
			xtw.writeCharacters("Frobnostication");
			xtw.writeEndElement();
			xtw.writeEndElement();

			xtw.writeStartElement("http://www.w3.org/TR/REC-html40", "body");
			xtw.writeStartElement("http://www.w3.org/TR/REC-html40", "p");
			xtw.writeCharacters("Moved to");
			xtw.writeStartElement("http://www.w3.org/TR/REC-html40", "a");
			xtw.writeAttribute("href","http://frob.com");
			xtw.writeCharacters("here");
			xtw.writeEndElement();
			xtw.writeEndElement();
			xtw.writeEndElement();
			xtw.writeEndElement();
			xtw.writeEndDocument();
			xtw.flush();
		} catch (XMLStreamException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (xtw != null) {
					xtw.close();
				}
			} catch (XMLStreamException e) {
				e.printStackTrace();
			}
		}
	}
}
