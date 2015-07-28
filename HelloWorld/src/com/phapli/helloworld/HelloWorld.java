package com.phapli.helloworld;

/*
 * @author: phapli
 */

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface HelloWorld {

	@WebMethod
	public String hello(@WebParam(name = "name") String name);

}
