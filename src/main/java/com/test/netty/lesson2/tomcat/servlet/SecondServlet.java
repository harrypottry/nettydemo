package com.test.netty.lesson2.tomcat.servlet;


import com.test.netty.lesson2.tomcat.http.GPRequest;
import com.test.netty.lesson2.tomcat.http.GPResponse;
import com.test.netty.lesson2.tomcat.http.GPServlet;

public class SecondServlet extends GPServlet {

	public void doGet(GPRequest request, GPResponse response) throws Exception {
		this.doPost(request, response);
	}

	public void doPost(GPRequest request, GPResponse response) throws Exception {
		response.write("This is Second Serlvet");
	}

}
