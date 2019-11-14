package com.example.dummy;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/dummy")
@RestController
public class DummyController {

	
	@RequestMapping(method = RequestMethod.GET)
	public String info() {
		return "The demo Project";
	}
}
