package service;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;

import javax.xml.parsers.*;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

/*
 * 지역 코드 파싱
 * */

public class SigunParser {
	public ArrayList<HashMap<String, Object>> parserTest() throws ParserConfigurationException,UnsupportedEncodingException{
		ArrayList<HashMap<String, Object>> testList = new ArrayList<HashMap<String,Object>>();
		
		String addr = "http://api.visitkorea.or.kr/openapi/service/rest/KorService/areaCode?ServiceKey=";
		String serviceKey = "irqglLi1gisI6SuWlVdGZcdGGffwI7ZSmgzhLB4bdWSaPeRPsGqkD7IbkQFI18JgOmG%2BGWCdh5eDW12ZBKoANQ%3D%3D";
		String parameter = "";
		
		parameter = parameter + "&" +"numOfRows=50";
		parameter = parameter + "&" +"pageSize=50";
		parameter = parameter + "&" +"pageNo=1";
		parameter = parameter + "&" +"startPage=1";
		parameter = parameter + "&" + "MobileOS=ETC";
		parameter = parameter + "&" + "MobileApp=AppTest";
		parameter = parameter + "&" + "areaCode=31";
		
		addr = addr + serviceKey + parameter;
		System.out.println("@@SigunParser addr @@" + addr);
		
		DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();
		DocumentBuilder parser = f.newDocumentBuilder();
		
		//XML 파일 파싱 단계
		Document xmlDoc = null;
		String parseUrl = addr;
		
		try {
			xmlDoc = parser.parse(parseUrl);
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Element root = xmlDoc.getDocumentElement();
		
		int length = root.getElementsByTagName("code").getLength();
		
		for(int i = 0; i<length;i++){
			Node code = root.getElementsByTagName("code").item(i);
			Node name = root.getElementsByTagName("name").item(i);
			
			HashMap<String,Object> parseTest = new HashMap<String, Object>();
			parseTest.put("code", code.getTextContent());
			parseTest.put("name", name.getTextContent());
			testList.add(parseTest);
		}
		return testList;
	}
}
