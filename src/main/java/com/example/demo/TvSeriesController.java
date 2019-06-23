package com.example.demo;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RestController
//@RequestMapping("/helloworld")
//public class Helloworld {
//	@GetMapping
//	public Map<String, Object> sayHello() {
//		Map<String,Object> result = new HashMap<>();
//		result.put("message", "hello,world");
//		return result;
//	}
//}
@RestController
@RequestMapping("/tvseries")
public class TvSeriesController {
	private static final Log log = LogFactory.getLog(TvSeriesController.class);
	@GetMapping
	public List<TvSeriesDto> getAll() {
		if (log.isTraceEnabled()) {
			log.trace("getAll()被调用了");
		}
		List<TvSeriesDto> list = new ArrayList<>();
		Calendar calendar = Calendar.getInstance();
		calendar.set(2016, Calendar.OCTOBER, 2, 0, 0);
		list.add(new TvSeriesDto(1,"WestWorld",1,calendar.getTime()));


		return list;
	}
	

}