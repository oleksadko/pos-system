package com.no3.epos.utility;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class XMLReader {
    static Document doc;

    public XMLReader(){
        load_file();
    }

    private void load_file() {
        try {
            File file = new File("C:\\Folders\\Personal Projects\\Java\\no3\\src\\main\\resources\\xml\\food.xml");
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            doc = db.parse(file);
            doc.getDocumentElement().normalize();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List<Element> getNodes(String tagName) {
        System.out.println("Root element: " + doc.getDocumentElement().getNodeName());
        //get the category element, e.g. fishnchips, calzone...
        NodeList nodeList = doc.getElementsByTagName(tagName);
        List<Element> elements = new ArrayList<>();
        for (int itr = 0; itr < nodeList.getLength(); itr++) {
            //select individual element
            Node categoryNode = nodeList.item(itr);
            System.out.println("\nNode Name: " + categoryNode.getNodeName());
            if (categoryNode.getNodeType() == Node.ELEMENT_NODE) {
                NodeList itemNodeList = ((Element) categoryNode).getElementsByTagName("item");
                //iterate through all elements named item and get its children
                for (int itemitr = 0; itemitr < itemNodeList.getLength(); itemitr++) {
                    Node itemNode = itemNodeList.item(itemitr);
                    Element eElement = (Element) itemNode;
                    elements.add(eElement);
                    System.out.println(eElement.getNodeName());
                    System.out.println("id: " + eElement.getAttribute("id"));
                    System.out.println("Name: " + eElement.getElementsByTagName("name").item(0).getTextContent());
                    System.out.println("Price: " + eElement.getElementsByTagName("price").item(0).getTextContent());
                }
            }
        }
        return elements;
    }
}