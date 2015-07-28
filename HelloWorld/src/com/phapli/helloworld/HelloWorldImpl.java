package com.phapli.helloworld;

/*
 * @author: phapli
 */

import javax.jws.WebService;

@WebService(endpointInterface = "com.phapli.helloworld.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

	@Override
	public String hello(String name) {
		return "Hello " + name;
	}

}
