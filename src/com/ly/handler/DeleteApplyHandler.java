package com.ly.handler;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class DeleteApplyHandler extends DefaultHandler {

	private String val="";	
	private String id;
	private String hostid;
	private String otherid;
	public String getHostid() {
		return hostid;
	}
	public void setHostid(String hostid) {
		this.hostid = hostid;
	}
	public String getOtherid() {
		return otherid;
	}
	public void setOtherid(String otherid) {
		this.otherid = otherid;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
//	 @Override
//	public void startDocument() throws SAXException {
//		// TODO Auto-generated method stub
//		super.startDocument();
//	}
	@Override
	public void startElement(String uri, String localName, String qName,
			Attributes attributes) throws SAXException {
		// TODO Auto-generated method stub

		super.startElement(uri, localName, qName, attributes);
	}
	@Override
	public void endElement(String uri, String localName, String qName)
			throws SAXException {
		// TODO Auto-generated method stub
		if(qName.equals("uid"))
		{
			this.id = val;
			
			
		}
		if(qName.equals("hostid"))
		{
			this.hostid = val;
			
			
		}
		if(qName.equals("otherid"))
		{
			this.otherid = val;
			
			
		}
		
		
		
		val="";
		super.endElement(uri, localName, qName);
	}
	
	@Override
	public void characters(char[] ch, int start, int length)
			throws SAXException {
		// TODO Auto-generated method stub
		
		val+= new String(ch,start,length);
		super.characters(ch, start, length);
		
	}
}
