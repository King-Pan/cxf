package com.mscncn.cxf.chapter01;

import org.apache.cxf.frontend.ServerFactoryBean;

/**
 * Hello world!
 *
 */
public class CxfServer1 
{
    public static void main( String[] args )
    {
    	 //1. 第一种启动cxf的方式
        System.out.println("第一种启动cxf的方式");
        ServerFactoryBean factory=new ServerFactoryBean();
        factory.setAddress("http://localhost:8080/helloworld");
        factory.setServiceClass(HelloWorldImpl.class);
        factory.setServiceBean(new HelloWorldImpl());
        factory.create();
        System.out.println("cxf service 启动成功");
         
        //2. 第二种启动cxf的方式  jar ws 自带
        /*
          HelloWorldImpl implementor= new HelloWorldImpl();
          String address="http://localhost:8080/helloworld";
          Endpoint.publish(address, implementor);
          System.out.println("web service started");*/
    }
}
