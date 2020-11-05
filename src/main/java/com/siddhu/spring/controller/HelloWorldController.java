package com.siddhu.spring.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


/**
 * @author shdhumale
 */
@Controller
public class HelloWorldController {
	@RequestMapping(path={"/"},method=RequestMethod.GET)
	//@Autowired
	@PreAuthorize("hasRole('Users')")
	public String sayHello(Model model) {
		model.addAttribute("message","Hello Spring MVC!");

		//Java 8 LocalDate
		DateTimeFormatter formatter=DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
		LocalDate date=LocalDate.now();
		model.addAttribute("date", date.format(formatter));

		return "index";
	}

	
}
