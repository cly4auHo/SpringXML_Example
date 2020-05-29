package itea;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;


public class App {  
	
	//DOM Parser 
	public static void main( String[] args ) {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.parse(new File("dota.xml"));
			NodeList nodeList = document.getElementsByTagName("hero");
			NodeList nodeName = document.getElementsByTagName("name");
			NodeList nodeLvl = document.getElementsByTagName("lvl");
			NodeList nodeUltimate = document.getElementsByTagName("ult");
//			Node node = nodeList.item(1);
			
			List<Hero> heroList = new ArrayList<Hero>();
			
			for(int i=0; i<nodeList.getLength();i++) {
				Node node = nodeList.item(i);
				Hero hero = new Hero();
				hero.setName(nodeName.item(i).getTextContent());
				hero.setLvl(Integer.valueOf(nodeLvl.item(i).getTextContent()));
				hero.setUltimate(nodeUltimate.item(i).getTextContent());
//				System.out.println(hero);
				heroList.add(hero);
//				Node childNode = node.getChildNodes().item(5);
//				System.out.println(childNode.getTextContent());
				
			}
			System.out.println(heroList);
//			for(int i=0; i<nodeList.getLength();i++) {
//				Node node = nodeList.item(i);
//				for (int j = 0; j < node.getChildNodes().getLength(); j++) {
//					Node childNode = node.getChildNodes().item(j);
//					System.out.println(childNode.getNodeName() + " : "+ childNode.getTextContent());
//				}
////				System.out.println(node.getTextContent());
//			}
			
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
}
