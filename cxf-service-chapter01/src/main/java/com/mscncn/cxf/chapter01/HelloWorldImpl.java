package com.mscncn.cxf.chapter01;

public class HelloWorldImpl implements IHelloWorld {

	public String sayHello(String name) {
		return "hello "+name;
	}

}
