package com.webApplication.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.webApplication.demo.pojo.Branch;

@Controller
public class HomeController {
	@Autowired
	Branch branch;

	@RequestMapping("home")
	public String home() {
		System.out.println("Hello Home Controller");
		branch.getInfo();
		return "home";
	}
}
