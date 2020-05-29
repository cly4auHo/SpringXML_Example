package itea;

import java.io.File;
import java.io.IOException;
import java.nio.file.attribute.AclEntry.Builder;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Source;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.w3c.dom.Document;
import org.xml.sax.SAXException;

public class ValidMain {

	
	public static void main(String[] args) {
		
	
	DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
	DocumentBuilder builder;
	try {
		builder = factory.newDocumentBuilder();
		Document document = builder.parse(new File("newX.xml"));
		
		SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
		Source s = new StreamSource(new File("valid.xsd"));
		Schema source = schemaFactory.newSchema(s);
		
		Validator validator = source.newValidator();
		validator.validate(new DOMSource(document));
		System.out.println("Okey");
	} catch (ParserConfigurationException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SAXException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
//	создать помнить, на базе помника создать обект такой 2 штуки(например обьем депенденси) и спарсить его(сакспарсер)
//	
}
