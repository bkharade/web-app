package com.bbk.webtest;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class IndexController 
{

	@Autowired
    Environment environment;
	
	@RequestMapping("/")
	public String getHome() 
	{
		return "index.html";
	}
	
	@RequestMapping("/hello")
	public @ResponseBody String getcustomHome()
	{
		
		String hostName = null;
		try {
			hostName = InetAddress.getLocalHost().getHostAddress();
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return "Hello from Spring boot from host -" + hostName;
		
	}
	
	
}
