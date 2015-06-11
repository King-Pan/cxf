package com.mscncn.cxf.chapter01.client;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;

import com.mscncn.cxf.chapter01.HelloWorldImpl;
import com.mscncn.cxf.chapter01.HelloWorldImplPortType;

/**
 * Hello world!
 *
 */
public class CxfClient1 {
	public final static QName SERVICE = new QName("http://chapter01.cxf.mscncn.com/", "HelloWorldImpl");

	public static void main(String[] args) {
		URL wsdlURL = HelloWorldImpl.WSDL_LOCATION;
		if (args.length > 0 && args[0] != null && !"".equals(args[0])) {
			File wsdlFile = new File(args[0]);
			try {
				if (wsdlFile.exists()) {
					wsdlURL = wsdlFile.toURI().toURL();
				} else {
					wsdlURL = new URL(args[0]);
				}
			} catch (MalformedURLException e) {
				e.printStackTrace();
			}
		}
		HelloWorldImpl ss = new HelloWorldImpl(wsdlURL, SERVICE);
		HelloWorldImplPortType port = ss.getHelloWorldImplPort();

		{
			System.out.println("Invoking sayHello...");
			String name = "psz";
			java.lang.String _sayHello__return = port.sayHello(name);
			System.out.println("sayHello.result=" + _sayHello__return);

		}

		System.exit(0);

	}
}
