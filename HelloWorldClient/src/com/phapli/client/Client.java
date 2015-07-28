package com.phapli.client;

import java.net.MalformedURLException;
import java.net.URL;

import com.phapli.helloworld.HelloWorld;
import com.phapli.helloworld.HelloWorldImplService;

public class Client {

	public static void main(String[] args) {
		try {
			// init webservice port
			HelloWorldImplService service = new HelloWorldImplService(new URL(
					"http://localhost:8080/HelloWorld/HelloWorld?wsdl"));
			HelloWorld port = service.getHelloWorldImplPort();
			
			// call hello method
			String response = port.hello("phapli");

			System.out.println(response);

		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

}
