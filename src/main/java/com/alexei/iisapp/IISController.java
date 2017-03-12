package com.alexei.iisapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.slf4j.*;

@Controller
@RequestMapping("/hello")
public class IISController {
	Logger logger = LoggerFactory.getLogger(IISController.class);
	
	@RequestMapping(method = RequestMethod.GET)
	public String hello() {
		logger.info("load hello");
		return "hello";
	}
}
