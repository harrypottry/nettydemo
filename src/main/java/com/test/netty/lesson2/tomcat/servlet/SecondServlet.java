package com.test.netty.lesson2.tomcat.servlet;


import com.test.netty.lesson2.tomcat.http.MyRequest;
import com.test.netty.lesson2.tomcat.http.MyResponse;
import com.test.netty.lesson2.tomcat.http.MyServlet;

public class SecondServlet extends MyServlet {

	public void doGet(MyRequest request, MyResponse response) throws Exception {
		this.doPost(request, response);
	}

	public void doPost(MyRequest request, MyResponse response) throws Exception {
		response.write("This is Second Serlvet");
	}

}
