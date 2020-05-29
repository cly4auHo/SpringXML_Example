package itea;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class Dota2SAXParser extends DefaultHandler {
	List<Hero> heroList = new ArrayList<Hero>();
	Hero hero = new Hero();
	boolean name = false;
	boolean lvl = false;
	boolean ultimate = false;

	@Override
	public void startDocument() throws SAXException {
		System.out.println("Start");
		super.startDocument();
	}

	@Override
	public void endDocument() throws SAXException {
		System.out.println(heroList);
		System.out.println("End");
		super.endDocument();
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		if(qName.equals("hero")) {
		heroList.add(hero);
		hero = new Hero();
		}
		
		
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
//		System.out.println(qName);
//		if(attributes.getLength()>0) {
//		System.out.println(attributes.getValue(0));
//		}
		if (qName.equals("name")) {
			hero.setId(Integer.valueOf(attributes.getValue(0)));
			name = true;
//			if(attributes.getLength()>0) {
//				System.out.println(attributes.getValue(0));
//				}
		} else if(qName.equals("lvl")) {
			lvl = true;
		} else if(qName.equals("ult")) {
			ultimate = true;
		}
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		String value = "";
		for (int i = start; i < start + length; i++) {
			value += ch[i];
		}
		value = value.trim();
		if (value.length() > 0) {
			System.out.println(value);
		}
		if(name) {
			hero.setName(value);
			name = false;
		
		} else if(lvl) {
			hero.setLvl(Integer.valueOf(value));
			lvl = false;
		}  else if(ultimate) {
			hero.setUltimate((value));
			ultimate = false;
		}
	}

}
