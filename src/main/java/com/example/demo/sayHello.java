package com.example.demo;

import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sayhello")
public class sayHello {
	private static final Log log = LogFactory.getLog(sayHello.class);
	
	@GetMapping
	public Map<String,Object> sayHello(){
		if(log.isTraceEnabled()){
			log.trace("sayHello被调用了！"+new Date());
		}
		log.trace("sayHello被调用了2！"+new Date());
		Map<String,Object> result = new HashMap();
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(new Date());
		result.put("时间", calendar.getTime());
		return result;
	}
}
